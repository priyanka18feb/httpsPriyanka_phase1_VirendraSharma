package assesment_project;

import java.io.*;
import java.util.Scanner; 


 
 // overriding the accept method of FilenameFilter 
 // interface 


public class Search_files { 
	static String path;//defining(not initializing) these variables outside main 
    static String filename;//so that recursive function can access them
   
 
 public void search() 
 { 
	 
	 File_operation obj = new File_operation();
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter the path : ");
     path=sc.nextLine(); //storing path in path variable
       System.out.println("Enter file name : ");
       filename=sc.nextLine(); //storing filename in filename variable
	 
     // Create an object of the File class 
     // Replace the file path with path of the directory 
     File directory = new File(path); 
 try
 {
     // Create an object of Class MyFilenameFilter 
     // Constructor with name of file which is being 
     // searched 
     

     // store all names with same name  
     // with/without extension 
     //String[] flist = directory.list(filter); 
    
     // store all names with same name 
     // with/without extension 
     String[] flist = directory.list(); 
     int flag = 0; 
     if (flist == null) { 
         System.out.println("Empty directory."); 
     } 
     else { 

         // Linear search in the array 
         for (int i = 0; i < flist.length; i++) { 
             String filename1 = flist[i]; 
             if (filename1.equals(filename)) { 
                 System.out.println(filename1 + " is present at the location:  "+ path); 
                 flag = 1; 
             } 
         } 
     } 

     if (flag == 0) { 
         System.out.println("File Not Found"); 
     } 
     obj.file_operation();
 } 

 catch(Exception e)
 {
	 e.printStackTrace();
 }
 } 
}

