package day14;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice16 {
    static void main() {

        //문제1
        DeliveryTask deliveryTask = new DeliveryTask();
        Thread thread = new Thread(deliveryTask);
        thread.start();

        for (int i = 1; i <= 3; i++) {
            System.out.println("[메인] 주문 화면 갱신 " + i);
            try {Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
        try {thread.join();
        }catch (InterruptedException e){}

        System.out.println("[안내] 배달 처리 종료");

        //문제2
        Cart cart = new Cart();

        Thread userA = new Thread();
            for (int i = 0; i < 5; i++) {
                cart.addPrice(100);
            }

        Thread userB = new Thread();
            for (int i = 0; i < 5; i++) {
                cart.addPrice(200);
            }
        userA.start();
        userB.start();

        try{
        userA.join();
        userB.join();
        }catch(Exception e){}
        System.out.printf("[최종] total = %d / 예상 = 1500 \n" , cart.getTotal());

        //문제3
        ExecutorService pool = Executors.newFixedThreadPool(3);








    }//main e
}// class e

class DeliveryTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("[배달기사] 이동중 " + i);
            try{Thread.sleep(1000);
            }catch (InterruptedException e) {}
        }
    }
}

class Cart{
    int total;
    public synchronized void addPrice(int price){
        this.total = total;
        total += price;
        try {Thread.sleep(500);
        }catch (Exception e){}
        System.out.printf("[장바구니] 추가금액 = %d 현재총액 %d \n" , price , total);
    }
    public int getTotal(){
        return total;
    }
}

class InquiryTask implements Runnable{
    @Override
    public void run() {
        for(int i = 1 ; i<=10 ; i++){
            String name = "[처리시작] 문의" + i;

        }
    }
}











