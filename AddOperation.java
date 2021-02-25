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

public class AddOperation 
{
	public void insert() throws SQLException, IOException, ClassNotFoundException  
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
		
		try {
			String q="INSERT into student values(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement stat=c.prepareStatement(q);
			
			System.out.println("Enter the id ");
			int id=sc.nextInt();
			stat.setInt(1, id);
			
			System.out.println("Enter the First Name");
			sc.nextLine();
			String fname=sc.nextLine();
			
			stat.setString(2, fname);
			
			System.out.println("Enter the Second Name");
			String sname=sc.nextLine();
			stat.setString(3, sname);
			
			System.out.println("Enter the Mobile  Number");
			long phno=sc.nextLong();
			stat.setLong(4, phno);
			
			System.out.println("Enter the Address");
			sc.nextLine();
			String address=sc.nextLine();
			
			stat.setString(5, address);
			
			System.out.println("Enter the Marks");
			double marks=sc.nextDouble();
			stat.setDouble(6, marks);
			
			System.out.println("Enter the Gender");
			sc.nextLine();
			String gen=sc.nextLine();
			
			stat.setString(7, gen);
			
			System.out.println("Enter the DOB");
			String dob=sc.nextLine();
			stat.setString(8, dob);
			
			System.out.println("Enter the Branch");
			String branch=sc.nextLine();
			stat.setString(9, branch);
		
			//step4
			int u=stat.executeUpdate();
			if (u==1)
			{
				System.out.println("Added Successfully");
			} 
			else 
			{
				System.out.println("Not Added to DB");
			}
			
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("ID should be different");
			System.out.println();
			return;
		}
		
		//step5
		/*stat.close();
		con.close();
		DriverManager.deregisterDriver(d);*/
		//sc.close();
	}
}
