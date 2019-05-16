import java.lang.Character;

public class CeaserEncrypt {
    private String  plainText;
    private int shiftKey;

    public CeaserEncrypt(String input, int number){
        this.plainText=input;
        this.shiftKey=number;
    }

    

    public String getPlainText() {
        return plainText;
    }

    public int getShiftKey() {
        return shiftKey;
    }

    public String textEncrypt(String text, int shiftNumber) {

        String cipherText = "";

        for (int i = 0; i < text.length(); i++) {
            String stringIndex = String.valueOf(text.charAt(i));

            if (stringIndex.matches("[a-zA-Z]+")) {
                Character ciphered_letter = (char) (text.charAt(i) + shiftKey);

                if (stringIndex.matches("[a-z]+")) {
                    if (ciphered_letter > 'z') {
                        cipherText += (char) (text.charAt(i) - (26 - shiftKey));
                    } else {
                        cipherText += ciphered_letter;
                    }
                } else if (stringIndex.matches("[A-Z]+")) {
                    if (ciphered_letter > 'Z') {
                        cipherText += (char) (text.charAt(i) - (26 - shiftKey));
                    } else {
                        cipherText += ciphered_letter;
                    }
                }
            }
            else {
                cipherText += text.charAt(i);
            }
        }
        return cipherText;
    }
}