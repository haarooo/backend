package day14;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam04 {
    static void main() {

        /*
        Thread Pool
            1. 정의 : 미리 일정 개수의 Thread를 생성하고 필요에 따라 재사용하는 방식(웹/앱)
            2. 목적 : 작업이 들어올때 마다 새로운 스레드가 아닌 기존 스레드 이용한다
            3. 효과 : Thread 재사용 , 자원효율성 , 서버과부하 방지 등등
            4. 구조 : '큐'라는 자료구조를 배치하여 순서대로 스레드 풀에서 대기중인 스레드에게 작업을 배정
                    -'큐'린? 자료의 데이터를 요청 순서대로 처리방법 , 선입선출
            5. 스레드풀 예시(콜센터)

                                직원1(유재석/스레드)
           콜 요청 --->          직원2(강호동/스레드)
                                직원3(신동엽/스레드)

            6. 사용처 : 1) 서버프로그램 2)JDBC 3)채팅 4) 대기프로그램 5) SPRING프레임워크
            7. 사용법
        */

        // 1. 작업 스레드 풀 배정/만들기
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // 2. 여러 스레드를 만들어서 각 스레드들을 작업스레드풀에 등록하기
        for(int i = 1 ; i <= 10 ; i++){
            String name = "Thread" + i;
            //3.
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    try {Thread.sleep(1000 + new Random().nextInt(1000));
                    }catch (Exception e){}
                    System.out.println("작업중인 스레드 : " + name);
                }
            };
            //생성된 작업스레드를 스레드풀에 등록
            executorService.submit(runnable);
        }
        // 스레드풀 종료(스레드풀에 저장된 모든 스레드 안전하게 종료)
        executorService.shutdown();



    }// main e
}// class e
