import java.sql.*;

class TestCallable3
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
             CallableStatement cst=con.prepareCall("{call UPDATER(?,?)}");  
              
			 //cst.setString(1,"employee");
			 //cst.setString(1,"CONTACT");
			 cst.setDouble(1,909090);
			 cst.setInt(2,559);
             			 
              
             cst.execute();  
			
			
			
			
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}