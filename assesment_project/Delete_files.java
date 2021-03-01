package assesment_project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Delete_files {
	static String path;//defining(not initializing) these variables outside main 
    static String filename;
   public void delete_files() {

    	//public static void main(String[] args) {
    		File_operation obj = new File_operation();
        	Scanner scanner = new Scanner( System.in );
        	System.out.println("Enter the path : ");
            path=scanner.nextLine(); //storing path in path variable
            System.out.println("Enter the file name: ");
            String filename = scanner.nextLine(); 
            File file = new File(path);
            boolean b = false;
           File[] flist = file.listFiles(); 
            try {
            	
            	
            	if(flist==null)
            	{
            		System.out.println("empty directory");
            	}
            	else
            	{
            	 for(File allfile:flist)
                 {
                 
            	if(allfile.exists()&& (allfile.getName().equals(filename)))
    			{
    				
    				System.out.println("file is available at location: " + file.getAbsolutePath());
    			
    				
    			
    				b= allfile.delete();
    			}
                 }
            	}
    			
               
                 
    	if(b==true)
    	{
    		System.out.println("File is deleted");
    	}
    	else
    	{
    		System.out.println("File not found");
    	}
    	obj.file_operation();
    		}
    catch(Exception e)
    		{
    	e.printStackTrace();
    		}
    }
    	
    }
            
