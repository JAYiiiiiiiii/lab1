package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		lab1 lab6 = new lab1();
		lab6.main(null);
		String result = lab6.queryBridgeWords("to", "out");
		String expected = "The bridge words from \"to\" to \"out\" are: seek, and find.";
		assertEquals(expected, result);
	}

}
