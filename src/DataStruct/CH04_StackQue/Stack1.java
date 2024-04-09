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


    // Push 함수
    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity) // 스택이 가득 찬 경우
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    // pop 함수
    public int pop() throws EmptyInStackException {
        if (ptr <= 0)
            throw new EmptyInStackException();
        return stk[--ptr]; // 스택 포인터를 한칸 내려서 반환한다.
    }

    // peek 함수
    public int peek() throws EmptyInStackException {
        if (ptr <= 0)
            throw new EmptyInStackException();
        return stk[ptr - 1];
    }

    // clear 메서드 == 스택을 비움
    public void clear() {
        ptr = 0;
    }

    // 스택에서 x를 찾아 인덱스를 반환 (없으면 -1)
    public int indexOf (int x) {
        // 꼭데기 부터 선형으로 검색
        for (int i = ptr -1; i >= 0; i--)
            if (stk[i] == x)
                return i; // 검색에 성공한 경우
        return -1; //검색에 실패한 경우
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr; // 스택에 쌓여있는 데이터 개수를 반환
    }

    public boolean isEmpty() {
        return ptr <= 0; // 참거짓으로 대답 0||1
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다.");

        else {
            for (int i=0; i<ptr; i++)
                System.out.print(stk[i] + " "); // first in last out
            System.out.println();
        }
    }
}
