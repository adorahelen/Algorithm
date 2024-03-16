package DataStruct.CH01;

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);
        int n, w;

        System.out.println("show *, but change line when if count== W ");

        do {
            System.out.print(" *  value : ");
            n = DCU.nextInt();
        } while (n <= 0);

        do {
            System.out.print(" W value : ");
            w = DCU.nextInt();
        }  while (w <= 0 || w > n);

/*        for (int i =0; i < n; i++) {
            System.out.print("*");
            if ( i % w == w -1) // 출력하는 건 0부터 시작하니까
                System.out.println();
        }*/

        for (int i = 0; i < n/w; i++)
            System.out.println("*".repeat(w)); // 문자열로 반환

        int rest = n % w;
        if (rest != 0)
            System.out.println("*".repeat(rest));

    }
}
