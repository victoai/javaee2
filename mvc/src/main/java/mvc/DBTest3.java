package mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest3 {

	public static void main(String[] args) throws Exception {
		 
		 String driver="oracle.jdbc.driver.OracleDriver";
		 String url  ="jdbc:oracle:thin:@localhost:1521:testdb";
		 String user="scott";
		 String password="tiger";  
		 
		 Connection con=null;
		
	 
		Class.forName(driver);
		con  =DriverManager.getConnection(url, user, password);	   
		if( con != null){
			System.out.println("ok98989");
		} 
		con.close();
		 
	}

}
