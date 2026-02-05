package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exan01 {
    public static void main(String[] args) {
        // 1. 예외처리 : 개발자가 구현한 로직이나 사용자의 영향으로 발생한 문재
        // -> 시스템오류 : 시스템이 종료되는 심각한 문제

        // 2. 예외종류
            // 일반예외 : 컴파일(실행) 될 떄 예외 처리 코드 검사
                //입출력 , 네트워크 , 파일 , JDBC(DB연동) 등 주로 외부와 통신
            // 실행예외 : 실행 도중에 발생하는 예외처리 코드 검사 (개발자의 예측/경험 의존도 크다)
                // 연산문제 , null , index 등 주로 코드/타입 문제
        // 3. 목적 : 1) 예외를 고치는 것이 아니라 예외가 발생하면 피해서 다른 코드로 이동 , 즉) 24시간 코드실행

        // 4. 사용법
            // try{ 예회가 발생하거나 발생할 것 같은 코드}
            // catch(발생한 예외클래스명 변수명){만약에 예외발생 했을때 처리할 코드}

        // 5. 주요 예외 클래스
            //1. ClassNotFoundExcepttion : 클래스를 못 찾았을 때 발생하는 예외 클래스
            //2. InterruptedException : 흐름(스레드)가 중단 되었을때
            //3. NullPointerException : null일떄 메소드 호출 불가능


        // 1) 일반예외 예시,  Class.forName("패키지명.클래스명") : 현재 프로젝트내 클래스가 존재하는지 검사/동적할당
        try{
        Class.forName("java.lang.String2"); // String 클래스가 존재하는지 확인
        }catch (ClassNotFoundException 변수명1){
            System.out.println("예외 발생");
        }

        // 2) 일반예외 예시2 , Thread.sleep(밀리초) : 현재 흐름(스레드)를 일시정지 메소드
        try {
            Thread.sleep(1000); // 현재 흐름(스레드) 1초간 일시정지
        } catch (InterruptedException e2) {
            System.out.println("예외 발생2");
        }

        // 일반예외 클래스들은 실행 전에 코드 밑줄에 빨간색으로 예외 발생 가이드
        // 3) 실행예외 예시3
        try{
        String name = null;
        System.out.println(name.length()); // .
        }catch(NullPointerException error ){
            System.out.println("예외발생3 : null은 메소드를 호출할 수 없음");
        }

        // 4) 실행예외 예시4
        try{
        String str1 = "100";
        String str2 = "1abc";
        int int1 = Integer.parseInt(str1); // Integer.parseInt(문자열) : 문자열 => 정수타입 변환 메소드
        int int2 = Integer.parseInt(str2); // 불가능
        }catch(NumberFormatException e){
            System.out.println("예외발생4 : 정수타입으로 변환 불가능");
        }

        // 5) 실행예외 예시5 , ArrayIndexOutOfBoundsException
        try{
        int[] ary = {1, 2, 3};
        System.out.println(ary[2]);
        System.out.println(ary[3]); //
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("예외발생5 : 없는 인덱스" + e);
        }

        // 6) 실행예외 예시6
        try{
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        }catch (InputMismatchException e ){
            System.out.print("예외발생6 : 타입에 맞지 않는 입력" + e);
        }

        // 7) 예외는 다양한 이유로 발생한다. 실행 예외 중에 상위클래스가 존재한다. = Exception 클래스
        try{

        }catch (NumberFormatException e2){

        }catch(NullPointerException e1){

        }catch (Exception e){ //모든 예외에 대해 처리해주는 상위클래스
            System.out.println(e);
        }finally {
            System.out.println("예외가 발생 여부 상관없이 무조건 실행되는 구역");
        }






    }
}
