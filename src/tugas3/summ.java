package tugas3;

import java.util.Scanner;

public class summ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Minimal: ");
        int Mi = input.nextInt();

        System.out.print("Masukkan Nilai Maximal: ");
        int Ma = input.nextInt();

        System.out.print("Masukkan Nilai Interval: ");
        int In = input.nextInt();

        int sum = 0;
        int i = 1;
        int n = (Ma-Mi)/In;

        if((Ma - Mi)% In != 0) {
            System.out.println("Invalid Interval");
        } else {
            while (i <= n) {
            sum += Mi;
            Mi += In;
            i++;
            }
            System.out.print("Sum: "+sum);
        }
    }
}
