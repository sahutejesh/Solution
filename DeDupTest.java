/**
 * 
 */
package SEI;

import java.util.LinkedHashSet;
import java.util.Set;

import junit.framework.TestCase;

/**
 * @author Tejesh
 * 
 */
public class DeDupTest extends TestCase {

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	// Test case for Solution-1
	public void testRemoveDupUsingForLoop() {
		DeDup obj = new DeDup();
		int[] result = obj.removeDupUsingForLoop();
		boolean flag = true;

		int arrLength = result.length;

		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (result[i] == result[j]) {
					flag = false;
				}
				arrLength--;
				j--;
			}
		}

		assertTrue(flag);
	}

	// Test case for Solution-2
	public void testSortAndRemoveDup() {
		DeDup obj = new DeDup();
		int[] result = obj.sortAndRemoveDup();
		boolean flag = true;

		int arrLength = result.length;

		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (result[i] == result[j]) {
					flag = false;
				}
				arrLength--;
				j--;
			}
		}

		assertTrue(
				"flag should be true as it does not contains the duplicate values",
				flag);
	}

	// Test case for Solution-3
	// Test for unique values on HashSet
	public void testRemoveDupUsingHashSet() {
		DeDup obj = new DeDup();
		int arr[];
		boolean flag = true;

		Set<Integer> setValue = new LinkedHashSet<Integer>();
		setValue = obj.removeDupUsingHashSet();

		arr = toInt(setValue);
		for (int i = 0; i < arr.length; i++)
			System.out.format(arr[i] + ", ");

		int arrLength = arr.length;

		for (int i = 0; i < arrLength; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (arr[i] == arr[j]) {
					flag = false;
				}
				arrLength--;
				j--;
			}
		}
		assertTrue(
				"flag should be true as it does not contains the duplicate values",
				flag);
	}

	public static int[] toInt(Set<Integer> hashset) {
		int[] arr = new int[hashset.size()];
		int i = 0;
		for (Integer val : hashset)
			arr[i++] = val;

		return arr;
	}

	// Test case for Solution-3
	// Test for order of elements

	public void testOrderOfElementsHashSet() {

		// This test case I am not writing as it is kind of testing the
		// collection API.
	}
}
