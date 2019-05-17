import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args){
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the Ceaser-Cipher Application");

        boolean programRunning=true;
        String navigationChoice;

        while (programRunning) {

            try {
                do{
                    System.out.println("");
                    System.out.println("What would you like to do?\n " +
                            "Enter 1 or 2 from the options: \n" +
                            "1 Encrypt a text\n"+
                            "2 Exit"
                    );

                    navigationChoice = bufferedReader.readLine();
                    int shiftKey;

                    if(navigationChoice.equals("1")){
                        System.out.println("Enter a text to encrypt");
                        String plainText = bufferedReader.readLine();

                            do{
                                System.out.println("Enter a valid key between 1 and 25 for encryption.");
                                shiftKey = Integer.parseInt(bufferedReader.readLine());
                            }
                            while(shiftKey<0 || shiftKey>25 );


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
                        break;
                    }else {
                        System.out.println("Sorry, I dont understand your request");
                    }
                }while (!navigationChoice.equals("1") || !navigationChoice.equals("2"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("You must enter a valid key [1-25]");
            }

        }
    }
}
