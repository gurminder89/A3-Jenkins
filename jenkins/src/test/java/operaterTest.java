import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import jenkins.operater;

public class operaterTest {
	
	operater obj;
   
  int a,b;

	@Before
	public void setUp() throws Exception {
		obj = new operater ();
		a=5;
		b=3;
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}

	@Test
	public void testMultiply() {
		assertEquals(15,obj.multiply(a,b));
		
	}

}
