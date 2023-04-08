package dp;

import java.util.Arrays;
import java.util.Scanner;

public class finbonacci {
	public static void main(String[] args) {
		
		System.out.println("Enter the number>>");
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int i=0;
		/*
		 * while(i<=x) { int val=fib(i); System.out.print(val+ "  "); i++; }
		 */
//		fibDPBT(x);
		int[] fb= new int[x+1];
		fb[0]=0;
		fb[1]=1;
		fibDPTD(x, fb);
		
		System.out.println(Arrays.toString(fb));
	}

	private static int fib(int x) {
		
		if(x==0 || x==1) {
			return x;
		}
		
		return fib(x-1)+fib(x-2);
	}
	
	private static void fibDPBT(int x) {
		int[] fb=new int[x];
		fb[0]=0;
		fb[1]=1;
		for(int i=2;i<x;i++) {
			fb[i]=fb[i-1]+fb[i-2];
		}
		
		System.out.println(Arrays.toString(fb));
	}
	
	private static int fibDPTD(int x, int[] fb) {
		if(x==0 || x==1) {
			return x;
		}
		if(fb[x]!=0) {
			return fb[x];
		}
		
			
			return fb[x]=fibDPTD(x-1, fb)+ fibDPTD(x-2, fb);
	}

}
