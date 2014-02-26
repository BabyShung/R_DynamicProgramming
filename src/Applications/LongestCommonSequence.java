package Applications;

/**
 * Longest common sequence:
 * Doesn't have to be consecutive, but must remain order
 * 
 * Let's define a two-dimension array,
 * i is string A with length i, and j is the string B with length j,
 * c[i,j] means the LCS length of both String A and B
 * 
 * So:
 * 
 * c[i,j] = 0, i=j=0 or j=0 or i=0
 * 		  = c[i-1,j-1] + 1, i,j>0 && A[i] = B[j]
 * 		  = max(c[i-1,j],c[i,j-1]), i,j>0 && A[i] != B[j]
 * 
 * EG:
 * abcdez & cdeghz  -> cdez
 * abcdez & bdcza -> bcz, since c, a is not in the sequence order, but bc is in order
 * 
 * Different from Longest common substring: substring must be consecutive
 * 
 * @author haozheng
 *
 */

public class LongestCommonSequence {
	public void getLongestCommonSequence(String s1, String s2) {

		char[] x = s1.toCharArray();
		char[] y = s2.toCharArray();

		int[][] c = new int[x.length + 1][y.length + 1];

		// start from c[1][1], since row 0 and column 0 should all be 0
		// if either one string is 0, then LCS is also 0
		for (int i = 1; i <= x.length; i++) {
			for (int j = 1; j <= y.length; j++) {
				// three possibilities
				if (x[i - 1] == y[j - 1]) {
					c[i][j] = c[i - 1][j - 1] + 1;
				} else if (c[i - 1][j] >= c[i][j - 1]) {
					c[i][j] = c[i - 1][j];
				} else {
					c[i][j] = c[i][j - 1];
				}
			}
		}
		print(c);
		DisplayLCS(c, x, y);
	}

	private void DisplayLCS(int[][] b, char[] x, char[] y) {
		char[] lcs = new char[b[b.length - 1][b[0].length - 1]];
		int k = lcs.length - 1;
		for (int i = b.length - 1, j = b[0].length - 1; i >= 1 && j >= 1;) {
			if (x[i - 1] == y[j - 1]) {
				lcs[k--] = x[i - 1];
				i--;
				j--;
			} else if (b[i][j - 1] > b[i - 1][j]) {
				j--;
			} else {
				i--;
			}
		}
		System.out.println(lcs);
	}

	private void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("------------");
	}
}
