package jenkins;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class operater3Test {
	
	operater3 obj;
	int a;

	@Before
	public void setUp() throws Exception {
		obj =new operater3();
		a=5;
	}

	@After
	public void tearDown() throws Exception {
		obj=null;
		a=0;
	}

	@Test
	public void testSqaure() {
		assertEquals(25,obj.sqaure(a));
		
	}

}
