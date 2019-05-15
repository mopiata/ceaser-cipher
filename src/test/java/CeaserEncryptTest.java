import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserEncryptTest {
    @Test
    public void textEncrypt_stringNumberRemainsUnchanged_String() {
        CeaserEncrypt testString = new CeaserEncrypt();
        String stringNumber="1";
        assertEquals(stringNumber,testString.textEncrypt("1",1));
    }

    @Test
    public void textEncrypt_spaceRemainsSpace_String() {
        CeaserEncrypt testString = new CeaserEncrypt();
        String stringSpace=" ";
        assertEquals(stringSpace,testString.textEncrypt(" ",1));
    }

    @Test
    public void textEncrypt_singleLetterEncryption_String() {
        CeaserEncrypt testString = new CeaserEncrypt();
        String stringLetter="D";
        assertEquals(stringLetter,testString.textEncrypt("A",3));
    }

    @Test
    public void textEncrypt_singleWordEncryption_String() {
        CeaserEncrypt testString = new CeaserEncrypt();
        String stringResult="DBU";
        assertEquals(stringResult,testString.textEncrypt("CAT",1));
    }

    @Test
    public void textEncrypt_fullSentenceEncrypt_String(){
        CeaserEncrypt testString = new CeaserEncrypt();
        String stringResult="J BN B HJSM";
        assertEquals(stringResult,testString.textEncrypt("I AM A GIRL",1));
    }
}