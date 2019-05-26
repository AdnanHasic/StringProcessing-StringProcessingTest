
public class StringOperations {

	public int stringLengthCheckLettersOnly(String text) {

		text = text.replace(" ", "");

		return text.length();
	}

	public String charactersAtEvenPositions(String text) {

		char c[] = text.toCharArray();

		for (int i = 0; i < text.length(); i++) {

			if (!Character.isAlphabetic(text.charAt(i)) || (i % 2 != 0)) {

				c[i] = ' ';

			}
		}

		text = new String(c).replace(" ", "");

		return text;

	}

	public String charactersAtOddPositions(String text) {

		char c[] = text.toCharArray();

		for (int i = 0; i < text.length(); i++) {

			if (!Character.isAlphabetic(text.charAt(i)) || (i % 2 == 0)) {

				c[i] = ' ';

			}
		}

		text = new String(c).replace(" ", "");

		return text;

	}

	public int numberOfUpperCase(String text) {

		int counterOfUpperCase = 0;

		for (int i = 0; i < text.length(); i++) {

			if (Character.isUpperCase(text.charAt(i))) {
				counterOfUpperCase++;
			}
		}

		return counterOfUpperCase;
	}

	public int numberOfLowerCase(String text) {

		int counterOfLowerCase = 0;

		for (int i = 0; i < text.length(); i++) {

			if (Character.isLowerCase(text.charAt(i))) {
				counterOfLowerCase++;
			}
		}

		return counterOfLowerCase;

	}

	public int numberCharactersThatAreNotletters(String text) {

		int counterCharactersThatAreNotletters = 0;

		for (int i = 0; i < text.length(); i++) {

			if (!Character.isAlphabetic(text.charAt(i))) {
				counterCharactersThatAreNotletters++;
			}
		}

		return counterCharactersThatAreNotletters;

	}
}
