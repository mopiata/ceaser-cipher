import org.junit.Test;
import static org.junit.Assert.*;

public class CeaserDecryptTest {
    @Test
    public void newCeaserDecrypt_instantiatesCorrectly() {
        CeaserDecrypt testString=new CeaserDecrypt("1",1);
        assertEquals(true, testString instanceof CeaserDecrypt);
    }

    @Test
    public void newCeaserDecrypt_getsPlainTextCorrectly_String() {
        CeaserDecrypt testString=new CeaserDecrypt("Hello girl!",1);
        assertEquals("Hello girl!",testString.getCipherText());
    }

    @Test
    public void newCeaserDecrypt_getsShiftKeyCorrectly_Int() {
        CeaserDecrypt testString=new CeaserDecrypt("Hello girl!",1);
        assertEquals(1,testString.getShiftKey());
    }

    @Test
    public void newCeaserDecrypt_setsPlainTextCorrectly_String() {
        CeaserDecrypt testString=new CeaserDecrypt("Hello girl!",1);
        testString.setCipherText("Never Ever");
        assertEquals("Never Ever",testString.getCipherText());
    }

    @Test
    public void newCeaserDecrypt_setsShiftKeyCorrectly_Int(){
        CeaserDecrypt testString=new CeaserDecrypt("Hello girl!",1);
        testString.setShiftKey(2);
        assertEquals(2, testString.getShiftKey());
    }

    @Test
    public void textDecrypt_stringNumberRemainsUnchanged_String() {
        CeaserDecrypt testString = new CeaserDecrypt("1",1);
        String stringNumber="1";
        assertEquals(stringNumber,testString.textDecrypt(testString.getCipherText(),testString.getShiftKey()));
    }

    @Test
    public void textDecrypt_spaceRemainsSpace_String() {
        CeaserDecrypt testString = new CeaserDecrypt(" ",1);
        String stringSpace=" ";
        assertEquals(stringSpace,testString.textDecrypt(testString.getCipherText(),testString.getShiftKey()));
    }

    @Test
    public void textDecrypt_singleLetterDecryption_String() {
        CeaserDecrypt testString = new CeaserDecrypt("D",3);
        String stringLetter="A";
        assertEquals(stringLetter,testString.textDecrypt(testString.getCipherText(),testString.getShiftKey()));
    }

    @Test
    public void textDecrypt_singleWordEncryption_String() {
        CeaserDecrypt testString = new CeaserDecrypt("DBU",1);
        String stringResult="CAT";
        assertEquals(stringResult,testString.textDecrypt(testString.getCipherText(),testString.getShiftKey()));
    }

    @Test
    public void textDecrypt_fullSentenceEncrypt_String(){
        CeaserDecrypt testString = new CeaserDecrypt("J BN B HJSM",1);
        String stringResult="I AM A GIRL";
        assertEquals(stringResult,testString.textDecrypt(testString.getCipherText(),testString.getShiftKey()));
    }

    @Test
    public void textDecrypt_dontEncryptNonAlphabets_String() {
        CeaserDecrypt testString = new CeaserDecrypt("?",1);
        String stringResult="?";
        assertEquals(stringResult,testString.textDecrypt(testString.getCipherText(),testString.getShiftKey()));
    }

    @Test
    public void textDecrypt_lowerUpperCaseEncryption_String() {
        CeaserDecrypt testString=new CeaserDecrypt("B dbU",1);
        String stringResult="A caT";
        assertEquals(stringResult,testString.textDecrypt(testString.getCipherText(),testString.getShiftKey()));
    }

    @Test
    public void textDecrypt_alphabetEncryptLoopsWhenReachesZ_String() {
        CeaserDecrypt testString=new CeaserDecrypt("WKH TXLFN EURZQ IRA MXPSV RYHU WKH ODCB GRJ",3);
        String stringResult="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals(stringResult,testString.textDecrypt(testString.getCipherText(),testString.getShiftKey()));
    }
}