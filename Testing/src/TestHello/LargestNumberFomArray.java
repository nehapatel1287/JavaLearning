package TestHello;

public class LargestNumberFomArray {

	public static void main(String[] args) {
		int arr[]= {1,4,2,3,5};
		int largNumber=0;
		
		for(int i=0;i<arr.length;i++) {
			if(largNumber < arr[i]) {
				largNumber=arr[i];
			}
		}
		System.out.println("largest number is"+ largNumber);
		

	}

}
