import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserEncryptTest {
    //tests if my object(testString) is an instance of CeaserEncrypt
    @Test
    public void newCeaserEncrypt_instantiatesCorrectly() {
        CeaserEncrypt testString=new CeaserEncrypt("1",1);
        assertEquals(true, testString instanceof CeaserEncrypt);
    }


    @Test
    public void newCeaserEncrypt_getsPlainTextCorrectly_String() {
        CeaserEncrypt testString=new CeaserEncrypt("Hello girl!",1);
        assertEquals("Hello girl!",testString.getPlainText());
    }

    @Test
    public void newCeaserEncrypt_getsShiftKeyCorrectly_String() {
        CeaserEncrypt testString=new CeaserEncrypt("Hello girl!",1);
        assertEquals(1,testString.getShiftKey());
    }

    @Test
    public void textEncrypt_stringNumberRemainsUnchanged_String() {
        CeaserEncrypt testString = new CeaserEncrypt("1",1);
        String stringNumber="1";
        assertEquals(stringNumber,testString.textEncrypt(testString.getPlainText(),testString.getShiftKey()));
    }

    @Test
    public void textEncrypt_spaceRemainsSpace_String() {
        CeaserEncrypt testString = new CeaserEncrypt(" ",1);
        String stringSpace=" ";
        assertEquals(stringSpace,testString.textEncrypt(testString.getPlainText(),testString.getShiftKey()));
    }

    @Test
    public void textEncrypt_singleLetterEncryption_String() {
        CeaserEncrypt testString = new CeaserEncrypt("A",3);
        String stringLetter="D";
        assertEquals(stringLetter,testString.textEncrypt(testString.getPlainText(),testString.getShiftKey()));
    }

    @Test
    public void textEncrypt_singleWordEncryption_String() {
        CeaserEncrypt testString = new CeaserEncrypt("CAT",1);
        String stringResult="DBU";
        assertEquals(stringResult,testString.textEncrypt(testString.getPlainText(),testString.getShiftKey()));
    }

    @Test
    public void textEncrypt_fullSentenceEncrypt_String(){
        CeaserEncrypt testString = new CeaserEncrypt("I AM A GIRL",1);
        String stringResult="J BN B HJSM";
        assertEquals(stringResult,testString.textEncrypt(testString.getPlainText(),testString.getShiftKey()));
    }

    @Test
    public void textEncrypt_dontEncryptNonAlphabets_String() {
        CeaserEncrypt testString = new CeaserEncrypt("?",1);
        String stringResult="?";
        assertEquals(stringResult,testString.textEncrypt(testString.getPlainText(),testString.getShiftKey()));
    }

    @Test
    public void textEncrypt_lowerUpperCaseEncryption_String() {
        CeaserEncrypt testString=new CeaserEncrypt("A caT",1);
        String stringResult="B dbU";
        assertEquals(stringResult,testString.textEncrypt(testString.getPlainText(),testString.getShiftKey()));
    }

    @Test
    public void textEncrypt_alphabetEncryptLoopsWhenReachesZ_String() {
        CeaserEncrypt testString=new CeaserEncrypt("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG",3);
        String stringResult="WKH TXLFN EURZQ IRA MXPSV RYHU WKH ODCB GRJ";
        assertEquals(stringResult,testString.textEncrypt(testString.getPlainText(),testString.getShiftKey()));
    }
}