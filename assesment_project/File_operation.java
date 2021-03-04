package assesment_project;

import java.util.Scanner;

public class File_operation {
	
	public void file_operation()
	{
int num = 0;
Add_files obj1 = new Add_files();
Delete_files obj2= new Delete_files();
Search_files obj3 = new Search_files();

Main a= new Main();

		Scanner input = new Scanner(System.in);
		 System.out.println(" 1. Add a file to existing directory");
         System.out.println(" 2. Delete a file from the existing directory");
         System.out.println(" 3. Search a file from the main directory");
         System.out.println(" 4. Navigate back to the main directory");
         
         System.out.println();
         
try
{
         System.out.println("Enter Your Choice:");
         num = input.nextInt();   
         switch(num){    
         case 1:
        	 obj1.add_files(); 
             break;  
         case 2:  
         	obj2.delete_files(); 
             break;  
         case 3:  
         	obj3.search(); 
             break; 
         case 4:  
        	 a.menu();
             break;  
         default: System.out.println("Please select any option between 1 to 4");  
         file_operation();
         }
	}
	
	catch(Exception e)
	{
		
		System.out.println("Not a valid input, plz try again:");
		file_operation();
	}

}
}
