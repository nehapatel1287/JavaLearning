package TestHello;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		String str=" whi te Spa ce";
		String[] newStr=str.split(" ");
		for(int i=0;i<newStr.length;i++) {
			System.out.print(newStr[i]);
		}
		
		

	}

}
