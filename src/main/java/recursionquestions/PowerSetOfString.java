package recursionquestions;

public class PowerSetOfString {
	public static void main(String[] args) {
		String str="abc";
		int i=0;
		//System.out.println(str.charAt(i));
		//System.out.println(str.substring(i+1));
		printAllPowerSet( str,"");
	}

	private static void printAllPowerSet(String str, String current) {
		
		if(str.length()==0) {
			System.out.println(current);
			return;
		}
		
		//System.out.println(current);
		printAllPowerSet(str.substring(1), current);
		printAllPowerSet(str.substring(1), current+str.charAt(0));
		return ;
	}

}
