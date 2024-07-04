package TestHello;

public class ReverseString {

	public static void main(String[] args) {
		String str="Selenium";
		String rev="";
		System.out.println(str.length());
		
		// Approch 1- charAt()
		/*for(int i=str.length()-1;i>=0;i--) {
			System.out.println(i);
			rev=rev+str.charAt(i);
			
		}
		System.out.println("Reversed String is: "+rev);
	*/
	
		//Approch 2 to convering the string to char array using toCharArray() method
		
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			rev=rev+arr[i];
					}
		System.out.println(rev);
	}
	

}
