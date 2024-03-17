package DataStruct.CH01;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        int n;
        System.out.println("------");

        do {
            System.out.print("input N : ");
            n = DCU.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
