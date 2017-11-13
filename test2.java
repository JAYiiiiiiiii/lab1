package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		lab1 lab6 = new lab1();
		lab6.main(null);
		String result = lab6.queryBridgeWords("strange", "and");
		String expected = "The bridge words from \"strange\" to \"and\" is: life";
		assertEquals(expected, result);
	}

}
