package jenkins;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RpnCalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void newCalculatorHas0IntIsAccumlator() {
		
		RpnCalculator calculator  = new RpnCalculator();
		assertEquals(BigDecimal.ZERO,calculator.getAccumulator());
	}

}
