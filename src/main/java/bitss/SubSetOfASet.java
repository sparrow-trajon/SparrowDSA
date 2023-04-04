package bitss;

public class SubSetOfASet {	
	public static void main(String[] args) {
		
		int[] a = {10,23,54};
		
		double len= 1<<a.length;
		
		System.out.println("total subsets >>"+ len);
		for(int i=0;i<len;i++) {
			System.out.println(" subset ");
			System.out.print("{");
			for(int j=0;j<a.length;j++) {
				
				if((i & 1<<j) ==1<<j) {
					System.out.print( a[j]+" ");
				}
			}
			System.err.print("}, \n");
		}
	}

}
