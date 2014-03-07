package Applications;

/**
 * 		%
 * 
 * MaxSubArray
 * 
 * Given an int array (elements can be both positive and negative, return the
 * maximum consecutive largest sum
 * 
 * 
 * M(k) = max(M(k-1)+Ak,Ak)
 * 
 * First, if the max-sum before Ak, that is M(k-1) ,which is the max-sum of
 * consecutive sequence ending at A(k-1), is larger than or equal to 0, then
 * M(k-1)+Ak will be equivalent to the max-sum where k=2,...n , no matter what
 * value Ak is. This means M(k-1)+Ak >= Ak. So we let M(k)=M(k-1)+Ak Second,
 * similarly, if M(k-1)<0, then Ak will be equivalent to the max-sum, no matter
 * what value Ak is. This means M(k-1)+Ak<Ak. So we let M(k)=Ak
 * 
 * @author haozheng
 * 
 */

public class MaxSubArray {

	public int maxSubArray(int[] A) {// O(n) space

		if (A == null)
			return 0;

		int[] buffer = new int[A.length];
		buffer[0] = A[0];
		int max = buffer[0];

		for (int i = 1; i < A.length; i++) {
			buffer[i] = Math.max(A[i], buffer[i - 1] + A[i]);
			max = Math.max(buffer[i], max); // keep track of the largest sum
		}
		return max;
	}

	public int maxSubArray2(int[] A) {// O(1) space

		if (A == null)
			return 0;
		int last = A[0];
		int max = last;
		for (int i = 1; i < A.length; i++) {
			last = Math.max(A[i], last + A[i]);
			max = Math.max(last, max); // keep track of the largest sum
		}
		return max;
	}

	public int maxSubArray3(int[] A) {// O(1) space

		int last = 0;
		int max = A[0];
		for (int i = 0; i < A.length; i++) {
			if (last >= 0)
				last += A[i];
			else
				last = A[i];
			max = Math.max(last, max); // keep track of the largest sum
		}
		return max;
	}
}