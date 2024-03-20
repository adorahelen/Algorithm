package DataStruct.CH02_Array;

import java.util.Random;
import java.util.Scanner;

public class UseTheRand {

    static int maxof (int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];

        return max;
    }

    /*System.in은 Java 프로그램에서 표준 입력 스트림을 나타냅니다. 이는 키보드로부터 사용자 입력을 읽는 데 사용됩니다.
따라서 Scanner 객체를 생성할 때 사용자의 키보드 입력을 받고 싶다면, System.in을 생성자에 전달하여야 합니다.*/

    public static void main(String[] args) {
        Random mugen = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("we find MAX of Height.");
        System.out.print("Num of Humans : ");
        int num = input.nextInt();
        int [] HEIGHT = new int[num];

        System.out.println("Key Value is Under");
        for (int i = 0; i < num; i++) {
            HEIGHT[i] = 100 + mugen.nextInt(90);
            System.out.println("height [" + i + "]: " + HEIGHT[i]);
        }
        System.out.printf("THe max == %d", maxof(HEIGHT));
    }
}
