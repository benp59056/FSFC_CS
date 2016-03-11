package net.picklez.utils.strings;

/**
 * @author Ben Pickering
 * @since 3 Jan 2016 | 15:05:26
 * Description: Levenshtein distance algorithm personally converted from: http://www.dotnetperls.com/levenshtein 
 */

public class LevenshteinCalculator {

	/**
	 * Calculates the difference between two strings as an integer value
	 * @return
	 */
	public static int compare(String s, String t) { 
		int n = s.length(); 
		int m = t.length(); 
		int[][] d = new int[n + 1][m + 1];
		
		if (n == 0)
			return m;

		if (m == 0)
			return n;

		for (int i = 0; i <= n; d[i][0] = i++){}

		for (int j = 0; j <= m; d[0][j] = j++){}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				int cost = (t.charAt(j - 1) == s.charAt(i - 1)) ? 0 : 1;
				d[i][j] = Math.min(Math.min(d[i - 1][j] + 1, d[i][j - 1] + 1), d[i - 1][j - 1] + cost);
			}
		}
		return d[n][m];
	}
}