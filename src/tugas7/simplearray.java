package tugas7;

import java.util.Scanner;
public class simplearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("--Simple Array--");
        System.out.println();
        System.out.print("Jumlah data: ");
        int a;
        a = sc.nextInt();

        System.out.println("Inputkan data berikut: ");

        int[] data = new int[a];
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            System.out.print("Data ke-" + i + ": ");
            data[i] = sc.nextInt();
        }

        System.out.println("Menampilkan data");

        for(int b = 0; b < data.length; b++) {
            int angka = data[b] % 2;
            if (angka == 0) {
                System.out.println(data[b]+" -> GENAP");
            } else {
                System.out.println(data[b]+" -> GANJIL");
            }
            total += data[b];
        }

        double rataRata = total / data.length;

        System.out.println("TOTAL PENJUMLAHAN: " + total);
        System.out.println("RATA-RATA: " + rataRata);
    }
}
