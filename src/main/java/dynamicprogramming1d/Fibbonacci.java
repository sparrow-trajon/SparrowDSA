package dynamicprogramming1d;

import java.util.Arrays;

public class Fibbonacci {

	public static void main(String[] args) {
		int n=5;
		int[] mem= new int[n+1];
		
		
		int res=ff(n, mem);
		System.out.println(Arrays.toString(mem));
	}

	private static int ff(int n, int[] mem) {
		
		if(n==0 || n==1) {
			System.out.println(n);
			mem[n]=n;
		return n;
		}
		if(mem[n]!=0) {
			
			System.out.println(mem[n]);
			return mem[n];
		}
		return mem[n]=ff(n-1, mem)+ff(n-2, mem);
	}
}
