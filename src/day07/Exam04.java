package day07;

public class Exam04 {
    void 멤버메소드(){} //1. 멤버함수
    static void 정적메소드(){} //정적 멤버 메소드
    public static void main(String[] args) {
        //1. final , 고정
        //2. 사용법 : final 타입 변수명 = 초기값
        //->final변수는 초기값이 무조건 필수이다 why? 수정 못하니까

        //3. static , 정적인
        //4. 사용법 : static 타입 변수명 ; , static void 메소드명(){}
        //-> static 변수/메소드는 프로그램 실행시 우선(메모리)할당 되고 프로그램 종료시까지 유지
        //-> 메모리 할당된 변수/메소드 이므로 객체가 필요없다. <과도한 사용 지양>
        Exam04 exam04 = new Exam04();
        exam04.멤버메소드();
        정적메소드();

        //정벅변수는 객체 필요없음
        System.out.println(D.point);
        System.out.println(D.name);

        D d = new D();
        System.out.println(d.Pi);

        //D.method1(); 에러
        d.method1();
        D.method2();

    }//main end
}//class end

class D{
    final double Pi = 3.141592;
    static int point;
    static final char name = 'A';
    //final메소드 : 오버라이딩 금지
    public final void method1(){}
    //static 메소드 : 객체없이 호출 가능한 메소드
    public static void method2(){}
}