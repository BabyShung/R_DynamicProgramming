package Applications;

import java.util.Arrays;

/**
 * Longest Increasing Sequence (classic DP)
 * 
 * sol1: A = {a1,a2,...,an-1}
 * 
 * Let's define L(j) to be the length of LIS ending at any position j.
 * 
 * L(j)={ max(L(i))+1, i<j && a[i]<=a[j] }
 * 
 * = 1, i<j && a[i]>a[j]
 * 
 * 
 * 
 * sol2: (combine LCS)
 * 
 * 1.sort and get a new array A'
 * 
 * 2.Then the LCS between A and A' will be the answer EG: {1,3,5,4,0,9}---
 * sort:{0,1,3,4,5,9}--- LCS:{1,3,5,9}.
 * 
 * @author haozheng
 * 
 */

public class LongestIncreasingSequence {
	public int[] getLongestIncreasingSequence(int[] a) {
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		Arrays.sort(a);
		LongestCommonSequence lcs = new LongestCommonSequence();
		return lcs.getLongestCommonSequence(a, b);
	}

	public int getLongestIncreasingSequenceDP(int[] a) {
		int[] l = new int[a.length];
		Arrays.fill(l, 1);// 1 case

		for (int i = 1; i < a.length; i++) {// max(L(i))+1 case
			for (int j = 0; j < i; j++) {
				if (a[i] > a[j] && l[i] < l[j] + 1)
					l[i] = l[j] + 1;
			}
		}
		return print(l);
	}

	private int print(int[] l) {
		int max = 0;
		for (int tmp : l) {
			System.out.print(tmp + " ");
			if (max < tmp)
				max = tmp;
		}
		System.out.println();
		return max;
	}
}
