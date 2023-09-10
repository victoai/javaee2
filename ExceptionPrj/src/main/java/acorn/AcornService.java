package acorn;

import java.sql.SQLException;
import java.util.ArrayList;

public class AcornService {
	
	AcornDAO dao = new AcornDAO();
	
	public ArrayList<String>  getMemberList(){	
		
		ArrayList<String> list  = new ArrayList<>();
		
		list.add("곽단야");
		list.add("김민규");
		list.add("김민지");		
		return list; 
	}	
	
	public ArrayList<Customer> getMemberRealList(){	
		 ArrayList<Customer> list  =dao.selectAll();
		 return list;
		
	}	
	
	
	public void registerCustomer(  Customer c) throws SQLException {
		 dao.insert(c);
	}
	 

}
