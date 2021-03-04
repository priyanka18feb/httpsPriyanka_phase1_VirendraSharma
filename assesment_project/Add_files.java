package assesment_project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Add_files {
	
	static String path;//defining(not initializing) these variables outside main 
    static String filename;
public void add_files()
	{
	
	File_operation obj = new File_operation();
	    	
	Scanner sc = new Scanner( System.in );
	 System.out.println("Enter the path : ");
    path=sc.nextLine(); //storing path in path variable
      System.out.println("Enter file name : ");
      filename=sc.nextLine(); //storing filename in filename variable
	        try {
	        	  // Create an object of the File class 
	   	     // Replace the file path with path of the directory 
	   	     File directory = new File(path); 
	   	        File file = new File(path+"/"+filename);

	   	        if (file.createNewFile())
	   	            System.out.println("    File \""+filename+"\" added to "+ path+"\n");
	   	        else if(file.exists())
	   	            System.out.println("    File \""+filename+"\" already exists at "+path +"\n");
	   	        else
	   	            System.out.println("Something went wrong. File NOT added\n");
	            obj.file_operation();
	        }
	        catch(IOException io) {
	        	System.out.println("not a valid input, plz try again");
	        	add_files();
	        }
	    }

	}

 

 
