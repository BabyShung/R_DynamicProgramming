package Applications;

/**
 * Longest Consecutive Sequence
 * 
 * Current solution is not using DP, not sure if there is a DP, sad~
 * 
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * EG,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * Your algorithm should run in O(n) complexity.
 *
 * sol:
 * Use hashSet and first add all elements in the hashSet.
 * For each of the element in the array, check its --V and ++V (respectively).
 * If that value exists in the set, keep on doing that, also keep track of 
 * length using counter.
 * Return the max counter
 * 
 */

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public int getLongestConsecutive(int[] num) {
		Set<Integer> s = new HashSet<Integer>();
		int max = 1, count;
		for (int i : num)
			s.add(i);

		for (int e : num) {
			int left = e - 1;
			int right = e + 1;
			count = 1;

			while (s.contains(left)) {
				count++;
				s.remove(left);// has to remove, in case of duplicated ele
				left--;
			}
			while (s.contains(right)) {
				count++;
				s.remove(right);// has to remove, in case of duplicated ele
				right++;
			}
			max = Math.max(max, count);

		}
		return max;
	}
}
