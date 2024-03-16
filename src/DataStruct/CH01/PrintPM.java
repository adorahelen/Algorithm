package DataStruct.CH01;


import java.util.Scanner;

public class PrintPM  {
    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);

        int n;
        System.out.println("Print + && - Alternative");
        System.out.print(" N value : ");
        n = DCU.nextInt();
        for (int i = 0; i<n; i++)
            if (i % 2 == 0)
                System.out.print("+");
        else
                System.out.print("-");
    }
}
