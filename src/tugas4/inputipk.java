package tugas4;

import static java.lang.System.out;
import java.util.Scanner;
public class inputipk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        out.print("Input Nilai: ");
        int nilai = sc.nextInt();

        if(nilai>=80 && nilai<=100) {
            out.println("4.0");
        } else if(nilai>=70 && nilai<80) {
            out.println("3.0");
        } else if(nilai>=60 && nilai<70) {
            out.println("2.0");
        } else if(nilai>=50 && nilai<60) {
            out.println("1.0");
        } else if(nilai>=0 && nilai<50) {
            out.println("0.0");
        } else {
            out.println("error");
        }
    }
}
