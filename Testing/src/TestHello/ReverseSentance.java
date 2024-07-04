package TestHello;

import java.util.Arrays;

public class ReverseSentance {

	public static void main(String[] args) {
		String str="My Name Is Neha Patel";
		String Str[]= str.split(" ");
		
		System.out.print(Arrays.toString(Str));
		for(int i=Str.length-1;i>=0;i--) {
			System.out.print(Str[i]+" ");
		}

	}

}
