package assesment_project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Add_files {
	

public void add_files()
	{
	 // public static void main(String[] args) {
	File_operation obj = new File_operation();
	    	Scanner scanner = new Scanner( System.in );
	        System.out.println("Enter the file name with path: ");
	        String dirname = scanner.nextLine(); 
	        try {
	            //File file = new File("d:/sampleFile.txt");
	        	File file = new File(dirname);
	       
	            if(file.createNewFile())
	                System.out.println("File creation successfull");
	            else
	                System.out.println("Error while creating File, file already exists in specified path");
	            obj.file_operation();
	        }
	        catch(IOException io) {
	            io.printStackTrace();
	        }
	    }

	}

 
