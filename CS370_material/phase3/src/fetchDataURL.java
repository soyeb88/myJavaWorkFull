import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fetchDataURL {
	
	final String initialSet   = "https://store.nba.com/";  
		
	// Parameter Set
    String searchItem;
    String location;

	//default constructor
	public fetchDataURL(){
		searchItem = "query=";		
	}

	public void set_terms (String x) {
	       searchItem += x;
	}
	
	public String setURL() {
		return searchItem = initialSet + "?"+ searchItem; 
	}
		
	
	public void fetchProductData(){	
        //Extract a specific Data from Website
		//String extrData = "";
		
		//save file
		BufferedWriter bw = null;
    	FileWriter fw = null;
    	
    	// Save query to another folder
        String queryFolder = "queries";
        Path queryPath = Paths.get(queryFolder);
        
        // If directory doesn't exist, create the folder
        if (!Files.exists(queryPath)) {
            // Try block
            try {
                Files.createDirectories(queryPath);
            }
            // Exception handler
            catch (IOException e) {
                e.printStackTrace();
            }
        }
                
        // Query filename - by time
        DateFormat dateFormat = new SimpleDateFormat("MMddyyyy-HHmmss");
        String queryRunDT = dateFormat.format(new Date());
        String queryResult = queryFolder + "/" + queryRunDT + ".txt";
        
        set_queryLocation(queryResult);
        
    	try {
			fw = new FileWriter(queryResult);
			bw = new BufferedWriter(fw);
		} 
    	catch (IOException e) {
			e.printStackTrace();
		} 
		
		String finalresult="";
		String table = "";
				
		BufferedReader reader = null;
		
		try{
			String line;

			URL url = new URL(setURL()); //connect URL
			reader = new BufferedReader(new InputStreamReader(url.openStream())); //open html page

            Pattern test = Pattern.compile("(?<=\"\\@type\":\"Product\",)(.*)"
            		+ "(?=<\\/script><\\/div><\\/div><\\/div><script>)"); 
            														
            
			while((line=reader.readLine()) != null){
				Matcher result = test.matcher(line);

				if (result.find())
					finalresult = result.group(); //assign matches texts
			}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		

		String part1 [] = finalresult.split(","); //spllit by ,
		//String imgInfo = "";

		try{
			Pattern ItemURLMatch = Pattern.compile("(?<=\"\\@id\":\")(.*)(?=\")");
			for(int i=0;i<100;i++){
				Matcher ItemURL = ItemURLMatch.matcher(part1[i]);
								
				if (ItemURL.find()){ 					
					readPage(ItemURL.group(), bw, queryRunDT);
				}

			}	
		reader.close();
		}
		// Catch block
        catch(IOException e) {
            e.printStackTrace();
        }
		
	     // Once operations are done, close out the readers
        finally {
            try {
                if (bw != null)
                	bw.close();             	
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
	
	
	//set file location 
	void set_queryLocation(String x){
		location = x;
	}
	String get_queryLocation(){
		return location;
	}
	
	int count=0;
	
	void readPage(String x, BufferedWriter bw, String queryRunDT){ 
		String table = "";
		String finalresult1 = "";
		String finalresult2 = "";
		BufferedReader rdr = null;
		String line1;
		
		//create getImage instance
		imageFatch getImage = new imageFatch();
		try{
			URL url = new URL(x);
			rdr = new BufferedReader(new InputStreamReader(url.openStream()));
			
			
			//<meta property="og:title" content="
			
			//"/><meta property="og:type"
						
			Pattern productName = Pattern.compile("(?<=<meta\\sproperty=\"og:title\"\\scontent=\")(.*)"
            		+ "(?=\"\\/><meta\\sproperty=\"og:type\")");
			
			Pattern productId = Pattern.compile("(?<=Product\\sID:\\s)(.*)"
            		+ "(?=<\\/span><meta)");
			
			Pattern priceMatch = Pattern.compile("(?<=<div\\sclass=\"regular-price\">Your\\sPrice:)(.*)"
            		+ "(?=<\\/div><div\\sclass=\"price-countdown\">)");

			Pattern imgURL = Pattern.compile("(?<=\"image\":\\[\")(.*)"
            		+ "(?=\"\\],\"itemCondition)");

			
			while((line1=rdr.readLine()) != null){
				Matcher prdId = productId.matcher(line1);
				Matcher prdName = productName.matcher(line1);
				//Matcher price  = priceMatch.matcher(line1);
				Matcher imgURLMatch = imgURL.matcher(line1);
				
				if (prdId.find())
					table += prdId.group() + "|";
				if (prdName.find())
					table += prdName.group() + "|";
				//if (price.find())
					//table += price.group() + "|";
				if (imgURLMatch.find()){
					table +=  imgURLMatch.group() + "|";
					finalresult2 = imgURLMatch.group();
					getImage.saveImage(finalresult2, x, true);
					table += queryRunDT + "\n";
					count++;
				}
			}
			System.out.println("Load Data Please wait!");
			bw.write(table);
			rdr.close();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
		System.out.println("Total Obtained Data: " + table);
		set_queryCount(count);
	}
	
	int query;
	void set_queryCount(int count){
		query = count;
	}
	int get_queryCount(){
		return query;
	}
	
	//test the URL link that work or not
	public static void main(String[] args) {		
		fetchDataURL fdu = new fetchDataURL();
		fdu.set_terms ("chair");
		fdu.fetchProductData();							
	}
}


