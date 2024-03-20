package DataStruct.CH02_Array;

public class IntArrayInInt {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5}; // 배열 초기화와 동시에 생성

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "]=" + a[i]);

    }
}
