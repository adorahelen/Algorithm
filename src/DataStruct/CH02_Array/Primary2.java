package DataStruct.CH02_Array;

public class Primary2 {

    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0;

        int[] prime = new int[500];

        prime[ptr++] = 2; // 배열의 1번에 2를 넣은거지

        for (int n = 3; n <= 1000; n+=2) {
            int i;
            for (i = 1; i < ptr; i++) {
                counter++;
                if (n % prime[i] == 0)
                    break;

            }
            if (ptr == i)
                prime[ptr++] = n;
        }
        for (int i =0; i < ptr; i++)
            System.out.println(prime[i]);

        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }
}
