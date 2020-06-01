import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SuppressWarnings("unchecked")
public class hashTable {

	
    // Insert function that will add the product record to the hash table
    public static LinkedHashMap<String,String> insert(String[] x) {
        LinkedHashMap<String,String> product = new LinkedHashMap<String,String>();
        product.put ("itemName", x[0]);
        product.put ("itemImg", x[2]);
        product.put ("itemDt", x[3]);
        //product.put ("itemSeller", x[4]);
        return product;
    }

    // Function that will instantiate the hashtable instance from an existing data file
    public static LinkedHashMap<String,LinkedHashMap<String,String>> readFile(String x) {
        
        // Readers and buffers
        FileReader fr = null;
        BufferedReader br = null;

        // New hashtable instance
        LinkedHashMap<String,LinkedHashMap<String,String>> table = new LinkedHashMap<String,LinkedHashMap<String,String>>();

        // The datafile name and the location
        String dataFolder = "dataset";

        // The name of the data file
        final String filename = dataFolder + "/" + x;

        // Databath 
        Path dataPath = Paths.get(filename);
        
        // If the directory does not exist, there's nothing to read from, thus return and finish
        if (!Files.exists(dataPath)) 
            return table;

        // Try block
        try {

            // Instantiate the buffer and the reader
            fr = new FileReader(filename);
            br = new BufferedReader(fr);

            // Setting "|" as the delimiter, start reading the query file
            String line;
            String delimeter = "[|]";

            // Scan through the file and start splitting and insert
            while ((line = br.readLine()) != null) {

                // Continue in case a data file is read, instead of the query
                if (line.startsWith("ITEM ID")) 
                    continue;
                
                // Split and insert
                String[] data = line.split(delimeter);
                table.put(data[0], insert(data));
            }
        }

        // Exception handler
        catch (IOException e) {
            e.printStackTrace();
        }

        // Once operation is done, close out the readers
        finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        // Return the instance that was created
        return table;
    }

    // Function that will read the query created from online search and add to the database
    public static Object[][] readQuery(String x, @SuppressWarnings("rawtypes") LinkedHashMap table, int queryCount) {

        // Location of the saved query
        String filename = x;

        // The object array to be returned for display
        Object[][] valuesArray = new Object[queryCount][4];
        int row = 0;
        int column = 0;
        
        System.out.println("Total Result of Data: " + queryCount);
        
        // Readers and buffers
        FileReader fr = null;
        BufferedReader br = null;

        // Try block
        try {

            // Instantiate the reader and the buffer
            fr = new FileReader(filename);
            br = new BufferedReader(fr);

            // Using "|" as the delimeter, split and insert
            String line;
            String delimeter = "[|]";

            // Scan through the file
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                // Split and insert
                String[] data = line.split(delimeter);
                table.put(data[1],insert(data));
                // Store the values as well into the object array
                valuesArray[row][column++] = data[0];
                valuesArray[row][column++] = data[1];
                valuesArray[row][column++] = data[2];
                valuesArray[row][column++] = data[3];
                //valuesArray[row][column++] = data[4];
                row++;
                column = 0;
            }
        }

        // Exception Handler
        catch (IOException e) {
            e.printStackTrace();
        }

        // Close out the readers once operations are done
        finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        // Return the object array
        return valuesArray;
    }

    // Function to write out the resulting table
    public static void writeFile (@SuppressWarnings("rawtypes") LinkedHashMap table, String x) {

        // The datafile name and the location
        String dataFolder = "data";
        Path dataPath = Paths.get(dataFolder);

        // If the directory does not exist, create one
        if (!Files.exists(dataPath)) {

             //Try block
            try {
                Files.createDirectories(dataPath);
            }

            // Exception handler
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        // The actual file name
        String filename = dataFolder + "/" + x;

        // Writers and buffers
        FileWriter fw = null;
        BufferedWriter bw = null;

        // Try block
        try {

            // Instantiate the writer and the buffer
            fw = new FileWriter(filename);
            bw = new BufferedWriter(fw);

            // Print out the header for the data file
            bw.write("PRODUCT ID|PRODUCT NAME|PICTURE|QUERY TIME\n");

            // Iterator to browse through all the existing keys in the LinkedHashMap
            // pKey = the item id that's containted within the map
            @SuppressWarnings("rawtypes")
			Set pKeySet = table.entrySet();
            @SuppressWarnings("rawtypes")
			Iterator pKeyIter = pKeySet.iterator();

            // Scan through the hashtable
            while (pKeyIter.hasNext()) {

                // Create a map entry for all the existing keys
                @SuppressWarnings("rawtypes")
				Map.Entry<String,LinkedHashMap<String,String>> pKeyEntry = (Map.Entry) pKeyIter.next();
                String pKey = pKeyEntry.getKey();
                bw.write(pKey);

                // Now it will browse through the entry under the primary key
                @SuppressWarnings("rawtypes")
				Set vSet = ((LinkedHashMap)(table.get(pKey))).entrySet();
                @SuppressWarnings("rawtypes")
				Iterator vIter = vSet.iterator();

                // Scan through the iterator
                while (vIter.hasNext()) {

                    // Create map entry for all existing values and write
                    @SuppressWarnings("rawtypes")
					Map.Entry<String,String> vEntry = (Map.Entry) vIter.next();
                    String values = vEntry.getValue();
                    bw.write("|" + values);
                }

                // Once the iteration is done, separate with a new line
                bw.newLine();
            }
        }

        // Exception handler
        catch (IOException e) {
            e.printStackTrace();
        }

        // Once the operations are done close out the writer and the buffer
        finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            }
            catch (IOException ex) {
                ex.printStackTrace(); 
            }
        }
    }

    // Function to return the object array for offline searching purpose
    public static Object[][] searchDB(String x, @SuppressWarnings("rawtypes") LinkedHashMap y) {

        // Replicate the LinkedHashMap
        LinkedHashMap<String,LinkedHashMap<String,String>> table = y;

        // Queue to hold the matching tuples
        Queue<String> queue = new LinkedList<String>();

        // The search term
        String searched = x;

        // Iterator for the table
        @SuppressWarnings("rawtypes")
		Set searchSet = table.entrySet();
        @SuppressWarnings("rawtypes")
		Iterator searchIter = searchSet.iterator();
        int numberIter = 0;

        // Scan through the hashtable
        while (searchIter.hasNext()) {

            // Create map entry for the iteration
            @SuppressWarnings("rawtypes")
			Map.Entry<String,LinkedHashMap<String,String>> searchEntry = (Map.Entry) searchIter.next();
            String searchKey = searchEntry.getKey();

            String searchTitle = table.get(searchKey).get("itemName");
            if (searchTitle.toLowerCase().contains(searched.toLowerCase())) {
                queue.add(searchKey);
                numberIter++;
            }
        }

        // The object array that will hold the results
        Object[][] result = new Object[numberIter][4];
        int row = 0;
        int column = 0;

        // Read the queue and save to the object array
        while (!queue.isEmpty()) {
            String passThis = queue.remove();
            result[row][column++] = passThis;
            result[row][column++] = table.get(passThis).get("itemName");
            result[row][column++] = table.get(passThis).get("itemImg");
            result[row][column++] = table.get(passThis).get("itemDt");
            row++;
            column = 0;
        }

        // Return the resulting object array
        return result;
    }

    // Function to return find() query and return as data array
    public static String[] findID(String x, @SuppressWarnings("rawtypes") LinkedHashMap y) {

        // Save the parameter
        String theID = x;
        LinkedHashMap<String,LinkedHashMap<String,String>> table = y;

        // The resulting array
        String[] result = new String[4];

        // Check if the key exists
        if (table.containsKey(theID)) {
            result[0] = "f";
            result[1] = table.get(theID).get("itemTitle");
            result[2] = table.get(theID).get("itemImg");
            result[3] = table.get(theID).get("itemQueryDT");
        }
        else
            result[0] = "n";

        // Return the resulting array
        return result;
    }
}
