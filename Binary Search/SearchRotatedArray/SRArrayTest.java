import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SRArrayTest {
	
	/**
	 * x in the array, to the right of the smallest element.
	 */
	@Test
	public void testSearch1() {
		SRArray srArr = new SRArray();
		int[] arr = {5,6,7,8,1,2,3,4};
		int x = 3;
		int result = srArr.search(arr, x);
		assertEquals(6,result);
	}
	
	/**
	 * x in the array, to the left of the smallest element.
	 */
	@Test
	public void testSearch2() {
		SRArray srArr = new SRArray();
		int[] arr = {5,6,7,8,1,2,3,4};
		int x = 7;
		int result = srArr.search(arr, x);
		assertEquals(2,result);
	}
	
	/**
	 * x is out off the array
	 */
	@Test
	public void testSearch3() {
		SRArray srArr = new SRArray();
		int[] arr = {3,4,5,1,2};
		int x = 7;
		int result = srArr.search(arr, x);
		assertEquals(-1,result);
	}
	
	/**
	 * array does not rotated
	 */
	@Test
	public void testSearch4() {
		SRArray srArr = new SRArray();
		int[] arr = {1,2,3,4,5};
		int x = 1;
		int result = srArr.search(arr, x);
		assertEquals(0,result);
	}
}
