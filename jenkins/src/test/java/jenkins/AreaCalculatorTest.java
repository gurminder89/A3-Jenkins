package jenkins;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AreaCalculatorTest {
	AreaCalculator areaCalculator;


	@Before
	public void setUp() throws Exception {
		areaCalculator = new AreaCalculator();
	}

	@After
	public void tearDown() throws Exception {
		areaCalculator = null;
		
	}

	@Test
	public void testGetArea() {
		assertEquals(25.0D, areaCalculator.getArea(10, 5), 0);
		assertEquals(6.0D, areaCalculator.getArea(4, 3), 0);
		assertEquals(24.0D, areaCalculator.getArea(6, 8), 0);
	}

}
