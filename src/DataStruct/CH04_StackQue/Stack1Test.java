package DataStruct.CH04_StackQue;

import java.util.Scanner;

public class Stack1Test {
    public static void main(String[] args) {
        Scanner DCU = new Scanner(System.in);
        Stack1 min = new Stack1(64); //  new 라는 생성자를 통해 Stack1.java 인스턴스, 최대 64개 푸시 가능

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n", min.size(), min.getCapacity());
            System.out.print("1. 푸쉬  2. 팝  3. 피크 4. 덤프 0. 종료 : ");

            int menu = DCU.nextInt();
            if (menu == 0) break;

            int Order;
            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    Order = DCU.nextInt();

                    try {
                        min.push(Order);
                    } catch (Stack1.OverflowIntStackException e){
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        Order = min.pop();
                        System.out.println("삭제한 데이터는 " + Order + "입니다.");
                    } catch (Stack1.EmptyInStackException e) {
                        System.out.println(" 스택이 텅텅 비어 있네요^^,,,");
                    }
                    break;

                case 3:
                    try {
                        Order = min.peek();
                        System.out.println(" 피크(검색한)데이터는" + Order + "입니다.");
                    } catch (Stack1.EmptyInStackException e) {
                        System.out.println(" 스택이 비어 있습니다. ");

                    }
                    break;

                case 4:
                    min.dump();
                    break;
            }
        }
    }
}
