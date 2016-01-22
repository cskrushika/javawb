package puzzleimpl.arrays;

/*
 * You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. Traverse array only once.
 * 
 * Maintain two indexes. Initialize first index left as 0 and second index right as n-1.

  Do following while left < right
  a) Keep incrementing index left while there are 0s at it
  b) Keep decrementing index right while there are 1s at it
  c) If left < right then exchange arr[left] and arr[right]
 * 
 * http://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
 * 
 * */
public class Segregate0sAnd1s {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
		/* Initialize left and right indexes */
		segregate0s1s(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i]+",");
	}

	/*Function to put all 0s on left and all 1s on right*/
	public static void segregate0s1s(int[] arr, int left, int right) {
		while (left < right) {
			/* Increment left index while we see 0 at left */
			while (arr[left] == 0 && left < right) {
				left++;
			}
			/* Decrement right index while we see 1 at right */
			while (arr[right] == 1 && left < right) {
				right--;
			}
			/*
			 * If left is smaller than right then there is a 1 at left and a 0 at right. Exchange arr[left] and arr[right]
			 */
			if (left < right) {
				arr[left++] = 0;
				arr[right--] = 1;

			}
		}
	}
}
