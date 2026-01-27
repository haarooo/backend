package day06;

public class Calculator {
    //1. 속성 = 멤버변수
    //2. 기능 = 메소드 = 멤버함수
    double getPi(){
        //double = 반환타입 = retutn값의 타입
        //getPi = 메소드명 = 아무거나(카멜권장)
        //() = 매개변수
        //{} = 함수 실행시 처리할 명령어/코드
        return 3.141592; //double타입
        //return = 함수 반환값
    }

    // 2) 매개변수x 반환값x
    void powerON(){
        System.out.println("전원을 켭니다");
        return;
    };

    //3) 매개변수O 반환값x
    void printSum( int x , int y){
        System.out.println(x+y);
    };

    //4) 매개변수O 반환값O
    int add(int x , int y){
        System.out.println("더하기");
        return x + y ;
    }

    // 동일한 클래스내 메소드 호출
    void print(){
        printSum(10 ,2);

    };
}//class end