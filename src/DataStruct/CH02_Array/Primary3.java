package DataStruct.CH02_Array;

public class Primary3 {

    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;
        int [] prime = new int[500];

        prime[ptr++] = 2; // 1에 2를 넣는다.
        prime[ptr++] = 3; // 2에는 3을 넣는다.

        for (int n = 5; n <= 1000; n += 2) {
            boolean flag = false; // 인테자 5를 기준으로 1000이랑 같을때 까지 2씩 증가하면서 반복

            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                prime[ptr++] = n;
                counter++;
            }
        }

        for (int i =0; i<ptr; i++)
            System.out.println(prime[i]);

        System.out.println("곱셈과 나눗셈을 수행한 횟수: " + counter);
    }
}
