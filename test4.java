package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test4 {

	@Test
	public void test() {
		lab1 lab6 = new lab1();
		lab6.main(null);
		String result = lab6.queryBridgeWords("zz", "to");
		String expected = "No \"zz\" in the graph!";
		assertEquals(expected, result);
	}

}
