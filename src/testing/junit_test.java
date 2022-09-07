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
	public void emptystringtestreturnszero() throws Exception{
		assertEquals(calculate.add(""),0);
	}
	@Test
	public void singlestringtestreturnsinteger() throws Exception{
		assertEquals(calculate.add("50"),50);
	}
	@Test
	public void addtwonumbers() throws Exception{
		assertEquals(calculate.add("1,2"),3);
	}
	@Test
	public void unknownamountofnumbers() throws Exception{
		assertEquals(calculate.add("2,20,40,50,80"),192);
	}
	@Test
	public void alphabetsaddition() throws Exception{
		assertEquals(calculate.add("a,b,c,d,5,a,10"),26);
	}
	@Test
	public void singlenegativenumber() throws Exception{
		calculate.add("a,b,c,d,5,a,-11");
	}
	@Test
	public void shouldHaveNegativeNumbersInException() throws Exception {
		calculate.add("-1,-2,3");
	}
}
