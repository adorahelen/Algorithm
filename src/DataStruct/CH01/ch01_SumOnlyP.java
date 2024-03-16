package DataStruct.CH01;
import java.util.Scanner;
public class ch01_SumOnlyP {

    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        int n;

        System.out.println("Sum of the 1 to N");

        do {
            System.out.print("N value : ");
            n = DCU.nextInt();
        } while (n <= 0); // 0보다 클때까지 무한 반복

        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;

        System.out.println(" 1 to N sum is  " + sum + "<<<");
    }
}
