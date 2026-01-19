package day01;

public class Exam02 {

    //자바에서 최초로 실행 흐름(스레드)를 갖는 함수
    public static void main(String[] args) {

        //2. 리터럴: 상수이면서 키보드로 입력가능한 자료들
        //3 , 3.14 , 'a' , true
        System.out.println(3); //js의 console.log()
        System.out.println(3.14);
        System.out.println("유"); // 선언 또는 함수 뒤에 ;세미콜론 필수
        System.out.println("유재석"); //문자열 처리할떄는 "큰따옴표" 사용

        //3. 자료형/타입(분류): 자료들을 효율적으로 사용하기 위한 분류 방법
        //바이트란?: bit(o또는1) ===>01010101(8bit) 1바이트->1024byte -> 1kb
        //효율: 내가 시계를 선물하기 위해서 다이소에서 시계 크기 맞는 상자를 고르낟
        //정수: byte(1b , -128 ~ 127) , short(2, +-3만정도) , int(4 , +-2억정도)* , long(8 , +-20억이상)
        //실수: float(4, 소수점8자리) , double(8, 소수점17자리)*
        //문자: char(2, 작은따옴표 감싼) , 문자열: String(문자열클래스 , ""큰따옴표 감싼)
        //논리: boolean(1, true/false)
        boolean bool1 = true; // 자바=자료형 변수명  = 값;   let bool1 = true;(동적타입)
        boolean bool2 = false; //변수명 카멜표기법 권장,  숫자시작/일부특수/띄어쓰기 안됨

        //1. boolean bool3 = 3 ; /오류 boolean은 3을 저장 할 수 없음
        System.out.println(bool1);

        //2. char
        char ch1 = 'A';
        System.out.println(ch1);
        //char ch2 = 'ABC' 문자열 저장 불가능
        //char ch3 = "ABC" 큰따옴표 저장 불가능

        //3. String : ""큰따옴표로 감싼 여러개 저장하는 클래스타입
        String str1 = "ABC";
        System.out.println(str1);

        //4. byte: -128 ~ 127
        byte b1 = 100;
        //byte b2 = 300; // 127이상
        System.out.println(b1);

        //5. short: 2bye = +-3만
        short s1 = 32000;
        System.out.println(s1);
        //short s2 = 40000; 오류

        //6. int: +-21억. 정수의 리터럴 기본타입
        int i1 = 2100000000;
        System.out.println(i1);
        // int i2 = 4000000000; 40억 오류

        //7. ling: +-21억 이상 , 리터럴 뒤에 L/l을 붙인다
        long l1 = 3000000000L; // 30억은(int)로 들어가서 뒤에 L을붙여서 리터럴을 long으로 바꿔줌
        System.out.println(l1);

        //8. double: 소수점17자리까지 표현 가능 , 실수의 리터럴 기본타입
        double d1 = 0.123456789123456789;
        System.out.println(d1);

        //9. float: 소수점 8자리 까지 표현 리터럴 뒤에 F/f붙인다
        float f1 = 0.123456789F;
        System.out.println(f1);




    }
}// class end
