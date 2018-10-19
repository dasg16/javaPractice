package practice;

class StringPractice {

	public void validStringPalindromeUsingReverse(String tr) {
		// Since java doesn't provide any reverse method for String
		// so we need to use StringBuilder or StringBuffer

		StringBuffer strBuffer = new StringBuffer(tr);
		strBuffer.reverse();

		if (strBuffer.toString().equals(tr)) {
			System.out.println("Palindrome");
		} else if (tr == null) {
			System.out.println("Not Palindrome");
		}

		else {
			System.out.println("Not Palindrome");
		}
	}

	public void validStringPalindromeWithoutReverse(String tr) {
		// Since java doesn't provide any reverse method for String
		// so we need to use StringBuilder or StringBuffer
		int length = tr.length();
		if (length == 0) {
			System.out.println("Not Palindrome");
		}
		for (int i = 0; i < length / 2; i++) {

			if (tr.charAt(i) != (tr.charAt(length - i - 1))) {
				System.out.println("Not Palindrome");
			}
		}
		System.out.println("Palindrome");

	}

}

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringPractice sp = new StringPractice();

		String str = "abcba";
		sp.validStringPalindromeUsingReverse(str);

		sp.validStringPalindromeWithoutReverse(str);

	}

}
