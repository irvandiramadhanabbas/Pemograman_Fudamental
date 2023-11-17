package tugas3;

import java.util.Scanner;

public class gage {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Sembarang Angka : ");
        int a = sc.nextInt();

        if(a%2==0) {
            System.out.println(a+ " (adalah angka genap) ");
        } else {
            System.out.println(a+ " (adalah angka ganjil) ");
        }
    }
}
