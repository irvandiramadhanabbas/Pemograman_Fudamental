package tugas4;

import java.util.Scanner;

public class konversi2sw {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        double angka = sc.nextDouble();

        String Huruf;

        switch ((int) angka / 10) {
            case 10:
            case 9:
            case 8:
            Huruf = "A";
            break;
            case 7:
            Huruf = "B";
            break;
            case 6:
            Huruf = "C";
            break;
            case 5:
            Huruf = "D";
            break;
            case 4:
            case 3:
            case 2:
            case 1:
            Huruf = "E";
            break;
            default:
            Huruf = "Nilai Error";
        }
    System.out.println("Nilai Huruf: " +Huruf);
    }
}
