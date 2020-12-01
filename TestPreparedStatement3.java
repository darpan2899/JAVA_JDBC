import java.sql.*;

class TestPreparedStatement3
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
			
			PreparedStatement pst = con.prepareStatement("DELETE FROM EMPLOYEE WHERE ID = ?");
			 int r;
			
			
		
			
			
			
			
			pst.setInt(1,554);
			
			
			r = pst.executeUpdate();
			
			
			if(r>0)
			{
				System.out.println("record DELETED");
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}