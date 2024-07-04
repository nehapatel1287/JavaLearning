package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = null;
		try {
			System.out.println(s.length());

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.print("finally");
		}
	}

}
