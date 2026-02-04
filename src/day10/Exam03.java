package day10;

public class Exam03 {
    public static void main(String[] args) {
        Buy buy = new Customer();
        buy.method1();

        //buy.method6();
        Customer customer = (Customer)buy;
        Sell sell = customer;
        sell.method6();

        //2 디폴트메소드
        buy.method2(1);

        //3 정적메소드
        Buy.method3(); // 정적은 타입명

        //4 private 사용 불가능
        //Buy.method4();
        //Buy.method5();





    }// m end
}// c end

interface Buy {
    // 상수
    // 추상메소드 : 선언부만 있고 구현부는 없는 메소드
    public abstract void method1();
    // 디폴트메소드 선언부도 있고 구현부도 있다
    public default int method2(int x ){return x;}
    // 정적메소드 : 인터페이스내 정적 구현 메소드
    public static void method3(){
        System.out.println("정적구현메소드");
    }
    // private 메소드 : 현재 인터페이스내에서 사용하는 메소드(오버라이딩 불가능)
    private void method4(){}
    private static void method5(){}
}// i end

interface Sell{void method6();}

class Customer extends Object implements Buy , Sell{ // 상속은 1번 , 구현은 여러번
    //extends은 오버라이딩 선택
    //implements은 오버라이딩 필수 추상메소드만 필수


    @Override
    public void method1() {
        System.out.println("판매");

    }
    @Override
    public void method6() {
        System.out.println("구매");
    }
}