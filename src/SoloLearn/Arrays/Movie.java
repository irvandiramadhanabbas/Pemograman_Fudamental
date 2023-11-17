package Arrays;

import java.util.Scanner;

public class Movie {

    public static void main(String[] args) {
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int row = sc.nextInt();
        int coll = sc.nextInt();

        if (seats [row] [coll] == 0)
        {
            System.out.println("Free");
        } else {
            System.out.println("Sold");
        }
    }

}
