import Applications.BestTimeToBuyAndSell;
import Applications.MaxSubArray;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MaxSubArray msa = new MaxSubArray();
		int[] msa1 = { 1, 0, 5, -4, 3, 6 };
		System.out.println(msa.maxSubArray(msa1));
		System.out.println(msa.maxSubArray2(msa1));

		BestTimeToBuyAndSell bttbas = new BestTimeToBuyAndSell();
		int[] btta = { -1, 5, 22, 3, 8, 7, 1 };
		System.out.println(bttbas.maxProfit(btta));
		System.out.println(bttbas.maxProfit2(btta));
	}

}
