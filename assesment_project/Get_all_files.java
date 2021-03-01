package assesment_project;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Get_all_files {
	
	public  void get_files()
	
	{
		Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the path: ");
        String dirPath = scanner.nextLine(); // Takes the directory path as the user input
        File folder = new File(dirPath);
       Main obj = new Main();
        int counter=0;
        
		try
		{
		
		if(folder.exists())
	{
		
			if(folder.isDirectory())
            {
                File[] fileList = folder.listFiles();
                
              
                Arrays.sort(fileList);

              


                // Lists only files since we have applied file filter
              /*  for(File file:fileList)
                {
                    System.out.println(file.getName());
                }*/

                // Creating a filter to return only files.
                FileFilter fileFilter = new FileFilter()
                {
                    @Override
                    public boolean accept(File file) {
                        return !file.isDirectory();
                    }
                };
                
                fileList = folder.listFiles(fileFilter);

                // Sort files by name
                Arrays.sort(fileList, new Comparator()
                {
                    @Override
                    public int compare(Object f1, Object f2) {
                        return ((File) f1).getName().compareTo(((File) f2).getName());
                    }
                });
               
                //Prints the files in file name ascending order
                for(File file:fileList)
                {
                	
                    System.out.println(file.getName());
                    counter++;
                    
                }
                System.out.println("\nTotal number of filesS present in the directory: " + counter);

            }   
        
	}
		else
		{
		System.out.println("empty directory");
		
		}
		obj.menu();
		}
		catch(Exception e)
		{
	e.printStackTrace();
		}
	}
}
