package MyP;
import java.sql.*;


public class DB {
	
	public static Connection con;

	public static Connection connect(){
		try {
			String url ="jdbc:mysql://localhost:3306/db";
			String Uname="root";
			String Pass="Ohyeah@1234";
			
			con = DriverManager.getConnection(url,Uname,Pass);
		}
		catch(Exception e) {
			System.out.println("error code"+ e);
		}
		return con;	
	}  
	
	
}
