import java.sql.*;

class TestPreparedStatement4
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AJT559_2","root","ROOT");
			
			if(!con.isClosed())
			{
				System.out.println("connected");
				
			}
			
			PreparedStatement pst = con.prepareStatement("SELECT * FROM employee");
			 
			
			
		
			
			
			
			
			
			
			
			ResultSet rs = pst.executeQuery();
			
			
			
			System.out.println("NAME" + "\t" + "ID" + "\t" + "CONTACT");

            while(rs.next())
			{
				System.out.println(rs.getString(1) + "\t" + rs.getInt(2) + "\t" + rs.getInt(3));
			}		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}