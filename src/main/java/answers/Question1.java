package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
		int n = portfolios.length;
		int max = 0;
		for (int i = 0; i < n-1; i++) {
			int ij = portfolios[i];
			for (int j = i; j < n; j++) {
				int value = ij ^ portfolios[j];
				if (value > max) {
					max = value;
				}
			}
		}
		return max;
	}
}
