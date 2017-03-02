import java.util.Scanner;

public class StringsIntroduction {
	private static String capitalize(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		scan.close();

		System.out.println((A + B).length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		System.out.println(capitalize(A) + " " + capitalize(B));

	}

}
