package jenkins;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class operater4Test {

	operater4 obj;
	double a;
	
	@Before
	public void setUp() throws Exception {
		obj = new operater4();
		a = 25;
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		a = 0;
		
	}

	@Test
	public void testSqrt() {
		
		assertEquals(5,obj.squareRoot(a), 0);
	
	}

}
