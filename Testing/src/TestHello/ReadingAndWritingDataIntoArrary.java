package TestHello;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataIntoArrary {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the value");
			a[i]=sc.nextInt();
		}
		System.out.println("print the valur of array "+Arrays.toString(a));
		
	}

}
