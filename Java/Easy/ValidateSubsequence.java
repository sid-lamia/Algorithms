import java.util.*;

class Program {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int seq = 0;
		for (int a : array) {
			if (seq < sequence.size()) {
				if (a == sequence.get(seq)) {
					seq++; 
				}
			}
		}
		return seq == sequence.size();
  }
}
