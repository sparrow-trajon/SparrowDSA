package arrayquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
	
	 public  void nextPermutation(int[] nums) {
		  int currentNum=-1;
		 String s="";
		 for(int i=0;i<nums.length;i++) {
			 s+=String.valueOf(nums[i]);
		 }
		 currentNum=Integer.parseInt(s);
		 List<String> resultString=new ArrayList<String>();
		 findPermutation(s,"",resultString,currentNum);
		 Collections.sort(resultString);
		
		 System.out.println( resultString.stream().findFirst().get().toCharArray());
	    }
	 private void findPermutation(String s,String res, List<String> resList, int currentNum) {
		 if(s.length()==0 ) {
			if(Integer.parseInt(res)>currentNum) resList.add(res);
		//	 System.out.println(res);
			 return ;
		 }
		for(int i=0;i<s.length();i++) {
			 char c= s.charAt(i);
			 String ps=s.substring(0,i)+s.substring(i+1);
			 findPermutation(ps, res+c, resList,currentNum);
			 
		}
	}
	public static void main(String[] args) {
		int[] a= {1,1,5};
		new NextPermutation().nextPermutation(a);
	}

}
