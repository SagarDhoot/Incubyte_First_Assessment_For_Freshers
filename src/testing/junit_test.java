package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class junit_test {
	
	private StringCalculator calculate;
	@Before
	public void init()
	{
		calculate=new StringCalculator();
	}
	@Test
	public void emptystringtestreturnszero() {
		assertEquals(calculate.stringcalculate(""),0);
	}
	@Test
	public void singlestringtestreturnsinteger() {
		assertEquals(calculate.stringcalculate("100"),100);
	}

}
