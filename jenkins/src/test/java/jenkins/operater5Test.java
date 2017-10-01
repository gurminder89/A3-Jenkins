package jenkins;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class operater5Test {
	operater5 obj;
    double base;
    double height;

	@Before
	public void setUp() throws Exception {
		obj = new operater5();
		base = 20.0;
		height = 110.5;
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
		base =0;
		height = 0;
	}

	@Test
	public void testMain() {
		///assertEquals()
	}

}
