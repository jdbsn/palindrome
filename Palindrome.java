package Palindrome;

public class Palindrome {

	public static void main(String[] args) {

		String original = "nurses RuN";
		String reverse = "";
		
			original = original.replaceAll(" ", "").toLowerCase();
		
		for (int a = original.length() - 1; a >= 0; a--) {
			reverse += original.charAt(a);
			reverse = reverse.replaceAll(" ", "").toLowerCase();
		}
		
		if (original.equals(reverse)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
		
	}

}