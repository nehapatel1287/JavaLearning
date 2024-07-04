package TestHello;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,30,30};
		int searchNumber=30;
		int count=0;
		for(int x:arr) {
			if(x==searchNumber) {
				count++;
			}
		}
		System.out.println(count);

	}

}
