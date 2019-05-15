import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.lang.Character;

public class CeaserEncrypt {
    public String textEncrypt(String text, int shiftKey){
        if(text.matches(".*\\d.*")){
            return text;
        }else if(text.matches(" ")){
            return text;
        }else if(text.matches("[a-zA-Z]+")){
            String strIncremented=new String();
                for(int i=0;i<text.length();i++){
                    strIncremented+=(char)(text.charAt(i)+shiftKey);
                }
            return (strIncremented);
        } else
        return null;
    }
}
