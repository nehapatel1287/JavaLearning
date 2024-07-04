package TestHello;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int arr[]= {1,3,2,6,4};
		int largestNumber=0;
		int smallestNumber=0;
		Arrays.sort(arr);
		for(int el:arr) {
			if(el>largestNumber) {
				smallestNumber=largestNumber;
				largestNumber=el;
			}
		}
		
		System.out.println("second largest number is: "+smallestNumber);
		
//		for(int i=0;i<arr.length-1;i++) {
//			if()
//		}
	}

}
