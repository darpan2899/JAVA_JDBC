import java.sql.*;

class TestStatement2
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","ROOT");
			
			if(!con.isClosed())
			{
				System.out.println("connected");
				
			}
			
			Statement st = con.createStatement();
			
			String q = "CREATE DATABASE AJT559_2";
			
			int r = st.executeUpdate(q);
			
			q="USE AJT559_2";
			
			r = st.executeUpdate(q);
			
			q="CREATE TABLE EMPLOYEE(NAME VARCHAR(20),ID INT(20),CONTACT INT(10))";
			
			r = st.executeUpdate(q);
			
			if(r==0)
			{
				System.out.println("table created");
				
			}
			
			
			q = "INSERT INTO EMPLOYEE(NAME,ID,CONTACT) VALUES ('DRV',559,9999999);";
			
			r = st.executeUpdate(q);
			
			
			if(r>0)
			{
				System.out.println("record inserted");
				con.close();
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}