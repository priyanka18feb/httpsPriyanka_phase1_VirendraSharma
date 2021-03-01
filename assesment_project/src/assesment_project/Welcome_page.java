package assesment_project;

import java.io.IOException;
import java.util.Scanner;

public class Welcome_page {
	 final static String PATHNAME = "src/resources";
	public static void main(String[] args) throws IOException
	{
		

		//screen design
		 System.out.println("---------------------------------------------------------------");
	     System.out.println("****************Company Lockers Pvt. Ltd.  ********************");
	     System.out.println("---------------------------------------------------------------");
	     System.out.println();
	     
	    
	     
	     System.out.println("*---------------------------------------------------------------------*");
	     System.out.println("*********************Developed by: Priyanka Singh**********************");
	     System.out.println("*---------------------------------------------------------------------*");
	     System.out.println();
		Welcome_page obj = new Welcome_page();
		obj.menu();
		
		
	
	
		
	}
	public void menu()
	{
		Get_all_files obj1 = new Get_all_files();
		File_operation  obj2 = new File_operation ();
		Exit_page obj3 = new Exit_page();
	
	int num = 0;
	
	Scanner input = new Scanner(System.in);
	
     
   //Take user Option from the below mentioned Menu
     System.out.println("MENU");
     System.out.println(" 1. Get all files");
     System.out.println(" 2. perform file operations");
     System.out.println(" 3. Close the application");
     System.out.println();
   

     System.out.println("Enter Your Choice:");
     num = input.nextInt();   
      
        switch(num){    
        case 1:
              
           obj1.get_files();
                break;  
        case 2:  
        	obj2.file_operation(); 
            break;  
      
        case 3:  
        	obj3.exit();
            break;  
        default: System.out.println("Please select any option between 1 to 3");  
        menu();
        }
     
  
     
	
	}

	


	

}
