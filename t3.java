package lab1;

import static org.junit.Assert.*;

import org.junit.Test;

public class t3 {

	@Test
	public void test() {
		lab1.main(null);
		String result = lab1.generateNewText("find ancient human");
		String expected = "find out ancient human";
		assertEquals(expected, result);
	}

}
