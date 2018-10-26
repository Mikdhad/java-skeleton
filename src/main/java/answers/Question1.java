package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
		// TODO Auto-generated method stub
		int n = portfolios.length;
		int max = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i; j < n; j++) {
				int value = portfolios[i] ^ portfolios[j];
				if (value > max) {
					max = value;
				}
			}
		}
		return max;
	}
}
