package tugas3;

import java.util.Scanner;

public class kkm {
    public static void main(String []args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Masukkan Nilai Siswa");
        int nilai = sc.nextInt();

        if (nilai>=70) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }
    }
}
