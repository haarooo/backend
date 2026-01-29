package day08;

public class Exam02 {
    public static void main(String[] args) {

        //1. 싱글톤 : 프로그램내 단 하나의 인스턴스(객체)를 갖는 설계 구조
        //2. 싱글톤 생성
        //3. 다른 클래스에서 싱글톤 호출 , 클래스명.getInstance();
        Controller controller1 = Controller.getInstance();
        Controller controller2 = Controller.getInstance();


    }//m end
}//c end

class Controller{//해당 클래스의 싱글톤 패턴 적용
    private Controller(){}//1. 생성자를 private = 다른 클래스에서 new(객체생성)불가능
    //2. 단 하나의 객체를 생성하여 static final에 저장
    private static final Controller instance = new Controller();
    //3. 해당 싱글톤(객체)를 다른 클래스에서 간접 사용(공유)하도록 getter만든다
    public static Controller getInstance(){
        return instance;
    }
}