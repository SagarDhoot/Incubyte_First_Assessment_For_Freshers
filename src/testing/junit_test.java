package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class junit_test {

	@Test
	public void EmptyStringTest() {
		StringCalculator calculate=new StringCalculator();
		assertEquals(calculate.stringcalculate(""),0);
	}

}
