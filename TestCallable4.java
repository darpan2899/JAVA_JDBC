import java.sql.*;

class TestCallable4
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
             CallableStatement cst=con.prepareCall("{call SELECTR()}");  

              
             cst.execute();  
			
			 ResultSet rs = cst.getResultSet();
			 
			 System.out.println("NAME" + "\t" + "ID" + "\t" + "CONTACT");
			 
			 while(rs.next())
		     {
			 System.out.println(rs.getString(1) + "\t" + rs.getInt(2) + "\t" + rs.getInt(3));
			 
			 }
			
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}