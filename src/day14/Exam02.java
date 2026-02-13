package day14;

import java.time.LocalTime;
import java.util.Scanner;

public class Exam02 {
    static void main() {

        //시계 스레드 만들기
        Time time = new Time();
        Thread thread1 = new Thread(time);
        thread1.start();

        // 타이머 스레드 만들기
        타이머스레드 타이머스레드 = new 타이머스레드();
        타이머스레드.start();

        //main thread 입력
        for(;;){
            System.out.println("타이머 : 1) on 2) off : ");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if(ch==1){
                타이머스레드 = new 타이머스레드();
                타이머스레드.state = true;
                타이머스레드.start();
            }
            else if(ch==2){
                if(타이머스레드 != null){
                    타이머스레드.state = false;
                }
            }
        }




    }// main end
}// class end

class Time implements Runnable{
    @Override
    public void run() {
        for(;;){

            System.out.println(LocalTime.now()); // 현재시간
            try {Thread.sleep(998); //현재 작업스레드 1초멈추기
            }catch(Exception e){}


        }
    }
}

class 타이머스레드 extends Thread{
    boolean state = false;
    @Override
    public void run() {
        int second = 0; // 타이머가 계산하는 초
        for(;;){
            if(state == false)break;
            second++;
            System.out.printf("[타이머] : %d초\n" , second);
            try {Thread.sleep(998); //현재 작업스레드 1초멈추기
            }catch(Exception e){}
        }
    }
}