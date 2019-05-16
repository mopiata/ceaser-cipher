import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args){
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the Ceaser-Cipher Application");


        try{
            System.out.println("Enter a sentence to encrypt");
            String plainText=bufferedReader.readLine();

            System.out.println("Enter a key number between 1 and 25 to apply on the text.");
            int shiftKey=Integer.parseInt(bufferedReader.readLine());

            CeaserEncrypt ceaserEncrypt=new CeaserEncrypt(plainText,shiftKey);
            String cipherText=ceaserEncrypt.textEncrypt(ceaserEncrypt.getPlainText(),ceaserEncrypt.getShiftKey());

            CeaserDecrypt ceaserDecrypt=new CeaserDecrypt();
            String plainTextAgain=ceaserDecrypt.textDecrypt(cipherText,shiftKey);


            System.out.println("Input String: "+ ceaserEncrypt.getPlainText());
            System.out.println("Encrypted String: "+cipherText);
//            System.out.println("Decrypted String: "+ plainTextAgain);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
