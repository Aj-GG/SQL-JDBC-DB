package Jee.student;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class DeletOperation 
{
	public void delete() throws IOException, ClassNotFoundException, SQLException
	{
		Scanner sc=new Scanner(System.in);
		
		File f=new File("H:\\J2EE Softwares\\DATA Base File\\student_info.txt");
		FileReader fr=new FileReader(f);
		
		Properties p=new Properties();
		p.load(fr);
		
		String s1=p.getProperty("driver");
		
		Class.forName(s1);
		
		String s2=p.getProperty("url");
		
		Connection c=DriverManager.getConnection(s2, p);
				
		System.out.println("Delete by");
		System.out.println("1.ID\n2.First Name\n3.Mobile Number");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch (choice) 
		{
			case 1:System.out.println("ID is Mandatory");
				   System.out.println();
				   System.out.println("Enter the ID");
				   int id1=sc.nextInt();
				   String query1="DELETE From student WHERE ID="+id1;
				   PreparedStatement ps1=c.prepareStatement(query1);
				   int u1=ps1.executeUpdate();
				   if (u1==1)
				   {
					System.out.println("Successfully Deleted");
				   }
				   else 
				   {
					   System.out.println("Not Found");
				   }
				   break;

			case 2:System.out.println("First Name is Mandatory");
				   System.out.println();
				   
				   String query2="DELETE From student WHERE Fname=?";
				   PreparedStatement ps2=c.prepareStatement(query2);
				   System.out.println("Enter the First Name");
				   String id2=sc.nextLine();
				   
				   ps2.setString(1, id2);
				   sc.nextLine();
				   
				   if(ps2.executeUpdate()==1 ||ps2.executeUpdate()>1)
				   {
					   System.out.println("Successfully Deleted");
				   }
				   else 
				   {
					   System.out.println("Not Found");
					   System.out.println();
				   }
				   break;
			case 3:System.out.println("Mobile Number is Mandatory");
			   	   System.out.println("Enter the Mobile Number");
			   	   long id3=sc.nextLong();
			   	   String query3="DELETE From student WHERE Mno="+id3;
			   	   PreparedStatement ps3=c.prepareStatement(query3);
			   	   if(ps3.executeUpdate()==1 ||ps3.executeUpdate()>1)
				   {
					   System.out.println("Successfully Deleted");
				   }
				   else 
				   {
					   System.out.println("Not Found");
					   System.out.println();
				   }
			   	   break;
		    default :return;
		}
		
		//c.close();
		//fr.close();
		//sc.close();
	}
}
