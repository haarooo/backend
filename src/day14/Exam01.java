package day14;

import java.awt.*;

public class Exam01 {
    static void main() {

        //스레드
        /*
            프로세스 : 프로그램(명령어집합)이 실행중인 흐름
            멀티 태스킹 : 2가지 이상의 작업을 동시 처리
            멀티 프로세스 : 운영체제가 2가지 이상의 프로세스(프로그램)을 동시 처리
            멀티 스레드 : 2가지 이상의 명려엉 동시 처리
            스레드 : 하나의 프로세스내에서 실행되는 작업단위 , 실행 흐름 단위
                *js는 자체적인 스레드가 없음(브라우저/크롬 : 스레드)
                *java/python/c 는 자체적인 스레드가 있다(main)
                1. 목적 : 코드(명령어)들을 읽고 cpu에게 전달한다
                2. 자바의 (기본)스레드
                    public static void main(String[]args){}

                멀티 스레드 : main스레드 외 새로운 작업 스레드 생성하여 동시작업
                1. 목적 : 병렬처리, 동시에 여러 작업 처리
                2. 사용처 : 웹/앱 , 채팅 , 첨부파일, jdbc
                3. 구현방밥
                    1) Runnable runnable= new Runnalbe(){@override public void run(){작업스레드코드}}
                       Thread thread = new Thread(runnable);
                       thread.start();
                    2) class 작업스레드 = implements Runnable{@Override public void run(){작업스레드}}
                       작업스레드 변수 = new 작업스레드();
                       Thread thread = new Thread(변수);
                       thread.start();
                    3) class 작업스레드 extends Thread{@Override public void run(){작업스레드코드}}
                       작업스레드 변수  = new 작업스레드();
                       변수.start();

               4. 주요 메소드
                Runnable 인터페이스 : run 추상메소드 ,
                Thread 클래스 : start메소드 , 구현된 run 메소드 실행 메소드
        */

        //1 단일 스레드에서는 띵 소리와 띵 출력을 동시에 할 수 없다
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //자바의 UI제공
        for(int i = 1 ;i<=5 ; i++){
            toolkit.beep(); // 띵 소리 제공하는 메소드
            try{Thread.sleep(1000);}catch (Exception e){}
        }
        for(int i = 0 ; i<=5 ;i++){
            System.out.println("띵");
        }

        //2 멀티 스레드 소리와 출력 동시에 가능
        Runnable runnable = new Runnable(){
            @Override
            public void run(){//추가된 작업 스레드가 처리할 코드
                for(int i = 1 ;i<=5 ; i++){
                    toolkit.beep(); // 띵 소리 제공하는 메소드
                    try{Thread.sleep(1000);}catch (Exception e){}
                }
            }
        };// 익명구현체 꼭 ;넣기
        Thread thread1 = new Thread(runnable); //익명구현체 인터페이스를 Thread 객체 대입
        thread1.start(); //스레드 객체가 start()메소드를 호출하면 구현한 run메소드가 실행

        for(int i = 0 ; i<=5 ;i++){
            System.out.println("띵");
            try{Thread.sleep(1000);}catch (Exception e){}
        }


        //3 멀티스레드2
        SoundBeep soundBeep = new SoundBeep();
        Thread thread2 = new Thread(soundBeep);
        thread2.start();

        for(int i = 0 ; i<=5 ;i++){
            System.out.println("띵");
            try{Thread.sleep(1000);}catch (Exception e){}
        }

        //4 멀티스레드3
        SoundBeep2 thread3 = new SoundBeep2();
        thread3.start();

        for(int i = 0 ; i<=5 ;i++){
            System.out.println("띵");
            try{Thread.sleep(1000);}catch (Exception e){}
        }






    }//m e
}//c e
class SoundBeep implements Runnable{
    //Runnable 인터페이스 구현
    //run 추상메소드 구현
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 1; i <= 5; i++) {
            toolkit.beep();
            try {Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}//c e

class SoundBeep2 extends Thread{
    // Thread 클래스 상속
    // run 메소드 재정의 ->추가 작업스레드가 처리할 코드

    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 1; i <= 5; i++) {
            toolkit.beep();
            try {Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}
