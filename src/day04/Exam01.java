package day04;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        //초기값 : 1 조건문 : 5까지 증감식 : 1씩 증가
        for(int i = 1 ; i<= 5 ; i++){
            System.out.println(i);}

        //구구단
        //2단~9단 : 초기값 : 1 , 조건문 : 9까지 , 증감식: 1씩증가
        for(int 단 = 2 ; 단<=9 ; 단++){
            System.out.println(단);}
        for(int 곱 = 1 ; 곱<=9 ; 곱++){
            System.out.println(곱);}
        //for문 중첩
        for(int 단 = 2 ; 단<=9 ; 단++) {
            for (int 곱 = 1; 곱 <= 9; 곱++) {
                System.out.printf("%d*%d=%d\n", 단, 곱, 단 * 곱);
            }
            System.out.println();
        }

        //break , continue
        for(int i =1 ; i <= 5 ; i++){
            if(i==3){break;}
            System.out.println(i);
        }
        for(int i =1 ; i <= 5 ; i++){
            if(i==3){continue;}
            System.out.println(i);
        }
        //무한루프
        /*
        for(;;){
            System.out.println("무한루프");
        }
        */
        while(true){
            System.out.println("무한");
            Scanner scan = new Scanner(System.in);
            String data = scan.next();
            if(data.equals("q")){break;}

        }


    }//main e
}
