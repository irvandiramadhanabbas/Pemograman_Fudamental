package SoloLearn.Arrays;

import  java.util.Scanner;

public class vending {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int drink = sc.nextInt();

        if (drink < 0 || drink > 4) {
            System.out.println("Invalid");
        } else {
            System.out.println(menu[drink]);
        }
    }

}
