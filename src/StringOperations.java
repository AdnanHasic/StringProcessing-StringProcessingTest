
public class StringOperations {

	public int stringLengthCheckLettersOnly(String text) {

		text = text.replace(" ", "");

		return text.length();
	}

	public String charactersAtEvenPositions(String text) {

		char c[] = text.toCharArray();

		for (int i = 1; i < text.length(); i += 2) {

			if (!Character.isAlphabetic(text.charAt(i)) || (i % 2 != 0)) {

				c[i] = ' ';

			} else {
				continue;
			}
		}

		text = new String(c).replace(" ", "");

		return text;

	}
}
