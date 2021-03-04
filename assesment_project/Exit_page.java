package assesment_project;

import java.util.Scanner;

public class Exit_page {
	public void exit()
	{
		Main a = new Main();
		Scanner input = new Scanner(System.in);
		System.out.println("Are you sure you want to exit, press Y/y orN/n......");
		String s = input.nextLine();
		while(s!=null)
		{
		if(s.equals("y") || s.equals("Y"))
		{
			System.out.println("Thank You");
			System.exit(0);
		}
		else 
			if(s.equals("n") || s.equals("N"))
			a.menu();
			else
				System.out.println("Not a valid option, plz try again:");
		a.menu();
		
		}
			
	}

}

