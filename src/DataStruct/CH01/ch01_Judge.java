package DataStruct.CH01;
import java.util.Scanner;
public class ch01_Judge {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Please Input the Integer ..: ");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("This integer is Positive Number");

        else if (n < 0)
            System.out.println("This integer is Negative Number");

        else
            System.out.println("This number is 0 ");
    }
}
