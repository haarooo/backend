package day07.package1;

public class B {
    public void 메소드(){
        A a = new A();
        System.out.println("a.공개변수 = " + a.공개변수);
        //System.out.println("a.비공개변수 = " + a.비공개변수);
        System.out.println("a = " + a.일반변수);
        a.메소드();
        //a.비공개메소드();
    }

}
