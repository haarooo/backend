package day14;

import java.util.TreeMap;

public class Exam03 {
    static void main() {

        // 동기화vs비동기화 메소드들은 비동기화 상태이다.
        /*
            [동기화]
            1. 정의 : 메소드/기능에 Lock(락) 사용하여 메소드를 점령하는 상태
            2. 목적 : 서로 다른 여러 스레드가 동시에 하나의 메소드에 사용한다면 충돌 발생할 수 있다
            3. 비교
                동기화                                   비동기화
                처리순서 보장                             처리순서 보장 안됨
                주문순소대로 음료 제조 후 손님에게 준다       제조가 먼저 완성된 음료를 손님에게 준다
            4. 사용법
                synchronized 타입명 메소드명(){}ㅁ
        */

        계산기 계산기 = new 계산기();
        // 스레드A
        작업스레드A threadA = new 작업스레드A();
        threadA.계산기 = 계산기;
        // 스레드B
        작업스레드B threadB = new 작업스레드B();
        threadB.계산기 = 계산기;

        threadA.start();
        threadB.start();



    }// main e
}// class e

class 계산기{
   int memory;
   //메소드
    public synchronized void setMemory(int   memory){
        this.memory = memory;
        try {Thread.sleep(2000);
        }catch(Exception e){}
        System.out.println(Thread.currentThread().getName());
        System.out.println("결과 : " + this.memory);
    }
}

//2개의 스레드가 동일한 계산기 객체를 갖는 예제
class 작업스레드A extends Thread{
    계산기 계산기;

    @Override
    public void run() {
        계산기.setMemory(100);
    }
}

class 작업스레드B extends Thread{
    계산기 계산기;

    @Override
    public void run() {
        계산기.setMemory(200);
    }
}

