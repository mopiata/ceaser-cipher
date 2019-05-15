import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.lang.Character;

public class CeaserEncrypt {
    public String textEncrypt(String text, int shiftKey){

        String cipherText="";

        for(int i=0;i<text.length();i++){
            String stringIndex=String.valueOf(text.charAt(i));

            if(stringIndex.matches(".*\\d.*")||stringIndex.matches(" ")){
                //text.charAt(i)=text.charAt(i);
                cipherText+=text.charAt(i);
            } else if(stringIndex.matches("[a-zA-Z]+")){
                //text.charAt(i)+=(char)(text.charAt(i)+shiftKey);
                char ciphered_letter = (char) (text.charAt(i) + shiftKey);
                cipherText+=ciphered_letter;
            }
        }
        return cipherText;
    }
}
