package Palindrome;

public class Palindrome {

	public boolean checkPalindrome (String original) {

		original = original.replaceAll(" ", "").toLowerCase();
		System.out.println(original);
		
		if (original.isBlank()) {
			System.out.println("Blank");
			return false;
		} else {
			
			String reverse = "";
			
			for (int a = original.length() - 1; a >= 0; a--) {
				reverse += original.charAt(a);
				reverse = reverse.replaceAll(" ", "").toLowerCase();
			}
			
			if (original.equals(reverse)) {
				System.out.println("Palindrome");
				return true;
			} else {
				System.out.println("Not a palindrome");
				return false;
			}
		}
		
	}

}