package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class t4 {

	@Test
	public void test() {
		lab1.main(null);
		String result = lab1.generateNewText("ab cd ee");
		String expected = "ab cd ee";
		assertEquals(expected, result);
	}

}
