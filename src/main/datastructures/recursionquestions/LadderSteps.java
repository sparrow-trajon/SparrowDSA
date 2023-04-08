package recursionquestions;

public class LadderSteps {
	
	public static void main(String[] args) {
		int finalStep=4;
		
		int maxStepsCanBeTaken=3;
		
		int maxPossibleWays=getTotalNumberOfWays(finalStep);
		System.out.println(maxPossibleWays);
		
	}

	private static int getTotalNumberOfWays(int finalStep) {
			
		if(finalStep== 0) {
			return 1;
		}
		else if(finalStep< 0) {
			return 0;
		}
		else {
			
			return getTotalNumberOfWays(finalStep-1)+getTotalNumberOfWays(finalStep-2)+getTotalNumberOfWays(finalStep-3);
		}
	}

}
