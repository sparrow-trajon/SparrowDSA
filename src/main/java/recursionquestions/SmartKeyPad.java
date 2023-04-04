package recursionquestions;

public class SmartKeyPad {
	
	static String[] lookUp= {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"	};

	public static void main(String[] args) {
			
		String in="258";
		printAllMsgs(in, "",0);
	}

	private static void printAllMsgs(String in, String string, int i) {
		
		if(i==in.length()) {
			System.out.println(string);
			return;
		}
		
		String tem= SmartKeyPad.lookUp[Integer.parseInt(String.valueOf(in.charAt(i)))];
		
		for(int x=0;x<tem.length();x++) {
			printAllMsgs(in, string+tem.charAt(x), i+1);
		}
		
	}

}
