package DataStruct.CH02_Array;

import java.util.Arrays;

public class CloneArray1 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5};
        int [] b = a.clone();

        b[3] = 0; // 한 요소에만 0을 대입

        System.out.println("a = " + Arrays.toString(a)); // 배열을 문자열로 바꾸어서 출력
        System.out.println("b = " + Arrays.toString(b)); // 배열을 문자열로 바꾸어서 출력
    }
}
