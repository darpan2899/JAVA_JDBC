import java.sql.*;

class TestPreparedStatement1
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
			
			PreparedStatement pst = con.prepareStatement("INSERT INTO EMPLOYEE(NAME,ID,CONTACT) VALUES (?,?,?)");
			 int r;
			
			
		
			
			pst.setString(1,"neel");
			pst.setInt(2,554);
			pst.setInt(3,7016);
			
			r = pst.executeUpdate();
			
			
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