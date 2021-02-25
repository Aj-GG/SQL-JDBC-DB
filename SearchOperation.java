package Jee.student;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class SearchOperation 
{
	public void search() throws SQLException, IOException, ClassNotFoundException
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
		
		System.out.println("Search by");
		System.out.println("1.ID\n2.First Name\n3.Mobile Number");
		System.out.println("Enter your choice");
		int key=sc.nextInt();
		switch (key)
		{
			case 1:System.out.println("ID is Mandatory");
				   System.out.println();
				   sc.nextLine();
				   System.out.println("Enter the ID");
				   String id1=sc.nextLine();
				   String query1="SELECT * From student WHERE ID="+id1;
				   Statement s=c.createStatement();
				   ResultSet r= s.executeQuery(query1);
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
				   break;
			
			case 2:System.out.println("First Name is Mandatory");
			   System.out.println();
			   sc.nextLine();
			   String query2="SELECT ID,Fname,Lname,Mno,Address,Marks,Gender,DOB,Branch From student WHERE Fname=?";
			   PreparedStatement p2=c.prepareStatement(query2);
			   System.out.println("Enter the First Name");
			   String id2=sc.nextLine();
			   p2.setString(1, id2);
			   ResultSet r1=p2.executeQuery();
			   
				  // System.out.println("There are more than one "+id2+" in DB");
				  // System.out.println();
				   System.out.println("Id \tFname\tLname \tMobileNumber \tAddress \tMarks \tGender \tDOB \t\tBranch");
				   System.out.println("-----------------------------------------------------------------------------------------------------------------");
				
				   while(r1.next())
				   {
					   System.out.print(r1.getInt(1)+"\t");
					   System.out.print(r1.getString(2)+"\t");
					   System.out.print(r1.getString(3)+"\t");
					   System.out.print(r1.getInt(4)+"\t\t");
					   System.out.print(r1.getString(5)+"\t");
					   System.out.print(r1.getInt(6)+"\t");
					   System.out.print(r1.getString(7)+"\t");
					   System.out.print(r1.getString(8)+"\t");
					   System.out.print(r1.getString(9)+"\t");
					   System.out.println();
					   System.out.println();					
				   }
				   
				   break;
			
			case 3:
					System.out.println("Mobile number is Mandatory");
				   System.out.println();
				   System.out.println("Enter the Mno");
				   long id3=sc.nextLong();
				   String query3="SELECT ID,Fname,Lname,Mno,Address,Marks,Gender,DOB,Branch From student WHERE Mno=?";
				   PreparedStatement s3=c.prepareStatement(query3);
				   s3.setLong(1,id3);
				   ResultSet r3= s3.executeQuery();
				   System.out.println("Id \tFname\tLname \tMobileNumber \tAddress \tMarks \tGender \tDOB \t\tBranch");
				   System.out.println("-----------------------------------------------------------------------------------------------------------------");
				   while (r3.next())
				   {
					   
					   			System.out.print(r3.getInt(1)+"\t");
							   System.out.print(r3.getString(2)+"\t");
							   System.out.print(r3.getString(3)+"\t");
							   System.out.print(r3.getInt(4)+"\t\t");
							   System.out.print(r3.getString(5)+"\t");
							   System.out.print(r3.getInt(6)+"\t");
							   System.out.print(r3.getString(7)+"\t");
							   System.out.print(r3.getString(8)+"\t");
							   System.out.print(r3.getString(9)+"\t");
							   System.out.println();
							   System.out.println();
					}
				   
				   break;
		}
	}
}
