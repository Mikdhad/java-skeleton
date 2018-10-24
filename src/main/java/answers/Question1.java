package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
		// TODO Auto-generated method stub
		int n = portfolios.length;
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				int value = portfolios[i] ^ portfolios[j];
				if (value > max) {
					max = value;
				}
			}
		}
		return max;
	}
}
