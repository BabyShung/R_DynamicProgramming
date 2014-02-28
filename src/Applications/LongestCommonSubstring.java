package Applications;
/**
 * Longest common substring:
 * Similar to LCSequence, it is a variant of that.
 *
 *
 * c[i,j] = 0, i=j=0 or j=0 or i=0
 * 		  = c[i-1,j-1] + 1, i,j>0 && A[i] = B[j]
 * 		  = 0, i,j>0 && A[i] != B[j]
 * 
 * 
 * 
 * @author haozheng
 *
 */
public class LongestCommonSubstring {

	public void getLongestCommonSubstring(String s1, String s2) {
		
		char[] x = s1.toCharArray();
		char[] y = s2.toCharArray();
		
		int[][] c = new int[x.length+1][y.length+1];
		int max=0,startIndex=0;
		for(int i = 1; i<=x.length; i++){
			for(int j = 1; j<=y.length; j++){
				//two possiblilities
				if(x[i-1]==y[j-1]){
					c[i][j] = c[i-1][j-1]+1;
					if(c[i][j]>max){
						max = c[i][j];//keep track of the length
						startIndex = i-max;//for getting the LCSub
					}
				}//no need for else, all defalut 0 in the array
			}
		}
		
		print(c);
		DisplayLCS(c,x, max,startIndex);
	}

	private void DisplayLCS(int[][] b,char[] x, int max,int mIndex) {
		
		if(max==0)
			System.out.println("no LCSubstring");

		System.out.println("-----max: "+ max);
		System.out.println("-----maxIndex: "+ mIndex);
		int i = mIndex;
	    while(max > 0)
	    {
	    	System.out.print(x[i++]);
	    	max--;
	    }
	    System.out.println();
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
