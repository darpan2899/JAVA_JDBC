import java.sql.*;

class TestStatement
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajt559","root","root");
			
			Statement st = con.createStatement();
			
			String q = "INSERT INTO Student(id,name,sem,cpi) VALUES (560,'tkv',6,9.7);";
			
			int r = st.executeUpdate(q);
			
			if(!con.isClosed())
			{
				System.out.println("connected");
				
			}
			
			if(r>0)
			{
				System.out.println("record inserted");
				con.close();
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}