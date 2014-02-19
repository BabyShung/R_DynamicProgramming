package Applications;

/**
 * 
 * M(k) = max(M(k-1)+Ak,Ak)
 * 
 * 
 * @author haozheng
 * 
 */

public class MaxSubArray {

	public int maxSubArray(int[] A) {

		if (A == null)
			return 0;

		int[] buffer = new int[A.length];
		buffer[0] = A[0];
		int max = buffer[0];

		for (int i = 1; i < A.length; i++) {
			buffer[i] = Math.max(A[i], buffer[i - 1] + A[i]);
			max = Math.max(buffer[i], max);
		}
		return max;
	}
}