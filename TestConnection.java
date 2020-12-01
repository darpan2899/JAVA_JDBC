import java.sql.*;

class TestConnection
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajt559","root","root");
			
			
			if(!con.isClosed())
			{
				System.out.println("connected");
				con.close();
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}