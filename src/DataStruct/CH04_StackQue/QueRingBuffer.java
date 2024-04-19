package DataStruct.CH04_StackQue;

public class QueRingBuffer {
    // 생성할 때 용량을 결정하는 고정 길이 큐이다.
    // int형 데이터를 저장한다.

    private int[] que; // 큐용 배열
    private int capacity; // 큐의 용량
    private int front; // 맨 앞 요소 커서
    private int rear; // 맨 뒤 요소 커서
    private int num; // 현재 데이터 개수

    // 실행 시 예외 큐가 비어 있는 경우
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() { }
    }

    // 실행 시 예외 큐가 가득 찬 경우
    public class OverflowQueueException extends RuntimeException {
        public OverflowQueueException() { }
    }

    // 생성자
    public QueRingBuffer(int maxlen) {
        num = front = rear = 0;
        // 생성시 큐는 비어있기 때문에 값을 모두 0으로 한다.
        capacity = maxlen;
        try {
            que = new int [capacity]; // 큐 본체용 배열 생성
        } catch (OutOfMemoryError e) {
            // 생성할 수 없음
        }
    }


    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowQueueException {
        if (num >= capacity)
            throw new OverflowQueueException(); // 큐가 가득 찬 경우
        que [rear++] = x;
        num++;

        if (rear == capacity)
            rear = 0;
        return x;
    }



}
