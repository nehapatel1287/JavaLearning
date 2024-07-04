package TestHello;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abb";
		String ans=" ";
		 if(s.length() == 0) {
			 System.out.println(ans + " String should not be emplty");
			 
		 } else {
			 for(int i=0; i<s.length();i++) {
//				 System.out.println(i);
				 char ch= s.charAt(i); 
				 String str=s.substring(0,i)+s.substring(i+1);
				 System.out.println(ch+str);
			 }
		 }
	}

}
