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

        //7
        DataAccessObject dao;
        dao = new OracleDao();
        dao.save();
        dao = new MySqlDao();
        dao.save();


        //8
        Greeting g = new Greeting(){
        }; g.welcome();

        //9
        Television tv = new Television();
        tv.turnOn();
        tv.turnOff();
        tv.setMute(true);
        tv.setMute(false);


        //10
        System.out.println(Calculator.plus(10 , 20));



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


interface DataAccessObject{
    public void save();
}
class OracleDao implements DataAccessObject{
    public void save(){
        System.out.println("Oracle DB에 저장");
    }
}
class MySqlDao implements DataAccessObject{
    public void save(){
        System.out.println("MySQL DB에 저장");
    }
}

interface Greeting{
    public default void welcome(){
        System.out.println("환영합니다");
    }
}

interface Device1{
    public void turnOn();
    public void turnOff();
    public default void setMute(boolean mute){

        if (mute) {
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음을 해제합니다.");
        }
    }
}
class Television implements Device1{
    @Override  public void turnOn() {

    }

    @Override  public void turnOff() {

    }
}

interface Calculator{
    public static int plus(int x, int y){
        return x+y;
    }
}


