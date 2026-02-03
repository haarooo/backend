package day09;

public class Exam02 {
    public static void main(String[] args) {

        // 1 자바의 모든 클래스는 object 클래스로부터 상속받는다
        System.out.println("========1=======");
        A a = new A(); //총 객체 : 2개 ,  A + object(슈퍼클래스)

        // 2 자바의 모든 상속관계에서는 객체생성시 부모객체 먼저 생성한다.
        System.out.println("========2=======");
        B b= new B();


        // 3 타입변환시 업/다운 캐스팅만 가능하다
        System.out.println("========3=======");
        C c = new C(); // 총객체 3개 C <- A <- object

        // 4
        System.out.println("========4=======");
        D d = new D(); // 총객체 4개 , D <- B <- A <- Object

        // 5
        System.out.println("========5=======");
        E e = new E(); //총객체 4개 , E <- C <- A<- object

        // 자동 타입변환
        A a2 = b;
        Object o2 = a2; // b->a->Object

        // 강제타입변환
        B b2 = (B)a2;
        // C c1 = (C)a2; 오류발생 a2의 태생은 b객체이므로

        // 타입확인 , 객체 instanceof 클래스명
        System.out.println( a instanceof Object);
        System.out.println(e instanceof A);
        System.out.println(b instanceof D);

        //자바는 상속관게를 메모리(저장소)로 표현한다
        // 해당 객체가 생성될때 부모객체는 생성되지만 자식객체는 생성 안된다.
        // 다운캐스팅이 안되는 전제조건




    }// main end
}//c end


class A{
    public A() {
        System.out.println("A객체 생성");
    }//class end
}//c end

class B extends A {
    public B() {
        System.out.println("B 객체 생성");
    }//class end
}//c end

class C extends A {
    public C() {
        System.out.println("C 객체 생성");
    }
}
class D extends B{
    public D() {
        System.out.println("d 객체 생성");
    }
}

class E extends C{
    public E() {
        System.out.println("e 객체 생성");
    }
}


