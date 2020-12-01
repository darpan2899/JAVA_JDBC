import java.sql.*;

class TestStatement5
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
			
			Statement st = con.createStatement();
			
			
			String q;
			int r;
			
			
			
			
			q = "DELETE FROM EMPLOYEE WHERE ID = 525";
			
			r = st.executeUpdate(q);
			
			if(r>0)
			{
				System.out.println("record DELETED");
			}
			
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}