package day15;

import java.util.*;

public class Exam02 {
    static void main() {

        //1 컬렉션(수집) 프레임(틀)워크(일)
        //1. 정의 : 자료들을 수집/저장 하는 방법들을 미리 만들어둔 인터페이스/클래스
        //2. 목적 : 복잡한 자료구조를 제공받아 편리한 데이터 관리
            //자료구조란? 컴퓨터가 자료들을 효율적으로 저장하는 방법/구조 , ex] 리스트/해시/큐/스택/트리 등
        //3. 종류 : 인터페이스란? 서로 다른 클래스/타입들을 기능 통합
        /*
            List(인터페이스) -> ArrayList , Vector, LinkedList , Stack 등
            Set -> HashSet , TreeSet 등
            Map -> HashMap , HashTable , TreeMap 등
        */

        // 2 List 타입
        ArrayList<String> list1= new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        //List 주요 메소드
        // 1) .add();
        list2.add("유재석");
        list2.add("유제석"); //중복허용
        list2.add(0 , "강호동"); // 특정 인덱스에 추가
        System.out.println("list2 = " + list2);
        //2) .set();
        list2.set(0 , "강호동");
        System.out.println("list2 = " + list2);
        //3) .get();
        System.out.println("list2.get(1) = " + list2.get(1));
        //4) .size();
        System.out.println("list2.size() = " + list2.size());
        //5) .contains(); , .indexOf();
        boolean result1 = list2.contains("강호동"); //여부
        int result2 = list2.indexOf("강호동"); //인덱스
        //6) .remove();
        list2.remove("강호동2");
        System.out.println("list2 = " + list2);
        //)7 .isEmpty();
        System.out.println(list2.isEmpty());
        //8) .claer(); , 전체삭제

        //List 타입과 반복문
        for(int index = 0 ; index <= list2.size() -1 ;index++){
            System.out.println(list1.get(index));
        }
        for(String str : list2){
            System.out.println(str);
        }

        //3) forEach문
        // 변수명.forEach( (반복변수) -> {실행문} ); //람다식
        list2.forEach((str) -> {System.out.println(str);});

        //list 구현체들
        List<Integer> list ; // 인터페이스 타입은 혼자 객체를 못 만든다

        //공통 : 여러 요소(값)들을 순서대로(인덱스) 저장하는 구조
        list = new ArrayList<>(); // + 싱글스레드 사용 , 비동기화 메소드
        list = new Vector<>();  // + 멀티스레드 사용 , 동기화 메소드
        list.add(0 ,50);
        list = new LinkedList<>(); // + 싱글스레드 사용 , + <링크> 구조
        list.add(0, 100);
        //ArrayList 중간 삽입/삭제 시 값 이동 발생 vs LinkedList  중간 삽입/삭제 시 갑 이동 발생 없음

        Stack<String> stack = new Stack<>();
        stack.push("유재석"); //값추가
        stack.push("강호동");
        System.out.println(stack.pop()); //갑 제거
        System.out.println(stack.pop());
        //Stack 스택 자료 구조  입/출구 하나 LIFO(last in first out)







    }
}//class e
