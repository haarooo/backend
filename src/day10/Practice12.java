package day10;

import day07.package1.B;

import javax.management.MBeanServerBuilder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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



        //3. main 함수에서 Sword 객체와 Gun 객체를 생성한 뒤, 이 객체들을 Character의 use() 메소드에 인자로 전달하여 각기 다른
        //결과가 출력되는 것을 확인하세요.

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
class Weapon{
};
class Sword extends Weapon{
    public void attack(){
        System.out.println("검으로 공격합니다");
    }
}
class Gun extends Weapon{
    public void attack(){
        System.out.println("총으로 공격합니다");
    }
}
class Character{
    public void use(Weapon weapon){
    }

}


/*[문제 8] 다형성을 활용한 매개변수
1. Weapon 클래스와 이를 상속받는 Sword, Gun 클래스를 만드세요. 각 클래스는 "무기로 공격합니다.", "검으로 공격합니다.",
"총으로 공격합니다."를 출력하는 attack() 메소드를 가집니다. (오버라이딩 활용)
2. Weapon 타입의 매개변수를 받아 그 객체의 attack() 메소드를 호출하는 Character 클래스와 use(Weapon weapon) 메소
드를 만드세요.
3. main 함수에서 Sword 객체와 Gun 객체를 생성한 뒤, 이 객체들을 Character의 use() 메소드에 인자로 전달하여 각기 다른
결과가 출력되는 것을 확인하세요.*/


/*[문제 9] 필드와 메소드의 오버라이딩 차이
1. String name = "상위"; 필드와 method() 메소드("상위 메소드" 출력)를 가진 SuperClass를 만드세요.
2. SuperClass를 상속받고, String name = "하위"; 필드와 method() 메소드("하위 메소드" 출력)를 가진 SubClass를 만드
세요.
3. SuperClass obj = new SubClass(); 로 객체를 생성한 뒤, obj.name과 obj.method()를 각각 호출했을 때의 결과를 확인
하고, 왜 다른 결과가 나오는지 주석으로 설명하세요.*/


/*[문제 10] 다중 상속 관계
1. Device 클래스를 만드세요.
2. Device를 상속받는 Electronic 클래스를 만드세요.
3. Electronic을 상속받는 Laptop 클래스를 만드세요.
4. main 함수에서 Laptop 객체를 생성한 뒤, 이 객체가 Electronic 타입과 Device 타입으로도 형 변환이 가능한지 instanceof
연산자로 확인하고 결과를 출력하세요.*/


