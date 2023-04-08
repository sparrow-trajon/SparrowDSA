package patterns;

public class HollowPyramid {
	
	public static void main(String[] args) {
		
		int n=7;
		
		printHollowPymd(n);
	}

	private static void printHollowPymd(int n) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==1 || i==n ) {
					System.out.print("*");
				}
				else {
					if(j==1 || j==i)
					System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
