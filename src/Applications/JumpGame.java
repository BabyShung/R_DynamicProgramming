package Applications;

public class JumpGame {

	public boolean canJump(int[] A) {// O(n) time and O(1) space
		int next = A.length - 1;
		for (int i = A.length - 2; i >= 0; --i) {
			if (A[i] >= (next - i)) {
				next = i;
			}
		}
		return (next == 0);
	}

	public boolean canJump1(int[] A) {// O(n^2) and O(n) space
		if (A.length <= 1)
			return true;
		boolean[] canReach = new boolean[A.length];
		for (int i = A.length - 2, dist = 1; i >= 0; --i, ++dist) {
			if (A[i] >= dist) {
				canReach[i] = true;
			} else {
				int j = 1;
				while (j <= A[i] && !canReach[i + j])
					++j;
				if (j <= A[i])
					canReach[i] = true;
			}
		}
		return canReach[0];
	}

	/**
	 * jump game II
	 * greedy algo
	 * 
	 */
	public int jump(int[] A) {
		int steps = 0, max = 0, next = 0;
		for (int i = 0; i < A.length - 1 && next < A.length - 1; i++) {
			max = Math.max(max, i + A[i]);
			if (i == next) { // ready to jump
				if (max == next)
					return -1; // unreachable
				next = max;
				steps++;
			}
		}
		return steps;
	}

}
