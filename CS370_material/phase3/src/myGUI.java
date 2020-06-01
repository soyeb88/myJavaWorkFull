import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashMap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class myGUI extends JFrame {
    // Hashtable Instance & FetchURLData Instance
    fetchDataURL fetchURL;
    hashTable hashtableobj;
	
    // The hashtable to manipulate data
    LinkedHashMap<String,LinkedHashMap<String,String>> table;
    
	//Declare two variables to take input and output file name String
	String inputFileName = "";
	String outputFileName = "";
			
    // Search Result Objects
	Object[][] display2D;
	String[] columns = {"PRODUCT NAME","PRODUCT ID","PICTURE","QUERY TIME"};
	String term_search;
	
	//Contrcut Main Window - Start Here
	
	//Check whether the component add already or not
	Boolean added_main = false;
	Boolean added_online = false;
	Boolean added_online_result = false;
	Boolean added_offline = false;
	Boolean added_offline_result = false;
	Boolean added_setting = false;
	Boolean added_addwindow = false;
	Boolean edit_addwindow = false;
	
	public myGUI(String input, String output) {
		inputFileName = input;
		outputFileName = output;
		
        // Instantiate the hashtable object
		hashtableobj = new hashTable();
		table = hashtableobj.readFile(inputFileName);
		
		//set initial window size and position
		setTitle("Main Window");
		setSize(600,600);
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
		//setVisible(true);		
		
		//set-up Main Window
		mainWindowSet();
		
    }
	 	
	
	//Create JFrame Component for Main Window 
	private JLabel mainWindow_header = new JLabel("<html><b>Search Database</b></html>");
	private JButton online_main = new JButton("Search Online");
	private JButton offline_main = new JButton("Search Offline");
	private JButton setting_main = new JButton("Settings");
	private JButton exit_main = new JButton("Exit");
	private JLabel set_input_output = new JLabel("Set Input Output File");
	private JLabel input_name_main = new JLabel("Input File: ");
	private JLabel output_name_main = new JLabel("Output File: ");
    private JTextField input_textField_main = new JTextField();
    private JTextField out_textField_main = new JTextField();
    private JFileChooser inp_file_chooser = new JFileChooser();
    private JFileChooser out_file_chooser = new JFileChooser();
    private JButton select_inputFile_main = new JButton("click");
    private JButton select_outputFile_main = new JButton("click");
    private JButton re_evaluate_main = new JButton("Re-Processing Data Files");
		
	//create method for main window to set components inside the window
	private void mainWindowSet() {
		//Set Position and Size
		mainWindow_header.setBounds(5,5,590,40);
		online_main.setBounds(155,55,300,50);
		offline_main.setBounds(155,105,300,50);
		setting_main.setBounds(155,155,300,50);
		exit_main.setBounds(155,205,300,50);
		set_input_output.setBounds(5,275,590,40);
		input_name_main.setBounds(155,315,160,30);
		output_name_main.setBounds(155,355,160,30);
		input_textField_main.setBounds(230,315,160,30);
		out_textField_main.setBounds(230,355,160,30);
		select_inputFile_main.setBounds(395,315,60,30);
		select_outputFile_main.setBounds(395,355,60,30);
		re_evaluate_main.setBounds(155,395,300,50);
		
		//Alignments the components inside the main window
		mainWindow_header.setHorizontalAlignment(JLabel.CENTER);
		input_name_main.setVerticalAlignment(JLabel.CENTER);
		output_name_main.setVerticalAlignment(JLabel.CENTER);
		set_input_output.setHorizontalAlignment(JLabel.CENTER);
		re_evaluate_main.setHorizontalAlignment(JLabel.CENTER);
		
		
		//Add to the components inside the main winodw
		if(!added_main){
			added_main = true;
			add(mainWindow_header);
			add(online_main);
			add(offline_main);
			add(setting_main);
			add(exit_main);
			add(set_input_output);
			add(input_name_main);
			add(output_name_main);
			add(input_textField_main);
			add(out_textField_main);
			add(select_inputFile_main);
			add(select_outputFile_main);
			add(re_evaluate_main);
		}
		
		// Create Action Listeners for Main Window
		// START Action Listeners for Main Window
		
		//create Action for Search Online Button
		online_main.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //invisible for main manu
				setWindowOnline();			
			}
		});
		
		//create Action for Search Offline Button
		offline_main.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //invisible for main manu
				setWindowOffline();			
			}
		});
		
		//create Action for Search Settings Button
		setting_main.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //invisible for main manu
				setSettingWindowMain();			
			}
		});
		
		//create Action for Search Exit Button
		exit_main.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);			
			}
		});
		
		//create Action for click Button that upload input file
		select_inputFile_main.addActionListener(new ActionListener(){ //Adee action Linstener
			public void actionPerformed(ActionEvent e) { //Perform the action
				inp_file_chooser.setCurrentDirectory(new File(".")); //set default directory
				int value = inp_file_chooser.showOpenDialog(null); //pop-up window for upload file
				if(value == JFileChooser.APPROVE_OPTION){ //if user click ok then it will work
					File fileSelected = inp_file_chooser.getSelectedFile(); //get selected file
					inputFileName = fileSelected.getName(); //get the file name 
					input_textField_main.setText(inputFileName); //set the file name on text field
				}
			}
		});
		
		//create Action for click Button that upload output file
		select_outputFile_main.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				out_file_chooser.setCurrentDirectory(new File(".")); //set default directory
				int value = out_file_chooser.showOpenDialog(null); //pop-up window for upload file
				if(value == JFileChooser.APPROVE_OPTION){ //if user click ok then it will work
					File fileSelected = out_file_chooser.getSelectedFile(); //get selected file
					outputFileName = fileSelected.getName(); //get the file name 
					out_textField_main.setText(outputFileName); //set the file name on text field
				}	
			}
		});
		
		//create Action for Re-Processing Data Files Button that upload output file
		re_evaluate_main.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Your data have been reseted.");			
			}
		});
	}
	
	// End Action Listeners for Main Window
	
	//Contrcut Main Window - End Here
	
	//Contrcut Online Search Window - Start Here	
	
	// Online Search Components
	private JFrame online_search_frame = new JFrame();
	private JLabel searchOnlineWindow_header = new JLabel("<html><b>Search Data Online</b></html>");
	private JTextField online_searchTextBox = new JTextField();
	private JButton back_from_online_to_main_manu = new JButton("Main Menu");
	private JButton online_search_button = new JButton("Search Online");
	
	//Create Method to Construct Online Search Window
	private void setWindowOnline() {
		
		//create basic window
		online_search_frame.setTitle("Online Search");
		online_search_frame.setSize(600,600);
		online_search_frame.setLocationRelativeTo(null);
		online_search_frame.setLayout(null);
		online_search_frame.setResizable(false);
		online_search_frame.setVisible(true);
		online_search_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set Position and Size
		searchOnlineWindow_header.setBounds(5,5,590,20);
		online_searchTextBox.setBounds(5,40,590,20);
		online_search_button.setBounds(155,290,300,50);
		back_from_online_to_main_manu.setBounds(155,350,300,50);
		
		
		//Alignments the components inside the main window
		searchOnlineWindow_header.setHorizontalAlignment(JLabel.CENTER);
		//online_advanceSearch_header.setHorizontalAlignment(JLabel.CENTER);
				
		//Add to the components inside the online search winodw
		if(!added_online){
			added_online = true;
			online_search_frame.add(searchOnlineWindow_header);
			online_search_frame.add(online_searchTextBox);
			online_search_frame.add(back_from_online_to_main_manu);
			online_search_frame.add(online_search_button);
		}
		
		//Set Action Listneners to Search Online Button
		

		//Search Button
		online_search_button.addActionListener(new ActionListener() {
		    @SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {

		    // Check if a search term is provided and has active internet connection
		    if (checkConnection() && !online_searchTextBox.getText().isEmpty()) {

		    	// Instantiate the fetchObj and set the search term
		    	fetchURL = new fetchDataURL();
		    	term_search = online_searchTextBox.getText();
		    	term_search = term_search.replace(" ","%20");
		    	fetchURL.set_terms(term_search);
		    	fetchURL.fetchProductData();
		    	
		    	//set resul window
		    	String QueryLocation = fetchURL.get_queryLocation();
		    	int queryCount = fetchURL.get_queryCount();
		    	display2D  = hashtableobj.readQuery(QueryLocation, table, queryCount);
		    	
                // Convert to result window
		    	setResultWinidow(columns, display2D);
		    }

		    // Else show a warning message
		    else {
		        if (!checkConnection())
		            JOptionPane.showMessageDialog(null, "https://www.nba.com/ is not reachable");
		        else
		        JOptionPane.showMessageDialog(null, "Please provide a search term");
		        }
		   }
		});

		
		//Create Action to go back Main Menu
		back_from_online_to_main_manu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				online_search_frame.dispose();
				setVisible(true);
			}
		});
	}
	
	// Constrcut Online Search Window - End Here	
	
	//Constrcut Online Search Result Window - Start Here
	
	//Online Search Result Window Components
	private JFrame resultWindow_frame = new JFrame();
	private JLabel resultWindow_header = new JLabel("<html>Search Result From Online</html>");
	private JTable onlineResult_table;
	private JScrollPane onlineResult_table_scrollbar; 
	private JButton onlineBack_button = new JButton("Exit"); 
	
	private void setResultWinidow(String[] x, Object[][] y){
		// hide online search window
		online_search_frame.dispose();
						
		//create basic window
		resultWindow_frame.setTitle("Online Search Result");
		resultWindow_frame.setSize(1000,600);
		resultWindow_frame.setLocationRelativeTo(null);
		resultWindow_frame.setLayout(null);
		resultWindow_frame.setResizable(false);
		resultWindow_frame.setVisible(true);
		resultWindow_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		
		// Set the table and Scroll Bar
		onlineResult_table = new JTable(y,x);
		onlineResult_table.setFillsViewportHeight(true);
		onlineResult_table_scrollbar = new JScrollPane(onlineResult_table);
				
		//Set Position and Size
		resultWindow_header.setBounds(5,5,990,20);
		onlineResult_table_scrollbar.setBounds(5,25,990,450);
		onlineBack_button.setBounds(350,500,300,50);
		
		// Set JScrollPane Options
		onlineResult_table_scrollbar.setViewportView(onlineResult_table);
		onlineResult_table_scrollbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		//Set Alingnment 
		resultWindow_header.setHorizontalAlignment(JLabel.CENTER);
		
		//Add to the Online Result Window Frame
		if(!added_online_result){
			added_online_result = true;
			resultWindow_frame.add(resultWindow_header);
			resultWindow_frame.add(onlineResult_table_scrollbar, BorderLayout.CENTER);
			resultWindow_frame.add(onlineBack_button);
		}
		
		// Action Listenr - Start Here

		
		//Create Action to go back Online Search Window for Back Button
		onlineBack_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				onlineResult_table.removeAll();
				onlineResult_table_scrollbar.removeAll();
				hashtableobj.writeFile(table,outputFileName);
				resultWindow_frame.dispose();
				System.exit(0);	
			}
		});
		
		// Action Listenr - End Here
	}
	
	
	//Constrcut Offline Search Window - Start Here	
	
	// Offline Search Components
	private JFrame offline_search_frame = new JFrame();
	private JLabel searchOfflineWindow_header = new JLabel("<html><b>Search Result From Offline</b></html>");
	private JTextField offline_searchTextBox = new JTextField();
	private JButton offline_search_button = new JButton("Search Offline");
	private JButton back_from_offline_to_main_manu = new JButton("Main Menu");
	
	//Create Method to Construct Offline Search Window
	private void setWindowOffline() {
		//create basic window
		offline_search_frame.setTitle("Offline Search");
		offline_search_frame.setSize(600,600);
		offline_search_frame.setLocationRelativeTo(null);
		offline_search_frame.setLayout(null);
		offline_search_frame.setResizable(false);
		offline_search_frame.setVisible(true);
		offline_search_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		//Set Position and Size
		searchOfflineWindow_header.setBounds(5,5,590,20);
		offline_searchTextBox.setBounds(5,35,590,20);
		offline_search_button.setBounds(155,205,300,50);
		back_from_offline_to_main_manu.setBounds(155,255,300,50);
		
		//Set Alingnment 
		searchOfflineWindow_header.setHorizontalAlignment(JLabel.CENTER);
		
		//Add to the components inside the offline search winodw
		if(!added_offline){
			added_offline = true;
			offline_search_frame.add(searchOfflineWindow_header);
			offline_search_frame.add(offline_searchTextBox);
			offline_search_frame.add(offline_search_button);
			offline_search_frame.add(back_from_offline_to_main_manu);
		}

		offline_search_button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				 // Check if a keyword is given
                if (!offline_searchTextBox.getText().isEmpty()) {

                    // Save the search term
                	term_search = offline_searchTextBox.getText();
                    
                    // Resulting arrays
                	display2D = hashtableobj.searchDB(term_search,table);
                    setofflineResultWindow(columns ,display2D);                     
                }
			}
		});
		
				
		//Create Action to go back Main Menu
		back_from_offline_to_main_manu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				offline_search_frame.dispose();
				setVisible(true);
			}
		});
	}
	
	
	//Constrcut Offline Search Window - End Here
	
	
	//Constrcut Offline Result Window - Start Here
	private JFrame offline_result_frame = new JFrame();
	private JLabel reultOfflineWindow_header = new JLabel("<html><b>Search Result From Offline</b></html>");
	private JTable offlineResult_table;
	private JScrollPane offlineResult_table_scrollbar; 
	private JButton back_from_offline_result_to_main_manu = new JButton("Main Menu");
	
	
	private void setofflineResultWindow(String[] x, Object[][] y){
		 // Set the default window and hide the current window
		offline_search_frame.dispose();
      //create basic window
        offline_result_frame.setTitle("Offline Search Reult");
        offline_result_frame.setSize(1000,600);
        offline_result_frame.setLocationRelativeTo(null);
        offline_result_frame.setLayout(null);
        offline_result_frame.setResizable(false);
        offline_result_frame.setVisible(true);
        offline_result_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

        // Set the JTable and JScrollPane
        offlineResult_table = new JTable(y,x);
        offlineResult_table.setFillsViewportHeight(true);
        offlineResult_table_scrollbar = new JScrollPane(offlineResult_table);

        // Position and Size
        reultOfflineWindow_header.setBounds(5,5,990,20);
        offlineResult_table_scrollbar.setBounds(5,25,990,450);
        back_from_offline_result_to_main_manu.setBounds(350,500,300,50);

        // JScrollPane Options
        offlineResult_table_scrollbar.setViewportView(offlineResult_table);
        offlineResult_table_scrollbar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        // Alignment
        reultOfflineWindow_header.setHorizontalAlignment(JLabel.CENTER);

        // Add to the frame
        if (!added_offline_result) {
        	added_offline_result = true;
        	offline_result_frame.add(reultOfflineWindow_header);
        	offline_result_frame.add(offlineResult_table_scrollbar,BorderLayout.CENTER);
        	offline_result_frame.add(back_from_offline_result_to_main_manu);
        }

        // --- Action Listeners START

        // Back Button
        back_from_offline_result_to_main_manu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	offline_result_frame.dispose();         
            	offline_search_frame.setVisible(true);
            }
        });

        // -- Action Listeners END
	}	
	
	//Constrcut Setting Window - Start Here	
	
	// Create Setting Components
	private JFrame setting_frame = new JFrame();
	private JLabel setting_heading = new JLabel("<html><b>Edit Database</b></html>");
	private JButton add_record = new JButton("Add Record");
	private JButton edit_record = new JButton("Edit Record");
	private JButton delete_record = new JButton("Delete Record");
	private JButton back_from_setting_to_main_manu = new JButton("Main Menu");

	
	//Create Method to Construct Setting Window
	private void setSettingWindowMain() {
		//create basic window
		setting_frame.setTitle("Settings");
		setting_frame.setSize(600,600);
		setting_frame.setLocationRelativeTo(null);
		setting_frame.setLayout(null);
		setting_frame.setResizable(false);
		setting_frame.setVisible(true);
		setting_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		//Set Position and Size
		setting_heading.setBounds(5,5,590,20);
		add_record.setBounds(155,105,300,50);
		edit_record.setBounds(155,155,300,50);
		delete_record.setBounds(155,205,300,50);		
		back_from_setting_to_main_manu.setBounds(155,255,300,50);
						
		//Set Alingnment 
		setting_heading.setHorizontalAlignment(JLabel.CENTER);
		
		//Add to the components inside the Setting search winodw
		if(!added_setting){
			added_setting = true;
			setting_frame.add(setting_heading);
			setting_frame.add(add_record);
			setting_frame.add(edit_record);
			setting_frame.add(delete_record);
			setting_frame.add(back_from_setting_to_main_manu);
		}
		//Action Listenr - Start
		
		//Create Action to go back Main Menu
		add_record.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setting_frame.dispose();
				addRecordWindow();
			}
		});
		
		edit_record.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setting_frame.dispose();
				editRecordWindow();
			}
		});
		
		//Create Action to go back Main Menu
		back_from_setting_to_main_manu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setting_frame.dispose();
				setVisible(true);
			}
		});
	}
	
	//Inside Setting Window - Click Add Button - Pop-Up Add window
	
	// Create Setting Components
	private JFrame add_window_frame = new JFrame();
	private JLabel add_window_header = new JLabel("<html><b>Add Record</b></html>");
	private JLabel add_Itemid = new JLabel("Item ID: ");
    private JTextField add_id_in = new JTextField();
    private JLabel add_title = new JLabel("Item Name: ");
    private JTextField add_title_in = new JTextField();
    private JLabel add_img = new JLabel("Item Img: ");
    private JTextField add_img_in = new JTextField();
    private JButton add_pic_attach = new JButton("...");
    private JFileChooser add_pic_jfc = new JFileChooser();
    private JButton add_add = new JButton("Add Record");
    private JButton add_back = new JButton("Go Back");

	
	
	private void addRecordWindow(){
		//create basic window
		add_window_frame.setTitle("Add Record Window");
		add_window_frame.setSize(600,600);
		add_window_frame.setLocationRelativeTo(null);
		add_window_frame.setLayout(null);
		add_window_frame.setResizable(false);
		add_window_frame.setVisible(true);
		add_window_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Set Position and Size
		add_window_header.setBounds(5,5,590,20);
		
		//Set Alingnment 
		add_window_header.setHorizontalAlignment(JLabel.CENTER);
		add_Itemid.setBounds(150,65,150,30);
        add_id_in.setBounds(300,65,150,30);
        add_title.setBounds(150,125,150,30);
        add_title_in.setBounds(300,125,150,30);
        add_img.setBounds(150,215,150,30);
        add_img_in.setBounds(300,215,150,30);
        add_pic_attach.setBounds(300,215,150,30);
        add_pic_jfc.setBounds(450,215,60,30);
        add_add.setBounds(155,285,300,50);
        add_back.setBounds(155,335,300,50);
        
		//Add to the components inside the Setting search winodw
		if(!added_addwindow){
			added_addwindow = true;
			add_window_frame.add(add_window_header);
			add_window_frame.add(add_Itemid);
			add_window_frame.add(add_id_in);
			add_window_frame.add(add_title);
			add_window_frame.add(add_title_in);
			add_window_frame.add(add_img);
			add_window_frame.add(add_img_in);
			add_window_frame.add(add_pic_attach);
			add_window_frame.add(add_pic_jfc);	
			add_window_frame.add(add_add);
			add_window_frame.add(add_back);
		}
		
        // ETC Setting
        //add_query_in.setEditable(false);
        
        // --- Action Listeners START

        // Add Button
        add_add.addActionListener(new ActionListener() {
            @SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {

                // Get the data entered and make a string array
                String[] data = new String[7];
                data[0] = add_id_in.getText();
                data[1] = add_title_in.getText();

                // Insert into the table
                table.put(data[0],hashtableobj.insert(data));

                // Display a message
                JOptionPane.showMessageDialog(null, "Record has been added");

                // Clear the textfield
                add_id_in.setText("");
                add_title_in.setText("");
                add_img_in.setText("");
            }
        });

        // Attach Button
        add_pic_attach.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add_pic_jfc.setCurrentDirectory(new File("."));
                int returnValue = add_pic_jfc.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = add_pic_jfc.getSelectedFile();
                    String picPath = selectedFile.getPath();
                    String[] picArr = picPath.split("\\./");
                    picPath = picArr[1];
                    picPath = picPath.replace("img1.jpg","");
                    add_img_in.setText(picPath);
                }
            }
        });

        // Back Button
        add_back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add_id_in.setText("");
                add_title_in.setText("");
                add_img_in.setText(""); 
                add_window_frame.dispose();            
                setting_frame.setVisible(true);
            }
        });

        // -- Action Listeners END
		
	}
	
	//Constrcut Setting Window - End Here
	
	//Inside Setting Window - Click Add Button - Pop-Up Edit window
	
		// Create Setting Components
		private JFrame edit_window_frame = new JFrame();
		private JLabel edit_window_header = new JLabel("<html><b>Edit Record</b></html>");
		private JLabel edit_Itemid = new JLabel("Item ID: ");
	    private JTextField edit_id_in = new JTextField();
	    private JLabel edit_title = new JLabel("Item Name: ");
	    private JTextField edit_title_in = new JTextField();
	    private JLabel edit_img = new JLabel("Item Img: ");
	    private JTextField edit_img_in = new JTextField();
	    private JButton edit_pic_attach = new JButton("...");
	    private JFileChooser edit_pic_jfc = new JFileChooser();
	    private JButton edit_find = new JButton("Find Record");
	    private JButton edit_edit = new JButton("Edit Record");
	    private JButton edit_back = new JButton("Go Back");

		
		
		private void editRecordWindow(){
			//create basic window
			edit_window_frame.setTitle("Edit Record Window");
			edit_window_frame.setSize(600,600);
			edit_window_frame.setLocationRelativeTo(null);
			edit_window_frame.setLayout(null);
			edit_window_frame.setResizable(false);
			edit_window_frame.setVisible(true);
			edit_window_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//Set Position and Size
			edit_window_header.setBounds(5,5,590,20);
			
			//Set Alingnment 
			edit_window_header.setHorizontalAlignment(JLabel.CENTER);
			edit_Itemid.setBounds(150,65,150,30);
			edit_id_in.setBounds(300,65,150,30);
			edit_title.setBounds(150,125,150,30);
			edit_title_in.setBounds(300,125,150,30);
			edit_img.setBounds(150,215,150,30);
			edit_img_in.setBounds(300,215,150,30);
			edit_pic_attach.setBounds(300,215,150,30);
			edit_pic_jfc.setBounds(450,215,60,30);
			edit_find.setBounds(155,285,300,50);
			edit_edit.setBounds(155,335,300,50);
			edit_back.setBounds(155,385,300,50);
	        
			//Add to the components inside the Setting search winodw
			if(!edit_addwindow){
				added_addwindow = true;
				edit_window_frame.add(edit_window_header);
				edit_window_frame.add(edit_Itemid);
				edit_window_frame.add(edit_id_in);
				edit_window_frame.add(edit_title);
				edit_window_frame.add(edit_title_in);
				edit_window_frame.add(edit_img);
				edit_window_frame.add(edit_img_in);
				edit_window_frame.add(edit_pic_attach);
				edit_window_frame.add(edit_pic_jfc);	
				edit_window_frame.add(edit_find);
				edit_window_frame.add(edit_edit);
				edit_window_frame.add(edit_back);
			}
			
	        // ETC Setting
	        //add_query_in.setEditable(false);
	        
	        // --- Action Listeners START

			// Find Button
			edit_find.addActionListener(new ActionListener() {
	            @SuppressWarnings("static-access")
				public void actionPerformed(ActionEvent e) {

	                // Fetch the ID and query
	                String modItemId = edit_id_in.getText();
	                String[] modResult = hashtableobj.findID(modItemId, table);

	                if (modResult[0] == "f") {
	                	edit_title_in.setText(modResult[1]);
	                }

	                // If the ID is not found
	                else {
	                    JOptionPane.showMessageDialog(null, "Requested ID not found");
	                }

	                // Display a message
	                JOptionPane.showMessageDialog(null, "Record has been added");

	                // Clear the textfield
	                edit_id_in.setText("");
	                edit_title_in.setText("");
	                edit_img_in.setText("");
	            }
	        });
			
			// Modify Button
			edit_edit.addActionListener(new ActionListener() {
	            @SuppressWarnings("static-access")
				public void actionPerformed(ActionEvent e) {

	                // Get the data entered and make a string array
	                String[] data = new String[7];
	                data[0] = edit_id_in.getText();
	                data[1] = edit_title_in.getText();
	                data[2] = edit_img_in.getText();  

	                // Insert into the table
	                table.put(data[0],hashtableobj.insert(data));

	                // Clear the textfield
	                edit_id_in.setText("");
	                edit_title_in.setText("");
	                edit_img_in.setText("");    

	                // Display Message
	                JOptionPane.showMessageDialog(null, "Record has been modified");
	            }   
	        });


	        // Attach Button
	        add_pic_attach.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                edit_pic_jfc.setCurrentDirectory(new File("."));
	                int returnValue = edit_pic_jfc.showOpenDialog(null);
	                if (returnValue == JFileChooser.APPROVE_OPTION) {
	                    File selectedFile = edit_pic_jfc.getSelectedFile();
	                    String picPath = selectedFile.getPath();
	                    String[] picArr = picPath.split("\\./");
	                    picPath = picArr[1];
	                    picPath = picPath.replace("img1.jpg","");
	                    edit_img_in.setText(picPath);
	                }
	            }
	        });

	        // Back Button
	        edit_back.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                edit_id_in.setText("");
	                edit_title_in.setText("");
	                edit_img_in.setText(""); 
	                edit_window_frame.dispose();            
	                setting_frame.setVisible(true);
	            }
	        });

	        // -- Action Listeners END
			
		}
		
		//Constrcut Setting Window - End Here
	
	//give a default link to check the internet connection
	//work later
	public static Boolean checkConnection(){
		try {
            final URL url = new URL("https://www.nba.com/");
            final URLConnection u = url.openConnection();
            u.connect();
            return true;
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
