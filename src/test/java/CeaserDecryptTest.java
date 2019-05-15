import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserDecryptTest {
    @Test
    public void textDecrypt_stringNumberRemainsUnchanged_String() {
        CeaserDecrypt testString = new CeaserDecrypt();
        String stringNumber="1";
        assertEquals(stringNumber,testString.textDecrypt("1",1));
    }

    @Test
    public void textDecrypt_spaceRemainsSpace_String() {
        CeaserDecrypt testString = new CeaserDecrypt();
        String stringSpace=" ";
        assertEquals(stringSpace,testString.textDecrypt(" ",1));
    }

    @Test
    public void textDecrypt_singleLetterDecryption_String() {
        CeaserDecrypt testString = new CeaserDecrypt();
        String stringLetter="A";
        assertEquals(stringLetter,testString.textDecrypt("D",3));
    }

    @Test
    public void textDecrypt_singleWordEncryption_String() {
        CeaserDecrypt testString = new CeaserDecrypt();
        String stringResult="CAT";
        assertEquals(stringResult,testString.textDecrypt("DBU",1));
    }

    @Test
    public void textDecrypt_fullSentenceEncrypt_String(){
        CeaserDecrypt testString = new CeaserDecrypt();
        String stringResult="I AM A GIRL";
        assertEquals(stringResult,testString.textDecrypt("J BN B HJSM",1));
    }

    @Test
    public void textDecrypt_dontEncryptNonAlphabets_String() {
        CeaserDecrypt testString = new CeaserDecrypt();
        String stringResult="?";
        assertEquals(stringResult,testString.textDecrypt("?",1));
    }

    @Test
    public void textDecrypt_lowerUpperCaseEncryption_String() {
        CeaserDecrypt testString=new CeaserDecrypt();
        String stringResult="A caT";
        assertEquals(stringResult,testString.textDecrypt("B dbU",1));
    }

    @Test
    public void textDecrypt_alphabetEncryptLoopsWhenReachesZ_String() {
        CeaserDecrypt testString=new CeaserDecrypt();
        String stringResult="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals(stringResult,testString.textDecrypt("WKH TXLFN EURZQ IRA MXPSV RYHU WKH ODCB GRJ",3));
    }
}