package m411.algorithmus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("String 1");
		String string11 = input.nextLine();
		String[] string1 = string11.split("");
		System.out.println("String 2");
		String string22 = input.nextLine();
		String[] string2 = string22.split("");

		for (int i = 0; i < string1.length - (string2.length - 1); i++) {
			int found = 0;
			for (int j = 1; j <= string2.length; j++) {
				if (string1[i + string2.length - j].equals(string2[string2.length - j])) {
					found += 1;
				}
			}

			if (found == string2.length) {
				System.out.println("string 2 " + string22 + " found on string 1 position " + (i + 1));
			}

			if (found == 0) {
				i += string2.length - 1;
			}

		}

	}
}
