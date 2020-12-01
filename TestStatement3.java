import java.sql.*;

class TestStatement3
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
			
			q = "INSERT INTO EMPLOYEE(NAME,ID,CONTACT) VALUES ('joti',525,6666666);";
			
			r = st.executeUpdate(q);
			
			
			if(r>0)
			{
				System.out.println("record inserted");
			}
			
			
			
			
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}