package stringsquestions;

public class SubSequenceOfString {
	
	
	public static void main(String [] args) {
		
		String s="manish";
		 int totalSubSet=1<<s.length();
		 for(int i=0;i<totalSubSet;i++) {
			 for(int j=0;j<s.length();j++) {
				 if((i & (1<<j))!=0) {
					 System.out.print(s.charAt(j)+" ");
				 }
			 }
			 System.out.print("\n");
		 }
	}
}
