import java.util.Scanner;

public class StringReverse {
	private static boolean isPalindrome(String string) {
		return string.equals(new StringBuilder(string).reverse().toString());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Palindrom Control");
		String string = scan.next();
		scan.close();
		
		System.out.println(isPalindrome(string) ? "Yes" : "No");

	}

}
