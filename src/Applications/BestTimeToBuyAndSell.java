package Applications;

/**
 * 	@*1
 * Best Time To Buy And Sell
 * 
 * You can buy stock from day i and sell it on day j (0<=i<j<=n-1 ---array
 * index, assuming day 1 to day n). Besides, every day the stock has a price
 * value k, and k changes as days go on.
 * 
 * find the best time to buy and sell. In other words, get a largest difference
 * between two days.
 * 
 * 1. Brute force solution. For every day, calculate the difference with other
 * days. EG: diff = a[j] - a[i] Calculate all and return the largest difference
 * ---- O(n^2)
 * 
 * 2.diff solution. Reduce to max subarray. Define b[i]=a[i+1]-a[i] (0 <= i <
 * n-1);
 * 
 * Now if we calculate sum(b[i],b[j]): for k = i to k = j, assume we buy stock
 * in day i and sell in day j + 1 for the scope of b, it is only from 0 to n-2
 * b[i] + b[i+1] + ... + b[j] = (a[i+1]-a[i]) + (a[i+2]-a[i+1]) + ... +
 * (a[j+1]-a[j]) = a[j+1] - a[i] (0 <= i <= j < n-1)
 * 
 * we know a[j+1] - a[i] is the difference we want to calculate, in order to
 * make it largest, we simply want to calculate the max subarray from i to j+1
 * 
 * @author haozheng
 * 
 */

public class BestTimeToBuyAndSell {

	public int maxProfit(int[] prices) { // only get profit >= 0
		int maxp = 0;
		int diff = 0;
		for (int i = prices.length - 2; i >= 0; i--) {
			if (diff >= 0)// accumulate if positive
				diff += prices[i + 1] - prices[i];
			else
				// diff is no more +=, which means it discarded the negative one
				diff = Math.max(0, prices[i + 1] - prices[i]);
			maxp = Math.max(diff, maxp);
		}
		return maxp;
	}

	public int maxProfit2(int[] prices) { // only get profit >= 0
		int maxp = 0;
		int diff = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (diff >= 0)
				diff += prices[i + 1] - prices[i];
			else
				diff = Math.max(0, prices[i + 1] - prices[i]);
			maxp = Math.max(diff, maxp);
		}
		return maxp;
	}

	public int maxProfit3(int[] prices) { // can also get least lost
		int maxp = prices[1] - prices[0];
		int diff = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (diff >= 0)
				diff += prices[i + 1] - prices[i];
			else
				diff = Math.max(diff, prices[i + 1] - prices[i]);
			maxp = Math.max(diff, maxp);
		}
		return maxp;
	}

	public int maxProfit4(int[] prices) { // can also get least lost
		int maxp = prices[1] - prices[0];
		int diff = maxp;
		for (int i = 1; i < prices.length - 1; i++) {
			if (diff >= 0)
				diff += prices[i + 1] - prices[i];
			else
				diff = prices[i + 1] - prices[i];
			maxp = Math.max(diff, maxp);
		}
		return maxp;
	}
}
