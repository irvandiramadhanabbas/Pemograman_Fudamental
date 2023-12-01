package latihan;

import static java.lang.System.out;

public class UseAccount {
    public static void main(String args[]) {
        Account myAccount; // type data non primitive/object
        Account yourAccount;

        myAccount = new Account();// INSTANCE > membuat objek baru di sebuah class
        yourAccount = new Account();

        myAccount.name = "Vandigtg";
        myAccount.address = "222 Cyberspace Lane";
        myAccount.balance = 24.02;

        yourAccount.name = "Syakurgtg";
        yourAccount.address = "111 Consumer Street";
        yourAccount.balance = 55.63;

       myAccount.display();

       out.print(" plus $");
       out.print(myAccount.getInterest(5.00));
       out.println(" interest ");

       yourAccount.display();
       double yourInterestRate = 7.00;
       out.print(" plus $");
       double yourInterestAmount =
               yourAccount.getInterest(yourInterestRate);
       out.print(yourInterestAmount);
       out.println(" interest ");
    }
}