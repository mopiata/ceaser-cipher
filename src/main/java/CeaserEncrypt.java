import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.lang.Character;

public class CeaserEncrypt {
    public String textEncrypt(String text, int shiftKey) {

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