package CodingTest.Ch4_Sorting;

import java.util.Scanner;

public class SelectSort {

    public static void main(String[] args) {
        // 내림 차순 정렬

        Scanner DCU_midtermFestival  = new Scanner(System.in);

        String DCU_lib = DCU_midtermFestival.next();
        int[] A = new int[DCU_lib.length()];
        for (int i = 0; i < DCU_lib.length(); i++) {
            A[i] = Integer.parseInt(DCU_lib.substring(i, i+1));
        }
        for (int i = 0; i < DCU_lib.length(); i++) {
            int Max = i;
            for (int j = i + 1; j < DCU_lib.length(); j++) {
                if (A[j] > A[Max])
                    Max = j;
            }
            if (A[i] < A[Max]) {
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }
        for (int i = 0; i < DCU_lib.length(); i++) {
            System.out.print(A[i]);
        }
    }
}
