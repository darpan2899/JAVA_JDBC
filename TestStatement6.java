import java.sql.*;

class TestStatement6
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
			
			
			ResultSet rs=st.executeQuery("select * from EMPLOYEE");
			
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