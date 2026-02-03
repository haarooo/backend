package day09;

public class Exam03 {
    public static void main(String[] args) {

        //상위 객체
        상위클래스 obj1 = new 상위클래스();
        obj1.show();

        //obj1.show2(); 자식의 멤버변수/메소드 사용불가

        //하위객체
        하위클래스 obj2 = new 하위클래스();
        obj2.show(); //부모메소드 대신에 오버라이딩 된 메소드 실행
        obj2.show2();

        //타입변환 // 자식->부모
        상위클래스 obj3 = obj2;
        obj3.show(); //

        //4 부모와 자식간의 멤버변수 사용
        System.out.println(obj1.value1);
        System.out.println(obj2.value3);


    }

}

class 상위클래스{
    int value1 = 10;
    int value2 = 20;

    public 상위클래스() {
        System.out.println("상위클래스 생성");
    }
    void show(){
        System.out.println("상위클래스 메소드실행");
    }
}


class 하위클래스 extends 상위클래스{
    int value3 = 30 ; int value4 = 40;
    하위클래스(){
        System.out.println("하위클래스 생성");
    }

    @Override // 생략가능 물려받은 메소드 재정의한다
    void show(){ // 상위클래스 메소드 선언부가 일치하면 오버라이딩
        System.out.println("하위클래스 메소드실행");
    }

    void show2(){
        System.out.println("하위클래스 메소드실행2");
        System.out.println(this.value3);
        System.out.println(super.value1);
        //부모와 자식간의 멤버변수명이 동일할때 this,super로 구분
    }
}
