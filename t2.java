package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class t2 {

	@Test
	public void test() {
		lab1 lab6 = new lab1();
		lab6.main(null);
		String result = lab6.generateNewText("explore new life civilizations");
		String expected = "explore strange new life and civilizations";
		assertEquals(expected, result);
	}

}
