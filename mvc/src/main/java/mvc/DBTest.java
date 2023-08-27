package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

	public static void main(String[] args) {
		 
		 String driver="oracle.jdbc.driver.OracleDriver";
		 String url  ="jdbc:oracle:thin:@localhost:1521:testdb";
		 String user="scott";
		 String password="tiger";  
		 
		 Connection con=null;
		
	  try {
			Class.forName(driver);
			con  =DriverManager.getConnection(url, user, password);	   
			if( con != null){
				System.out.println("ok98989");
			} 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
