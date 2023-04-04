package patterns;

public class SolidPyramid {
	
	public static void main(String[] args) {
		
		int n=6;
		
		printShape(n);
	}

	private static void printShape(int n) {  

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-1;j++) {
				if(j<=n-i) {
					System.out.print(" ");
				}	
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}

}
