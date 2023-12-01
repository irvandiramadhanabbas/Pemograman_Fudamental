package latihan;

import static java.lang.System.out;

public class Account {
    String name;
    String address;
    double balance;

    public void display() {
        out.print(name);
        out.print(" (");
        out.print(address);
        out.print(") has $");
        out.print(balance);
    }

    public double getInterest (double percentageRate) { // yang di dalam kurung setelah class non void adalah paramateter
                                                        // double sebelah public disebut return value
        return balance * percentageRate / 100.00;
    }
}
