package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityExeception;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();
		
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");
			
			st.setInt(1, 2);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Ros Affected:" + rowsAffected);
		}
		catch(SQLException e) {
			throw new DbIntegrityExeception(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeConneciton();
		}
		
	}

}
