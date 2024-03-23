package DataStruct.CH02_Array;

public class Primary1 {

    public static void main(String[] args) {
        int counter = 0; // 나눗셈의 횟수

        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) { // 선제 포문에서 n이 먼저 증가됨으로,
                // 후위 포문에서는 계속 따라가면서 1000까지 나눗셈을 실행한다.

                counter++; // 따라 가면 하나 증가
                if (n % i == 0) // 나누어 떨어지면 소수가 아님
                    break;
            }
            if (n == i) // 마지막까지 안나누어 떨어지는 경우 출력
                System.out.printf("%d \n", n);
        }
        System.out.println("나눗셈을 실행한 횟수: " + counter);
    }
}
