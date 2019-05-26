
public class StringOperations {
	
	
   public int stringLengthCheckLettersOnly(String text) {
	   
	   int brojacSlova = 0;
	   for(int i = 0; i < text.length(); i++) {
		   if (Character.isAlphabetic(text.charAt(i))) {
			   brojacSlova++;
		   }
	   }return brojacSlova;
   }

}
