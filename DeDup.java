package SEI;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Tejesh
 *
 */
public class DeDup {

	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34,
			86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3, 20, 17, 8, 15,
			6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17,
			16, 3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17,
			10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	// SOLUTION-1
	// Using two "for loops" known as Brute-Force Search.
	public int[] removeDupUsingForLoop() {

		int arrLength = randomIntegers.length;

		for (int i = 0; i < randomIntegers.length; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (randomIntegers[i] == randomIntegers[j]) {
					int shiftLeft = j;
					for (int k = j + 1; k < arrLength; k++, shiftLeft++) {
						randomIntegers[shiftLeft] = randomIntegers[k];
					}
					arrLength--;
					j--;
				}
			}
		}

		int[] noDupList = new int[arrLength];
		for (int i = 0; i < arrLength; i++) {
			noDupList[i] = randomIntegers[i];
		}
		return noDupList;
	}

	// SOLUTION-2
	// Sort the array first and then using two "for loops" do the same removal
	// operation. It will reduce the number of iteration of loop and it will be
	// faster.
	public int[] sortAndRemoveDup() {
		Arrays.sort(randomIntegers);

		int arrLength = randomIntegers.length;

		for (int i = 0; i < randomIntegers.length; i++) {
			for (int j = i + 1; j < arrLength; j++) {
				if (randomIntegers[i] == randomIntegers[j]) {
					int shiftLeft = j;
					for (int k = j + 1; k < arrLength; k++, shiftLeft++) {
						randomIntegers[shiftLeft] = randomIntegers[k];
					}
					arrLength--;
					j--;
				}
			}
		}

		int[] noDupList = new int[arrLength];
		for (int i = 0; i < arrLength; i++) {
			noDupList[i] = randomIntegers[i];
		}
		return noDupList;
	}

	// SOLUTION-3
	// Using HashSet, As we know the property of Set that it doesn't contains
	// the duplicate value.
	public Set<Integer> removeDupUsingHashSet() {
		Set<Integer> setValue = new LinkedHashSet<Integer>();
		for (int i = 0; i < randomIntegers.length; i++) {
			setValue.add(randomIntegers[i]);
		}
		return setValue;
	}

	public static void main(String[] args) {
		DeDup obj = new DeDup();

		int[] noDupListSol1 = obj.removeDupUsingForLoop();

		System.out.println("Solution-1 Result: ");
		for (int i = 0; i < noDupListSol1.length; i++) {
			System.out.print(noDupListSol1[i] + ", ");
		}

		Set<Integer> setString = obj.removeDupUsingHashSet();
		System.out.println("\nSolution-3 Result:\n" + setString);

		int[] noDupListSol2 = obj.sortAndRemoveDup();

		System.out.println("\nSolution-2 Result: ");
		for (int i = 0; i < noDupListSol2.length; i++) {
			System.out.print(noDupListSol2[i] + ", ");
		}

	}
}
