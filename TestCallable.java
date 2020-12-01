import java.sql.*;

class TestCallable
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
             CallableStatement cst=con.prepareCall("{call insertR(?,?,?)}");  
             cst.setString(1,"Amit"); 
			 cst.setInt(2,111);
             cst.setInt(3,909999999);			 
              
             cst.execute();  
			
			
			
			
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}