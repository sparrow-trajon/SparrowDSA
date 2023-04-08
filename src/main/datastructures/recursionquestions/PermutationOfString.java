package recursionquestions;

public class PermutationOfString {
	
	public static void main(String[] args) {
		String str="abc";
		
		printPermutation(str, "");
		
	}

	private static void  printPermutation(String str, String s) {
		if(str.length()==0) {
			System.out.println(s);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			String a= str.substring(0,i)+str.substring(i+1);
			printPermutation(a, s+c);
		}
	}

}
