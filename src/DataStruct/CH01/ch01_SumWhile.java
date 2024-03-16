package DataStruct.CH01;

import java.util.Scanner;

public class ch01_SumWhile {
    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        System.out.println("SUM of the 1 from, to N...");
        System.out.print("Input the ' N ' value ");
        int n = DCU.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("1 from, to N's sum is "+ sum );

    }
}
