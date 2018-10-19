package practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class JUnitCalculator {

	JUnit ju = new JUnit();

	@Test
	void test() {
		assertEquals(15, ju.add(5, 10));
	}

}
