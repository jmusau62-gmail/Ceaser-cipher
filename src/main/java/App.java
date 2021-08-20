import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Console myConsole = System.console();

        boolean runningProgram = true;
        while (runningProgram) {
            System.out.println("Hey there, this is The Ceasar Cipher, you can choose to encrypt a word, decrypt a word or exit the program. Enter Encrypt, Decrypt or Exit");
            String navigationChoice = myConsole.readLine();

            if (navigationChoice.equals("Encrypt")) {

                System.out.println("Enter a word to be encrypted: ");
                String inputText = myConsole.readLine();

                System.out.println("Great job, now enter the shift: ");
                Integer inputShift = Integer.parseInt(myConsole.readLine());

                Ceasar inputCaesarEncrypt = new Ceasar(inputText, inputShift);
                String cipherText = inputCaesarEncrypt.encrypt(inputText, inputShift);

                System.out.println("Your encrypted word is " + cipherText);

            } else if (navigationChoice.equals("Decrypt")) {

                System.out.println("Enter an encrypted word to be decrypted: ");
                String userEncryptedText = myConsole.readLine();

                System.out.println("Enter the shift of the encrypted word: ");
                Integer userEncryptedShift = Integer.parseInt(myConsole.readLine());

                Ceasar inputCaesarDecrypt = new Ceasar(userEncryptedText, userEncryptedShift);
                String decrypted = inputCaesarDecrypt.decrypt(userEncryptedText, userEncryptedShift);

                System.out.println("Your decrypted word is " + decrypted);
            } else if (navigationChoice.equals("Exit")) {
                runningProgram = false;
            } else {
                System.out.println("Oops, your input is not readable, choose from Encrypt, Decrypt or Exit please");
            }

        }
    }
}


