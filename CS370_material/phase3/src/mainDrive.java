import java.util.Scanner;

public class mainDrive {
	public static void main(String[] args) {
		
		//default setting output and input file
		String fileInput = "inputPhase3.txt";
		String fileOutput = "outputPhase3.txt";
		@SuppressWarnings("unused")
		String fileLog = "";
		@SuppressWarnings("unused")
		boolean activeGUI = false;
		
		/*use this code for debugging Purposes
			System.out.println(fileOutput);
		*/
		
		//command through arguments
		int arg = args.length;

		for(int i = 0; i<arg; i++){				
		    if(args[0].startsWith("-i")){
			fileInput = args[++i];
			break;
		     }

		    if(args[0].startsWith("-o")){
			fileOutput = args[++i];
			break;
		    }
					

		    if(args[0].startsWith("-gui")){
		    	activeGUI = true;
			break;
		    }
					
		    if(args[0].startsWith("-l")){
			fileLog = args[++i];
			break;
		    }
										
		    else{
			System.err.println("invalid argument. Please try again.");
		    }	
		}	
		
		//Active GUI by command line: -gui
		if(activeGUI == true){
		   myGUI mainFrame1 = new myGUI(fileInput, fileOutput);
		   mainFrame1.setVisible(true);			
		}
		else{
			//create mainFrame instance to work with GUI
			myGUI mainFrame = new myGUI(fileInput, fileOutput);
			mainFrame.setVisible(true);
		}
	}
}
