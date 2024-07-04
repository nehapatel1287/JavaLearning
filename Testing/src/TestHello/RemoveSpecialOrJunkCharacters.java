package TestHello;

public class RemoveSpecialOrJunkCharacters {

	public static void main(String[] args) {
		String str="wel@co#m$e";
		String newStr=str.replace("@","").replace("#","").replace("$","");
		System.out.println(newStr);
		
	}
}
