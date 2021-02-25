package Jee.student;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Display
{
	public void display() throws SQLException, IOException, ClassNotFoundException
	{
		File f=new File("H:\\J2EE Softwares\\DATA Base File\\student_info.txt");
		FileReader fr=new FileReader(f);
		
		Properties p=new Properties();
		p.load(fr);
		
		String s1=p.getProperty("driver");
		
		Class.forName(s1);
		
		String s2=p.getProperty("url");
		
		Connection c=DriverManager.getConnection(s2, p);
		
		String q="SELECT * from student";
		
		Statement s=c.createStatement();
		
		ResultSet r= s.executeQuery(q);
		
		System.out.println("Id \tFname\tLname \tMobileNumber \tAddress \tMarks \tGender \tDOB \t\tBranch");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		
		while(r.next())
		{
			System.out.print(r.getInt(1)+"\t");
			System.out.print(r.getString(2)+"\t");
			System.out.print(r.getString(3)+"\t");
			System.out.print(r.getInt(4)+"\t\t");
			System.out.print(r.getString(5)+"\t");
			System.out.print(r.getInt(6)+"\t");
			System.out.print(r.getString(7)+"\t");
			System.out.print(r.getString(8)+"\t");
			System.out.print(r.getString(9)+"\t");
			System.out.println();
			System.out.println();
			
		}
	}
}
