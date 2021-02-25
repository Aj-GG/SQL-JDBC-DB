package Jee.student;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;

public class UdateOperation
{
	public void modify() throws IOException, ClassNotFoundException, SQLException
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
				
		System.out.println("Update/Modify by");
		System.out.println("1.ID\n2.Mobile Number");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch (choice) 
		{
			case 1:System.out.println("ID is Mandatory");
				   System.out.println();
				   System.out.println("1.First Name\n2.Last Name\n3.Mobile Number\n4.Address\n5.Marks\n6.Gender\n7.DOB\n8.Branch");
				   System.out.println("Enter your choice");
				   int ch1=sc.nextInt();
				   switch(ch1)
				   {
				   case 1: /*System.out.println("Enter the query");
						String query1=sc.nextLine();*/
						System.out.println("Enter the ID");
						int id1=sc.nextInt();
						String query1="UPDATE student SET Fname=? WHERE ID="+id1;
						PreparedStatement ps1=c.prepareStatement(query1);
						sc.nextLine();
						System.out.println("Enter the First Name");
						String fname=sc.nextLine();
						ps1.setString(1, fname);
						int u1=ps1.executeUpdate();
						if (u1==1) 
						{
							System.out.println("Successfully update");
						} 
						else 
						{
							System.out.println("Not Updated");
						}
						break;
						
				case 2: /*System.out.println("Enter the query");
						String query2=sc.nextLine();*/
						System.out.println("Enter the ID");
						int id2=sc.nextInt();
						String query2="UPDATE student SET Lname=? WHERE ID="+id2;
						PreparedStatement ps2=c.prepareStatement(query2);
						sc.nextLine();
						System.out.println("Enter the Last Name");
						String lname=sc.nextLine();
						ps2.setString(1, lname);
						int u2=ps2.executeUpdate();
						if (u2==1) 
						{
							System.out.println("Successfully update");
						} 
						else 
						{
							System.out.println("Not Updated");
						}
						break;
				
				case 3: /*System.out.println("Enter the query");
						String query3=sc.nextLine();*/
						System.out.println("Enter the ID");
						int id3=sc.nextInt();
						String query3="UPDATE student SET Mno=? WHERE ID="+id3;
						PreparedStatement ps3=c.prepareStatement(query3);
						System.out.println("Enter the Mobile Number");
						long mno=sc.nextLong();
						ps3.setLong(1, mno);
						int u3=ps3.executeUpdate();
						if (u3==1) 
						{
							System.out.println("Successfully update");
						} 
						else 
						{
							System.out.println("Not Updated");
						}
						break;
				
				case 4: /*System.out.println("Enter the query");
						String query4=sc.nextLine();*/
						System.out.println("Enter the ID");
						int id4=sc.nextInt();
						String query4="UPDATE student SET Address=? WHERE ID="+id4;
						PreparedStatement ps4=c.prepareStatement(query4);
						sc.nextLine();
						System.out.println("Enter the Address");
						String address=sc.nextLine();
						ps4.setString(1, address);
						int u4=ps4.executeUpdate();
						if (u4==1) 
						{
							System.out.println("Successfully update");
						} 
						else 
						{
							System.out.println("Not Updated");
						}
						break;
						
				case 5: /*System.out.println("Enter the query");
						String query5=sc.nextLine();*/
						System.out.println("Enter the ID");
						int id5=sc.nextInt();
						String query5="UPDATE student SET Marks=? WHERE ID="+id5;
						PreparedStatement ps5=c.prepareStatement(query5);
						System.out.println("Enter the Marks");
						double marks=sc.nextDouble();
						ps5.setDouble(1, marks);
						int u5=ps5.executeUpdate();
						if (u5==1) 
						{
							System.out.println("Successfully update");
						} 
						else 
						{
							System.out.println("Not Updated");
						}	
						break;
						
				case 6: /*System.out.println("Enter the query");
						String query6=sc.nextLine();*/
						System.out.println("Enter the ID");
						int id6=sc.nextInt();
						String query6="UPDATE student SET Gender=? WHERE ID="+id6;
						PreparedStatement ps6=c.prepareStatement(query6);
						sc.nextLine();
						System.out.println("Enter the Gender");
						String gender=sc.nextLine();
						ps6.setString(1, gender);
						int u6=ps6.executeUpdate();
						if (u6==1) 
						{	
							System.out.println("Successfully update");
						} 
						else 
						{
							System.out.println("Not Updated");
						}
						break;
						
				case 7: /*System.out.println("Enter the query");
						String query7=sc.nextLine();*/
						System.out.println("Enter the ID");
						int id7=sc.nextInt();
						String query7="UPDATE student SET DOB=? WHERE ID="+id7;
						PreparedStatement ps7=c.prepareStatement(query7);
						sc.nextLine();
						System.out.println("Enter the DOB");
						String dob=sc.nextLine();
						ps7.setString(1, dob);
						int u7=ps7.executeUpdate();
						if (u7==1) 
						{	
							System.out.println("Successfully update");
						} 
						else 
						{
							System.out.println("Not Updated");
						}
						break;
					
				case 8: /*System.out.println("Enter the query");
						String query8=sc.nextLine();*/
						System.out.println("Enter the ID");
						int id8=sc.nextInt();
						String query8="UPDATE student SET Branch=? WHERE ID="+id8;
						PreparedStatement ps8=c.prepareStatement(query8);
						sc.nextLine();
						System.out.println("Enter the Branch");
						String branch=sc.nextLine();
						ps8.setString(1, branch);
						int u8=ps8.executeUpdate();
						if (u8==1) 
						{	
							System.out.println("Successfully update");
						} 
						else 
						{
							System.out.println("Not Updated");
						}
						break;
				   }
				   break;

			
			case 2:System.out.println("Mobie Number is Mandatory");
			   System.out.println();
			   System.out.println("1.First Name\n2.Last Name\n3.Mobile Number\n4.Address\n5.Marks\n6.Gender\n7.DOB\n8.Branch");
			   System.out.println("Enter your choice");
			   int ch3=sc.nextInt();
			   switch(ch3)
			   {
			   case 1: /*System.out.println("Enter the query");
					String query1=sc.nextLine();*/
					System.out.println("Enter the Mobile Number");
					long id1=sc.nextLong();
					String query1="UPDATE student SET Fname=? WHERE Mno="+id1;
					PreparedStatement ps1=c.prepareStatement(query1);
					sc.nextLine();
					System.out.println("Enter the First Name");
					String fname=sc.nextLine();
					ps1.setString(1, fname);
					int u1=ps1.executeUpdate();
					if (u1==1) 
					{
						System.out.println("Successfully update");
					} 
					else 
					{
						System.out.println("Not Updated");
					}
					break;
					
			case 2: /*System.out.println("Enter the query");
					String query2=sc.nextLine();*/
					System.out.println("Enter the Mobile Number");
					long id2=sc.nextLong();
					String query2="UPDATE student SET Lname=? WHERE Mno="+id2;
					PreparedStatement ps2=c.prepareStatement(query2);
					sc.nextLine();
					System.out.println("Enter the Last Name");
					String lname=sc.nextLine();
					ps2.setString(1, lname);
					int u2=ps2.executeUpdate();
					if (u2==1) 
					{
						System.out.println("Successfully update");
					} 
					else 
					{
						System.out.println("Not Updated");
					}
					break;
			
			case 3: /*System.out.println("Enter the query");
					String query3=sc.nextLine();*/
					System.out.println("Enter the Mobile Number");
					long id3=sc.nextLong();
					String query3="UPDATE student SET Mno=? WHERE Mno="+id3;
					PreparedStatement ps3=c.prepareStatement(query3);
					System.out.println("Enter the Mobile Number");
					long mno=sc.nextLong();
					ps3.setLong(1, mno);
					int u3=ps3.executeUpdate();
					if (u3==1) 
					{
						System.out.println("Successfully update");
					} 
					else 
					{
						System.out.println("Not Updated");
					}
					break;
			
			case 4: /*System.out.println("Enter the query");
					String query4=sc.nextLine();*/
					System.out.println("Enter the Mobile Number");
					long id4=sc.nextLong();
					String query4="UPDATE student SET Address=? WHERE Mno="+id4;
					PreparedStatement ps4=c.prepareStatement(query4);
					sc.nextLine();
					System.out.println("Enter the Address");
					String address=sc.nextLine();
					ps4.setString(1, address);
					int u4=ps4.executeUpdate();
					if (u4==1) 
					{
						System.out.println("Successfully update");
					} 
					else 
					{
						System.out.println("Not Updated");
					}
					break;
					
			case 5: /*System.out.println("Enter the query");
					String query5=sc.nextLine();*/
					System.out.println("Enter the Mobile Number");
					long id5=sc.nextLong();
					String query5="UPDATE student SET Marks=? WHERE Mno="+id5;
					PreparedStatement ps5=c.prepareStatement(query5);
					System.out.println("Enter the Marks");
					double marks=sc.nextDouble();
					ps5.setDouble(1, marks);
					int u5=ps5.executeUpdate();
					if (u5==1) 
					{
						System.out.println("Successfully update");
					} 
					else 
					{
						System.out.println("Not Updated");
					}	
					break;
					
			case 6: /*System.out.println("Enter the query");
					String query6=sc.nextLine();*/
					System.out.println("Enter the Mobile Number");
					long id6=sc.nextLong();
					String query6="UPDATE student SET Gender=? WHERE Mno="+id6;
					PreparedStatement ps6=c.prepareStatement(query6);
					sc.nextLine();
					System.out.println("Enter the Gender");
					String gender=sc.nextLine();
					ps6.setString(1, gender);
					int u6=ps6.executeUpdate();
					if (u6==1) 
					{	
						System.out.println("Successfully update");
					} 
					else 
					{
						System.out.println("Not Updated");
					}
					break;
					
			case 7: /*System.out.println("Enter the query");
					String query7=sc.nextLine();*/
					System.out.println("Enter the Mobile Number");
					long id7=sc.nextLong();
					String query7="UPDATE student SET DOB=? WHERE Mno="+id7;
					PreparedStatement ps7=c.prepareStatement(query7);
					sc.nextLine();
					System.out.println("Enter the DOB");
					String dob=sc.nextLine();
					ps7.setString(1, dob);
					int u7=ps7.executeUpdate();
					if (u7==1) 
					{	
						System.out.println("Successfully update");
					} 
					else 
					{
						System.out.println("Not Updated");
					}
					break;
				
			case 8: /*System.out.println("Enter the query");
					String query8=sc.nextLine();*/
					System.out.println("Enter the Mobile Number");
					long id8=sc.nextLong();
					String query8="UPDATE student SET Branch=? WHERE Mno="+id8;
					PreparedStatement ps8=c.prepareStatement(query8);
					sc.nextLine();
					System.out.println("Enter the Branch");
					String branch=sc.nextLine();
					ps8.setString(1, branch);
					int u8=ps8.executeUpdate();
					if (u8==1) 
					{	
						System.out.println("Successfully update");
					} 
					else 
					{
						System.out.println("Not Updated");
					}
					break;
			   }
			   break;
		    default :return;
		}
		
		//c.close();
		//fr.close();
		//sc.close();
	}
	
}
