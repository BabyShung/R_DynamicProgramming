import Applications.BestTimeToBuyAndSell;
import Applications.JumpGame;
import Applications.LongestCommonSequence;
import Applications.LongestCommonSubstring;
import Applications.LongestIncreasingSequence;
import Applications.MaxSubArray;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MaxSubArray msa = new MaxSubArray();
		int[] msa1 = { 2, 6, -5, 7, -9, -3 };
		System.out.println(msa.maxSubArray(msa1));
		System.out.println(msa.maxSubArray2(msa1));
		System.out.println(msa.maxSubArray3(msa1));

		BestTimeToBuyAndSell bttbas = new BestTimeToBuyAndSell();
		int[] btta = { 8, 4, 9, 10, 13 };
		System.out.println("maxProfit " + bttbas.maxProfit(btta));
		System.out.println("maxProfit " + bttbas.maxProfit2(btta));
		System.out.println("maxProfit " + bttbas.maxProfit3(btta));
		System.out.println("maxProfit " + bttbas.maxProfit4(btta));

		LongestCommonSequence lcs = new LongestCommonSequence();
		int[] lcsa1 = { 8, 4, 9, 10, 7, 0 };
		int[] lcsa2 = { 8, 1, 4, 6, 10, 9, 5 };
		int[] lcsr = lcs.getLongestCommonSequence(lcsa1, lcsa2);
		for (int tmp : lcsr)
			System.out.print(tmp + " ");
		System.out.println();
		LongestCommonSubstring lcsub = new LongestCommonSubstring();
		lcsub.getLongestCommonSubstring("abcaedf", "wvscaedfgkl");

		LongestIncreasingSequence lis = new LongestIncreasingSequence();
		int[] lisa1 = { 8, 1, 2, 4, 3, 10, 0, 5 };
		int[] lisr = lis.getLongestIncreasingSequence(lisa1);
		for (int tmp : lisr)
			System.out.print(tmp + " ");
		System.out.println();
		int[] lisa2 = { 8, 1, 2, 4, 3, 10, 0, 5 };
		int lisr2 = lis.getLongestIncreasingSequenceDP(lisa2);
		System.out.println("LIS: " + lisr2);

		JumpGame jg = new JumpGame();
		int[] jg1 = { 2, 3, 1, 1, 4 };
		System.out.println("can jump? " + jg.canJump(jg1));
		System.out.println("min jump: " + jg.jump(jg1));
	}

}
