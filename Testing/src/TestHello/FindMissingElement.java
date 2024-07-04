package TestHello;

//import java.util.Arrays;
//import java.util.Scanner;

public class FindMissingElement {

	public static void main(String[] args) {
		int a[]= {1,3,5,2};
		int arr=a.length+1;
		
		int sum=arr*(arr+1)/2;
		
		
		for(int i=0;i<a.length;i++) {
			sum=sum-a[i];
		}
		System.out.println("Missed element is: "+sum);
		
	}

}
