package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class t5 {

	@Test
	public void test() {
		lab1.main(null);
		String result = lab1.generateNewText("to seek out new worlds");
		String expected = "to seek out new worlds";
		assertEquals(expected, result);
	}

}
