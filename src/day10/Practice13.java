package day10;

public class Practice13 {
    public static void main(String[] args) {
        //1
        Cat1 cat = new Cat1();
        cat.makeSound();
        Dog dog = new Dog();
        dog.makeSound();

        //2
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);

        //3
        Runnable runner;
        runner = new Person1();
        runner.run();
        runner = new Car1();
        runner.run();

        //4
        Sword2 sword2 = new Sword2();
        Gun2 gun2 = new Gun2();
        Character1 character1 = new Character1();
        character1.useWeapon(sword2);
        character1.useWeapon(gun2);

        //5
        Duck duck =new Duck();
        duck.fly();
        duck.swimmable();

        //6
        Duck duck1 = new Duck();
        Object object = duck1;

        if(object instanceof Swimmable){
            Swimmable object1 = (Swimmable)object;
            object1.swimmable();
        }if(object instanceof Flyable) {
            Flyable object1 = (Flyable)object;
            object1.fly();
        }



    }
}

interface Soundable {
    public abstract void makeSound();
}
class Cat1 implements Soundable{
    @Override
    public void makeSound(){
        System.out.println("야옹");
    }
}
class Dog implements Soundable{
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

interface RemoteControl{
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;
}


interface Runnable{
    public abstract void run ();
}
class Person1 implements Runnable{
    public void run(){
        System.out.println("사람이 달립니다");

    }
}

class Car1 implements Runnable{
    public void run(){
        System.out.println("자동차가 달립니다");
    }
}


interface Attackable{
    public void attack();

}
class Sword2 implements Attackable{
    public void attack(){
        System.out.println("검으로 공격");
    }
}
class Gun2 implements Attackable{
    public void attack(){
        System.out.println("총으로 공격");
    }
}
class Character1 {
    public void useWeapon(Attackable weapon){
        weapon.attack();
    }
}
interface Flyable{
    public default void fly(){
        System.out.println("하늘을 납니다");
    }
}
interface Swimmable{
    public default void swimmable(){
        System.out.println("물에서 헤엄칩니다");
    }
}
class Duck implements Flyable , Swimmable{}








/*[문제 7] 인터페이스를 이용한 객체 교체
1. "데이터를 저장합니다."라는 추상 메소드 save()를 가진 DataAccessObject 인터페이스를 만드세요.
2. DataAccessObject를 구현하여 각각 "Oracle DB에 저장", "MySQL DB에 저장"을 출력하는 OracleDao, MySqlDao 클
래스를 만드세요.
3. main 함수에서 DataAccessObject 타입의 변수 dao를 선언하세요.
4. dao에 new OracleDao()를 대입하여 save()를 호출하고, 그 다음 new MySqlDao()를 대입하여 save()를 호출하여 DB가
쉽게 교체되는 것을 확인하세요.*/


/*[문제 8] 익명 구현 객체
1. "환영합니다."를 출력하는 welcome() 추상 메소드를 가진 Greeting 인터페이스를 만드세요.
2. main 함수에서, 별도의 클래스 파일을 만들지 않고, Greeting 인터페이스 타입의 변수를 선언하면서 익명 구현 객체를 생성하여
welcome() 메소드를 즉석에서 구현하고 호출하세요.
예] Greeting g = new Greeting() { ... }; */


/*[문제 9] 디폴트 메소드 (Default Method)
1.Device 인터페이스에, turnOn(), turnOff() 추상 메소드와 함께, public default void setMute(boolean mute) 디폴트
메소드를 추가하세요. 디폴트 메소드는 "무음 처리합니다."를 출력하도록 구현합니다.
2.Television 클래스가 Device를 구현하도록 하되, turnOn(), turnOff()만 오버라이딩하세요.
3.main 함수에서 Television 객체를 생성하고, turnOn(), turnOff()와 함께 디폴트 메소드인 setMute()도 호출되는 것을 확
인하세요 */


/*[문제 10] 정적 메소드 (Static Method)
1. Calculator 인터페이스를 만들고, 두 정수의 합을 반환하는 plus(int x, int y) 정적 메소드를 정의하세요.
2. main 함수에서 Calculator 인터페이스를 구현하는 클래스나 객체를 만들지 않고, Calculator.plus(10, 20)과 같이 인터페이
스 이름으로 직접 정적 메소드를 호출하여 결과를 출력하세요. */