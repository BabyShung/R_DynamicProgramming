import Applications.BestTimeToBuyAndSell;
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
	}

}
