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
		assertEquals(calculate.add(""),0);
	}
	@Test
	public void singlestringtestreturnsinteger() {
		assertEquals(calculate.add("50"),50);
	}
	@Test
	public void addtwonumbers() {
		assertEquals(calculate.add("1,2"),3);
	}
	@Test
	public void unknownamountofnumbers() {
		assertEquals(calculate.add("2,20,40,50,80"),192);
	}
	@Test
	public void alphabetsaddition() {
		assertEquals(calculate.add("a,b,c,d,5,a,10"),26);
	}
}
