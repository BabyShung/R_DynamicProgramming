import Applications.MaxSubArray;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MaxSubArray msa = new MaxSubArray();
		int[] msa1 = { -2, 0, 5, -4, 2 };
		System.out.println(msa.maxSubArray(msa1));
	}

}
