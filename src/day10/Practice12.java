package day10;

import java.util.ArrayList;

public class Practice12 {
    public static void main(String[] args) {

        //1.
        Student student = new Student();
        student.name = "유재석";
        student.studentId = 1;
        System.out.println(student.name + student.studentId);

        //2
        Cat cat = new Cat();
        cat.makeSound();

        //3
        Computer computer = new Computer();

        //4
        Triangle triangle = new Triangle();
        Figure figure = triangle; // 피규어로부터 상속받았기 때문에

        //5
        Shape shape = new Circle();
        shape.draw(); // Circle이 Shape로부터 상속받았기 때문

        //6
        Vehicle vehicle =new Bus();
        if(vehicle instanceof Bus){
            vehicle = (Bus)vehicle;
            ((Bus) vehicle).checkFare();
        }
        //7
        ArrayList<Beverage> beverages = new ArrayList<>();
        Coke coke = new Coke();
        Coffee coffee = new Coffee();
        beverages.add(coke);
        beverages.add(coffee);
        for(int index = 0 ; index <= beverages.size()-1 ; index++){
             Beverage result = beverages.get(index);
             result.drink();
        }
        //8
        Sword sword = new Sword();
        Gun gun = new Gun();
        Character character = new Character();
        character.use(sword);
        character.use(gun);

        //9
        SuperClass obj = new SubClass();
        System.out.println(obj.name);
        obj.method01(); //오버라이딩

        //10
        Laptop laptop = new Laptop();
        System.out.println(laptop instanceof Electronic);
        System.out.println(laptop instanceof Device);

    }
}//c end

class Person{
    String name;

}// c end

class Student extends Person{
    int studentId;
}// c end

class  Animal{
    void makeSound(){
        System.out.println("동물이 소리를 냅니다");
    }
}// c end
class Cat extends Animal{
    void makeSound(){
        System.out.println("고양이가 야옹하고 웁니다.");
    }
}// c end

class Machine{
    public Machine() {
        System.out.println("부모 클래스 생성자 실행");
    }
}// c end

class Computer extends Machine{
    public Computer() {
        System.out.println("자식 클래스 생성자 실행");
    }
}// c end

class Figure{
}//c end
class Triangle extends Figure{
}//c end

class Shape{
    public void draw(){
        System.out.println("도형을 그립니다");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("원을 그립니다");
    }
}
class Vehicle{

}
class Bus extends Vehicle{
    public void checkFare(){
        System.out.println("요금을 확인합니다");
    }
}

class Beverage{
    public void drink(){
        System.out.println("음료를 마십니다");
    }
}
class Coke extends Beverage{
    @Override
    public void drink(){
        System.out.println("콜라를 마십니다");
    }
}
class Coffee extends Beverage{
    @Override
    public void drink(){
        System.out.println("커피를 마십니다");
    }
}
abstract class Weapon{
    public abstract void attack();
};
class Sword extends Weapon{
    @Override
    public void attack(){
        System.out.println("검으로 공격합니다");
    }
}
class Gun extends Weapon{
    @Override
    public void attack(){
        System.out.println("총으로 공격합니다");
    }
}
class Character{
    public void use(Weapon weapon){
        weapon.attack();
    }
}
class SuperClass{
    String name = "상위";
    public void method01(){
        System.out.println("상위 메소드 출력");
    }
}
class SubClass extends SuperClass{
    String name = "하위";
    public void method01(){
        System.out.println("하위 메소드 출력");
    }
}
class Device{}
class Electronic extends Device{}
class Laptop extends Electronic{}




