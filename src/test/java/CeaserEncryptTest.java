import org.junit.Test;

import javax.crypto.Cipher;

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

    @Test
    public void textEncrypt_dontEncryptNonAlphabets_String() {
        CeaserEncrypt testString = new CeaserEncrypt();
        String stringResult="?";
        assertEquals(stringResult,testString.textEncrypt("?",1));
    }

    @Test
    public void textEncrypt_lowerUpperCaseEncryption_String() {
        CeaserEncrypt testString=new CeaserEncrypt();
        String stringResult="B dbU";
        assertEquals(stringResult,testString.textEncrypt("A caT",1));
    }

    @Test
    public void textEncrypt_alphabetEncryptLoopsWhenReachesZ_String() {
        CeaserEncrypt testString=new CeaserEncrypt();
        String stringResult="WKH TXLFN EURZQ IRA MXPSV RYHU WKH ODCB GRJ";
        assertEquals(stringResult,testString.textEncrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",3));
    }
}