package jenkins;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class operater2Test {
	
	operater2 obj;
	int a,b;

	@Before
	public void setUp() throws Exception {
		obj = new operater2();
		a=5;
		b=4;
		
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		a = 0;
		b = 0;
	}

	@Test
	public void testAdd() {
		assertEquals(9,obj.add(a,b));
	
	}

}
