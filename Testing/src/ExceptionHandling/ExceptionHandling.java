package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("...........");
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter the number");
			int num= sc.nextInt();
			System.out.println(100/num);
			
		}catch(ArithmeticException e) {
			System.out.println("Invalid");
			System.out.println(e.getMessage());
			
		}catch(Exception e) {
			
		}
	}

}
