package MyP;

import java.sql.*;

public class StudentDAO {
	public static void insert(Student st){
			try {
				Connection con =DB.connect();
				PreparedStatement pst= con.prepareStatement(Query.insert);
				pst.setInt(1, st.rollNo);
				pst.setString(2, st.name);
				pst.execute();
				System.out.println("success");
				con.close();
			}
			catch(Exception e) {
				System.out.println("error code"+ e);
			}

		
	
	}

	public static void delete(Student st) {
		
		try {
			Connection con =DB.connect();
		PreparedStatement pst= con.prepareStatement(Query.delete+st.rollNo);
		pst.execute();
		System.out.println("success");
		con.close();
	}
	catch(Exception e) {
		System.out.println("error code"+ e);
	}



		
	}

	public static void print() {
		
		try {
			
			Connection con =DB.connect();
			Statement stm= con.createStatement();
			ResultSet st= stm.executeQuery(Query.print);
			while(st.next()) {
				System.out.println(st.getInt(1));
				System.out.println(st.getString(2));
			}
			System.out.println("success");
			con.close();
		}
		catch(Exception e) {
			System.out.println("error code"+ e);
		}


		
	}

	public static void update(Student st) {
		
	try {
			
		Connection con =DB.connect();
		PreparedStatement pst=con.prepareStatement(Query.update);
		pst.setInt(2,st.rollNo);
		pst.setString(1,st.name);
		pst.execute();
		System.out.println("success");
		con.close();
	}
	catch(Exception e) {
		System.out.println("error code"+ e);
	}


		
	}
}