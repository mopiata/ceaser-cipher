import java.lang.Character;

public class CeaserDecrypt {
    public String textDecrypt(String cipherText, int shiftKey) {

        String plainText="";

        for (int i = 0; i < cipherText.length(); i++) {
            String stringIndex = String.valueOf(cipherText.charAt(i));

            if (stringIndex.matches("[a-zA-Z]+")) {
                Character ciphered_letter = (char) (cipherText.charAt(i) - shiftKey);

                if (stringIndex.matches("[a-z]+")) {
                    if (ciphered_letter < 'a') {
                        plainText += (char) (cipherText.charAt(i) + (26 - shiftKey));
                    } else {
                        plainText += ciphered_letter;
                    }
                } else if (stringIndex.matches("[A-Z]+")) {
                    if (ciphered_letter < 'A') {
                        plainText += (char) (cipherText.charAt(i) + (26 - shiftKey));
                    } else {
                        plainText += ciphered_letter;
                    }
                }
            }
            else {
                plainText += cipherText.charAt(i);
            }
        }
        return plainText;
    }
}