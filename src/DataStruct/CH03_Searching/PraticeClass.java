package DataStruct.CH03_Searching;


class Id { // 클래스 Id 안에 변수 2개, 생성자
    private static int counter = 0; // 아이디를 몇개 부여했는지 저장 (클래스 변수)
    private int id; // 아이디 (인스턴스 변수)
    // 생성자 *fork 함수를 통해서 프로세스 생성하던 것과 비슷
    public Id() { id = ++counter;} // (생성자)
    // 생성자 사용시 counter 변수를 증가하개끔

    public static int getCounter() { return  counter;} // (클래스 메서드)
    public int getId() {return id;}
}
// 메인 클래스는 당연히 존재해야하고 (+ 메인 함수 감싸기) 위에는 별도의 클래스 지정
public class PraticeClass {

    public static void main(String[] args) {
        Id a = new Id(); // 생성자를 통한 아이디 생성1
        Id b = new Id(); // 생성자를 통한 아이디 생성2

        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        System.out.println(" 부여한 아이디의 개수 : " + Id.getCounter());
    }

}
