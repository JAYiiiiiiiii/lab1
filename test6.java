package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test6 {

	@Test
	public void test() {
		lab1 lab6 = new lab1();
		lab6.main(null);
		String result = lab6.queryBridgeWords("to", "and");
		String expected = "No bridge words from \"to\" to \"and\"!";
		assertEquals(expected, result);
	}

}
