package DataStruct.CH02_Array;

public class ArraySumForin {
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "]=" + a[i]);

        double sum = 0;

        //Java는 배열이나 컬렉션 등의 요소를 반복할 때 확장 for 문을 사용할 수 있습니다. 예시는 질문에 이미 포함되어 있습니다.
        for (double i : a)
            sum += i;
        // for 문 확장 버전 및 for each == for in
        // 더블 형 i는 배열 a 안에 있다.
        // sum 은 그 배열 i의 모든 요소를 더한 값이다.

        /* for (int i = 0; i < a.length; i++)
               sum += a[i];
        * */

        System.out.println("모든 요소의 합은 " + sum + "입니다.");
    }
}
