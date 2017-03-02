import java.util.Arrays;
import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int groupLength = scan.nextInt();
		scan.close();

		int groups = input.length() - groupLength + 1;
		String[] subStrings = new String[groups];
		for (int i = 0; i < groups; i++)
			subStrings[i] = input.substring(i, i + groupLength);

		Arrays.sort(subStrings);
		System.out.println(subStrings[0]);
		System.out.println(subStrings[groups - 1]);

	}

}
