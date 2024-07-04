package TestHello;

public class PalindromeString {

	public static void main(String[] args) {
		String P1="madam111";
		String rev="";
		char[] P2=P1.toCharArray();
		for(int i=P2.length-1;i>=0;i--) {
			rev=rev+P2[i];
		}
		System.out.println(rev);
		if(P1.equals(rev)) {
			System.out.println("Is palindrome");
		}else {
			System.out.println("Is not palindrome");
		}

	}

}
