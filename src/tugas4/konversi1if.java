package tugas4;

import java.util.Scanner;
import static java.lang.System.out;

public class konversi1if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Masukkan Huruf: ");
        String huruf = sc.nextLine();

        if (huruf.equals("A")) {
            out.println("Nilai Indeks: 4.0");
        } else if (huruf.equals("B")) {
            out.println("Nilai Indeks: 3.0");
        } else if (huruf.equals("C")) {
            out.println("Nilai Indeks: 2.0");
        } else if (huruf.equals("D")) {
            out.println("Nilai Indeks: 1.0");
        } else if (huruf.equals("E")) {
            out.println("Nilai Indeks: 0.0");
        } else {
            out.println("Huruf Error");
        }
    }
}
