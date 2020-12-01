import java.sql.*;

class TestStatement4
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
			
			
			q = "UPDATE EMPLOYEE SET NAME = 'JYOTI', CONTACT = 1111111 WHERE ID = 525";
			
			r = st.executeUpdate(q);
			
			if(r>0)
			{
				System.out.println("record UPDATED");
			}
			
			
			
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}