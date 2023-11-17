package tugas4;

import java.util.Scanner;

import static java.lang.System.out;

public class konversi1sw {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        out.print("Masukkan Huruf: ");
        String huruf = sc.nextLine();

        switch (huruf) {
            case "A":
            out.println("Nilai Indeks: 4.0");
            break;
            case "B":
            out.println("Nilai Indeks: 3.0");
            break;
            case "C":
            out.println("Nilai Indeks: 2.0");
            break;
            case "D":
            out.println("Nilai Indeks: 1.0");
            break;
            case "E":
            out.println("Nilai Indeks: 0.0");
            break;
            default:
            out.println("Huruf Error");
            break;
        }
    out.println("Konversi Selesai");
    }
}
