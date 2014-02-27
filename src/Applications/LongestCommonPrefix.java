package Applications;

/**
 * Longest Common Prefix Don't know if it has a DP solution.
 * 
 * But a pretty straightforward way is to scan every first letter. If the same,
 * go on. If not, break ---- O(n*m)
 * 
 * @author haozheng
 * 
 */

public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) { // important to check when you are done coding
			return "";
		}

		String first = strs[0];
		int i = 0;
		char tmp;
		while (i < first.length()) {
			tmp = first.charAt(i);
			for (int j = 1; j < strs.length; j++) {
				// the first word may longer or shorter,
				// if longer, must check the compared ones
				// if shorter, done checking
				if (i >= strs[j].length() || tmp != strs[j].charAt(i)) {
					return first.substring(0, i);
				}
			}
			i++;
		}
		return first;
	}
}
