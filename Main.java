import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("String 1");
		String stringGanz1 = input.nextLine();
		String[] string1 = stringGanz1.split("");
		System.out.println("String 2");
		String stringGanz2 = input.nextLine();
		String[] string2 = stringGanz2.split("");

		// i = suchposition im String 1
		for (int i = 0; i < string1.length - (string2.length - 1); i++) {
			Boolean contains = false;
			// Kommt kein Char vom String 2 im String 1 vor wird die Suchposition um die
			// lÃ¤nge des String 2 nach vorne geschoben
			if (stringGanz1.length() > i + 2) {
				for (int j = 0; j < string2.length; j++) {
					if (stringGanz2.contains(string1[i + j])) {
						contains = true;
					}
				}
			}

			// Ist ein einzelner Char von String 2 im String 1 vorhanden wird hochgezÃ¤hlt
			// bis die lÃ¤nge des String 2
			int found = 0;
			if (contains == true || stringGanz1.length() <= i + 2) {
				for (int j = 1; j <= string2.length; j++) {
					if (string1[i + string2.length - j].equals(string2[string2.length - j])) {
						found += 1;
					}
				}
			}

			// wurde eine Ãœbereinstimmung der zwei String gefunden wird die Startposition
			// ausgegeben
			if (found == string2.length) {
				System.out.println("String 2 " + stringGanz2 + " found on String 1 position " + (i + 1));
			}

			// nach vorne schieben der nÃ¤chsten Suchposition
			if (contains == false) {
				i += string2.length - 1;
			}
		}

		input.close();
	}
}
