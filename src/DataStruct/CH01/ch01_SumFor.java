package DataStruct.CH01;

import java.util.Scanner;
public class ch01_SumFor {

    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        System.out.println(" Make the Sum from 1, to N .");
        System.out.print("Input The 'N' value ...: ");

        int n = DCU.nextInt();


        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum += i;


        System.out.println("from 1,  to " + n + "... Sum is " + sum);
    }
}
