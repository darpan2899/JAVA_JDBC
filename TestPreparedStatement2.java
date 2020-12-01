import java.sql.*;

class TestPreparedStatement2
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
			
			PreparedStatement pst = con.prepareStatement( "UPDATE EMPLOYEE SET NAME=?,CONTACT = ? WHERE ID = ?");
			 int r;
			
			
		
			
			pst.setString(1,"neelU");
			pst.setInt(2,70160);
			pst.setInt(3,554);
			
			
			r = pst.executeUpdate();
			
			
			
			if(r>0)
			{
				System.out.println("record UPDATED");
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}