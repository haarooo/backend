//한줄 주석
/* 여러줄 주석 */


package day01;// 패키지= 폴더이면서 클래스의 위치 식별


public class Exam01 {
    //public: 공개용
    //class: 자바는 코드의 최소 실행단위, 즉 자바는 클래스가 필수로 필요
    //Exam01: 클래스명은 무조건 첫글자 대문자(한글도 가능)
    //{: 클래스 내부 시작
    //}: 클래스 내부 종료, 클래스{}밖에서 작성한 코드 실행안됨
    int a =10; //세미콜론 필수!!
    //2. 함수 실행은 main함수 안에서만 가능하다.
    //System.out.print("안녕"); //출력함수 안됨.
    public static void main(String[] args) {
        System.out.print("안녕");
    }//main end
}

//클래스 밖 int b = 20
