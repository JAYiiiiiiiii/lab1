package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class t4 {

	@Test
	public void test() {
		lab1 lab6 = new lab1();
		lab6.main(null);
		String result = lab6.generateNewText("ab cd ee");
		String expected = "ab cd ee";
		assertEquals(expected, result);
	}

}
