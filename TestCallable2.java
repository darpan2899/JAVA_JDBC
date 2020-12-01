import java.sql.*;

class TestCallable2
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajt559_2","root","ROOT");
			
			if(!con.isClosed())
			{
				System.out.println("connected");
				
			}
             CallableStatement cst=con.prepareCall("{call deleteR(?)}");  
              
			 cst.setInt(1,111);
             			 
              
             cst.execute();  
			
			
			
			
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}