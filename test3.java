package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test3 {

	@Test
	public void test() {
		lab1 lab6 = new lab1();
		lab6.main(null);
		String result = lab6.queryBridgeWords("seek", "normal");
		String expected = "No \"normal\" in the graph!";
		assertEquals(expected, result);
	}

}
