package Jee.student;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainOfStudent 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException 
	{
		Scanner sc=new Scanner(System.in);
		while (true)
			{
				System.out.println("1.insert 2.delete 3.search 4.update 5.Display 6.Exit");
				System.out.println("Enter your choice");
				int ch=sc.nextInt();
				switch (ch)
			   {
				case 1:new AddOperation().insert();
				       new Display().display();
					   break;
				case 2:new DeletOperation().delete();
					   new Display().display();
					   break;
				case 3:new SearchOperation().search();
				  	   break;
				case 4:new UdateOperation().modify();
					   new Display().display();
					   break;
				case 5: new Display().display();
						break;
				case 6:System.out.println("Thank you For Using Data Base");
						System.exit(0);
				}
			}
	}
}
