import static org.junit.Assert.assertEquals;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SqrtTest {

	@Test
	void test1() {
		Sqrt squareRoot = new Sqrt();
		int result = squareRoot.mySqrt(8);
		assertEquals(2, result);
	}
	
	@Test
	void test2() {
		Sqrt squareRoot = new Sqrt();
		int result = squareRoot.mySqrt(1225);
		assertEquals(35, result);
	}
	
	@Test
	void test3() {
		Sqrt squareRoot = new Sqrt();
		int result = squareRoot.mySqrt(9);
		assertEquals(3, result);
	}
	
	@Test
	void test4() {
		Sqrt squareRoot = new Sqrt();
		int result1 = squareRoot.mySqrt(10);
		assertEquals(3, result1);
	}
	
	@Test
	void test5() {
		Sqrt squareRoot = new Sqrt();
		int result = squareRoot.mySqrt(361);
		assertEquals(19, result);
	}
	
	
	@Test
	void test6() {
		Sqrt squareRoot = new Sqrt();
		int result = squareRoot.mySqrt(148);
		assertEquals(12, result);
	}
	
	@Test
	void test7() {
		Sqrt squareRoot = new Sqrt();
		int result = squareRoot.mySqrt(10000);
		assertEquals(100, result);
	}
	
	@Test
	void test8() {
		Sqrt squareRoot = new Sqrt();
		int result = squareRoot.mySqrt(1000);
		assertEquals(31, result);
	}
	
	@Test
	void test9() {
		Sqrt squareRoot = new Sqrt();
		int result = squareRoot.mySqrt(256);
		assertEquals(16, result);
	}
	
	@Test
	void test10() {
		Sqrt squareRoot = new Sqrt();
		int result = squareRoot.mySqrt(489);
		assertEquals(22, result);
	}
	
}
