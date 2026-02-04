package day10;

import java.security.Key;

public class Exam02 {
    public static void main(String[] args) {
        // 1. 인터페이스 객체 생성 불가능

        // 2. 인터페이스 타입의 변수 선언
        Keyboard myKeyBoard;
            // myKeyBoard.aKey(); 추상메소드는 실행 안됨

        //3. 추상메도스 구현 = 클래스에서 오버라이딩

        //4. 구현(객)체 : 해당 인터페이스 구현한 클래스로 객체 생성
        myKeyBoard = new Fight(); // 키보드에 격투게임 연결
        myKeyBoard.aKey();
        myKeyBoard.aKey();
        myKeyBoard.bKey(2, 3);

        myKeyBoard = new Soccer();
        myKeyBoard.aKey();
        myKeyBoard.aKey();
        myKeyBoard.bKey(2, 3);


        // 구현체 없이 자체적으로 구현 == 익명(이름없는) 구현체
        // new 인터페이스명(){오버라이딩}
        myKeyBoard = new Keyboard(){
            @Override
            public void aKey(){
                System.out.println("밥먹기");
            }

            @Override
            public int bKey(int x , int y){
                System.out.println("자기");
                return 0;
            }
        };

        myKeyBoard.aKey();



    }// m end
}// c end

class Fight implements Keyboard{
    //implements = 해당 인터페이스네 추상메소드 구현한다
    @Override
    public void aKey(){
        System.out.println("공격");
    }

    @Override
    public int bKey(int x , int y){
        System.out.println("방어");
        return x+y;
    }
}

class Soccer implements Keyboard{
    @Override
    public void aKey(){
        System.out.println("슈팅");
    }
    @Override
    public int bKey(int x , int y){
        System.out.println("태클");
        return x+y;
    }
}