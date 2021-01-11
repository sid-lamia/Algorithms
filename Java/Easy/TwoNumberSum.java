import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		Set<Integer> set = new HashSet<Integer>();
		for (int i : array) { 
			int y = targetSum - i;
			if (set.contains(y)) {
				int[] ar = {i, y};
				return ar;
			} else {
				set.add(i);
			}
		}
		
    return new int[0];
  }
}
