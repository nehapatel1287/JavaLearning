package TestHello;

public class CountOccurence {

	public static void main(String[] args) {
		String str= "abaabbcccbabc";
		int aCount=0;
		int bCount=0;
		int cCount=0;
		for(int i=0;i<str.length();i++) {
			switch(str.charAt(i)){
			case 'a': aCount++;break;
			
			case 'b': bCount++;break;
			case 'c': cCount++;break;
			
			}
		}
		System.out.print(aCount);
		System.out.print(bCount);
		System.out.print(cCount);
		
	}

}
