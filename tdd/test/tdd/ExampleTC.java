package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExampleTC {

	@Test
	void testMath() throws Exception {
		int answer = MyMath.add(2, 2);
		
		assertEquals(4, answer, "bad math");
	}



	@Test
	void testMath2() throws Exception {
		int answer = MyMath.add(3, 3);
		
		assertEquals(6, answer, "bad math");
	}
}
