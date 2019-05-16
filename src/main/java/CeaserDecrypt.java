import java.lang.Character;

public class CeaserDecrypt {
    private String  cipherText;
    private int shiftKey;

    CeaserDecrypt(String input, int shift){
        this.cipherText=input;
        this.shiftKey=shift;
    }

    public String getCipherText() {
        return cipherText;
    }

    public int getShiftKey() {
        return shiftKey;
    }

    public String textDecrypt(String text, int shiftNumber) {

        String plainText="";

        for (int i = 0; i < text.length(); i++) {
            String stringIndex = String.valueOf(text.charAt(i));

            if (stringIndex.matches("[a-zA-Z]+")) {
                Character ciphered_letter = (char) (text.charAt(i) - shiftNumber);

                if (stringIndex.matches("[a-z]+")) {
                    if (ciphered_letter < 'a') {
                        plainText += (char) (text.charAt(i) + (26 - shiftNumber));
                    } else {
                        plainText += ciphered_letter;
                    }
                } else if (stringIndex.matches("[A-Z]+")) {
                    if (ciphered_letter < 'A') {
                        plainText += (char) (text.charAt(i) + (26 - shiftNumber));
                    } else {
                        plainText += ciphered_letter;
                    }
                }
            }
            else {
                plainText += text.charAt(i);
            }
        }
        return plainText;
    }
}