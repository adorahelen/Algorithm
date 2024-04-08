package DataStruct.CH04_StackQue;

public class Stack1 {

    private int [] stk; // 스택용 배열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터

    // 실행시 에러
    public class EmptyInStackException extends RuntimeException {
        public EmptyInStackException() {}
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){ }
    }


    // 생성자
    public Stack1 (int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity]; // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) { // 셍성할 수 없음
            capacity = 0;
        }

    }
}
