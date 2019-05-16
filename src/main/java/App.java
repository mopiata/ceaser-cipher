import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args){
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the Ceaser-Cipher Application");

        boolean programRunning=true;

        while (programRunning) {

            try {

                System.out.println("What would you like to do?\n " +
                        "Enter 1 or 2 from the options: " +
                        "1 Decrypt a text\n"+
                        "2 Exit"
                );

                String navigationChoice = bufferedReader.readLine();

                if(navigationChoice.equals("1")){
                    System.out.println("Enter a sentence to encrypt");
                    String plainText = bufferedReader.readLine();

                    System.out.println("Enter a key number between 1 and 25 to apply on the text.");
                    int shiftKey = Integer.parseInt(bufferedReader.readLine());

                    CeaserEncrypt ceaserEncrypt = new CeaserEncrypt(plainText, shiftKey);
                    String cipherText = ceaserEncrypt.textEncrypt(ceaserEncrypt.getPlainText(), ceaserEncrypt.getShiftKey());

                    CeaserDecrypt ceaserDecrypt = new CeaserDecrypt("", 0);
                    ceaserDecrypt.setCipherText(cipherText);
                    ceaserDecrypt.setShiftKey(shiftKey);
                    String plainTextAgain = ceaserDecrypt.textDecrypt(ceaserDecrypt.getCipherText(), ceaserDecrypt.getShiftKey());


                    System.out.println("Input String: " + ceaserEncrypt.getPlainText());
                    System.out.println("Encrypted String: " + cipherText);
                    System.out.println("Decrypted String: " + plainTextAgain);
                }else if(navigationChoice.equals("2")){
                    programRunning=false;
                }else {
                    System.out.println("Sorry, I dont understand your request");
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
