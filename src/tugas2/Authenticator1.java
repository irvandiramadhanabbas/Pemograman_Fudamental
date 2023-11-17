package tugas2;

import static java.lang.System.out;
import  java.util.Scanner;
public class Authenticator1{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        out.print("Username: ");
        String username = keyboard.next ();

        if (username.equals("vandi") ) {
            out.print("password: ");
            String password = keyboard.next ();

            if (password.equals("123") ) {
                out.println("You're In");
            } else {
                out.println("Incorrect Password");
            }
        } else {
            out.println("Unknown User");
        }

        keyboard.close();
    }
}