import Applications.BestTimeToBuyAndSell;
import Applications.LongestCommonSequence;
import Applications.LongestCommonSubstring;
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
		int[] btta = { 8, 4, 9, 10 };
		System.out.println(bttbas.maxProfit(btta));
		System.out.println(bttbas.maxProfit2(btta));
		System.out.println(bttbas.maxProfit3(btta));
		
		LongestCommonSequence lcs = new LongestCommonSequence();
		lcs.getLongestCommonSequence("abcdefgi", "abyczdeo");
		
		LongestCommonSubstring lcsub = new LongestCommonSubstring();
		lcsub.getLongestCommonSubstring("abcaedf", "wvscaedfgkl");
		
		String a = "a";
		System.out.println("?? "+a.substring(0, 0));
	}

}
