package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcornDAOTest {
	
	AcornDAO dao = new AcornDAO(); 
	 

	@Test
	void testSe () {
	  assertTrue(  dao.selectAll2(new String[] {"dy","yj"}).size() ==3  );
	}
	
	
/*
	@Test
	void testSelectAll() {
	  assertTrue(  dao.selectAll() == null);
	}
*/
}
