package tugas3;

import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Nilai Alas:");
        int alas = sc.nextInt();
        System.out.print("Nilai Tinggi:");
        int tinggi = sc.nextInt();

        System.out.print("Luas Segitiga:");
        int hasil = (alas*tinggi)/2;

        System.out.println(hasil);
    }
}
