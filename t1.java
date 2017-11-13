package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class t1 {

	@Test
	public void test() {
		lab1 lab6 = new lab1();
		lab6.main(null);
		String result = lab6.generateNewText("out 88 worlds777");
		String expected = "out new worlds";
		assertEquals(expected, result);
	}

}
