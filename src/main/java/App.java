import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args){
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the Ceaser-Cipher Application");
        System.out.println("Enter a sentence to encrypt");

        try{
            System.out.println("Enter a sentence to encrypt");
            String plainText=bufferedReader.readLine();

            System.out.println("Enter a key number between 1 and 25 to apply on the text.");
            int shiftKey=Integer.parseInt(bufferedReader.readLine());

            CeaserEncrypt ceaserEncrypt=new CeaserEncrypt();
            String cipherText=ceaserEncrypt.textEncrypt(plainText,shiftKey);

            CeaserDecrypt ceaserDecrypt=new CeaserDecrypt();
            String plainTextAgain=ceaserDecrypt.textDecrypt(cipherText,shiftKey);


            System.out.println("YOUR TEXT: "+plainText);
            System.out.println("YOUR CIPHERTEXT: "+cipherText);
            System.out.println("YOUR TEXT AGAIN: "+ plainTextAgain);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
