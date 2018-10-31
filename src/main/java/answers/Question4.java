package answers;

public class Question4 {

	public static int selectionFailedTradedesks(String[][] rows, int numberMachines) {
		int len1 = rows.length;
		int len2 = rows[0].length;
		
		if(len1 < 0 || len1 > 100) return 0;
		if(len2 < 0 || len2 > 100) return 0;
		
		numberMachines -= 1;
		
		if(len2 < numberMachines) return 0;

		int min = Integer.MAX_VALUE;
		int startPos = 0;
		int endPos = 0;
		int currentSum = 0;
		
		for(int i=0; i < len1; i++) {
			
			startPos = 0;
			endPos = 0;
			currentSum = 0;
			
			for(int j=0; j<len2-numberMachines; j++) {
				
				String pc = rows[i][j];
				
				if(pc.length() == 1 && pc.equals("X")) {
					currentSum = 0;
					startPos = i + 1;
					endPos = i + 1;
				}else {
					currentSum += Integer.parseInt(rows[i][endPos]);
					
					if((endPos - startPos) == numberMachines){
						
						if(currentSum < min) {
							min = currentSum;
							currentSum -= Integer.parseInt(rows[i][startPos]);
							startPos++;
						}
					
					}
					endPos++;
				}
				
			}
			
		}
		
		return min;
	}
}
