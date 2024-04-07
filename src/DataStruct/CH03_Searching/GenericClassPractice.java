package DataStruct.CH03_Searching;

public class GenericClassPractice {
    // 재네릭 클래스의 매개변수를 T라고 작성한다.

    static class GenericClass<T> { // 이름: 재네릭 클래스 매개변수: T

        private T wxyz;
        GenericClass(T R) { //  생성자
            this.wxyz = R;
        }
        T getXyz() { // xzy getter
            return wxyz;
        }

    }

    public static void main(String[] args) {
        // 아래와 같이 매개변수에 String을 넘길 수도 있고 Integer을 넘길 수도 있다.
        GenericClass<String> DCU = new GenericClass<>("Degu Catholic University");
        GenericClass<Integer> JTU = new GenericClass<>(15);

        System.out.println(DCU.getXyz());
        System.out.println(JTU.getXyz());
    }


}
