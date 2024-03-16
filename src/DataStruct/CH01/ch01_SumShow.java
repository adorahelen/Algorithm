package DataStruct.CH01;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ch01_SumShow {
    public static void main(String[] args) {

        Scanner DCU = new Scanner(System.in);
        int n;

        System.out.println("from 1, to N sum. ");

        do {
            System.out.print(" n Value: ");
            n = DCU.nextInt();
        } while (n <= 0);

        int sum = 0;



        for (int i = 1; i <= n; i++) {
            if (i < n)
                System.out.print(i + " + ");

            else
                System.out.print(i + "= ");
            sum += i;
        }

        System.out.println(sum);
    }
}
