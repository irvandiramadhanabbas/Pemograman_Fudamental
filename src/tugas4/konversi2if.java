package tugas4;

import java.util.Scanner;

import static java.lang.System.out;

public class konversi2if {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Masukkan Nilai: ");
        double angka = sc.nextDouble();

        if (angka>=80.00 && angka<=100) {
            out.println("Nilai Huruf: A");
        } else if (angka>=70 && angka<=79.99) {
            out.println("Nilai Huruf: B");
        } else if (angka>=60 && angka<=69.99) {
            out.println("Nilai Huruf: C");
        } else if (angka>=50 && angka<=59.99) {
            out.println("Nilai Huruf: D");
        } else if (angka>=0 && angka<=49.99) {
            out.println("Nilai Huruf: E");
        } else {
            out.println("Nilai Error");

        }
    }
}
