package day08;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam01 {
    public static void main(String[] args) {

        //1. ArrayList 클래스 : 컬렉션(수집) 프레임워크 , 수집관련 클래스/기능 제공
        //2. 정의 : 컬렉션 프레임워크 중 리스트(배열) 자료형 클래스/타입
        //3. 목적 : 가변(변하는 요소들의 수) 길이의 배열 제공과 기능/메소드 제공
        //4. 사용법
            //1. 선언/정의하기 : ArrayList<항목타입> 변수명 = new ArrayList()<>;
            // < > : 제네릭 타입으로 리스트안에 저장할 항목들의 타입
            // 제네릭 타입은 기본타입 불가능 int -> Integer 클래스 변경해서 작성
        ArrayList<String> 리스트변수명 = new ArrayList<>(); //여러개 String 객체를 저장하는 리스트
        //vs String [] 뱐수명 new String[100]
            //2, 요소 추가 : .add(새로운값) : 마지막 빈 배열에 요소 추가
        리스트변수명.add("유재석");
        리스트변수명.add("강호동");
        System.out.println(리스트변수명);
        리스트변수명.add(1 , "서장훈");
        System.out.println("리스트변수명 = " + 리스트변수명);
        
            //3. 요소 수정
        리스트변수명.set(1 , "박명수");
        System.out.println("리스트변수명 = " + 리스트변수명);
        
            //4. 요소 총개수 : .size() : 리스트내 항목 요소/값 들의 총개수 반환
        리스트변수명.size();
        System.out.println("리스트변수명.size() = " + 리스트변수명.size());
            
            //5. 요소 값 호출
        리스트변수명.get(1);
        System.out.println("리스트변수명.get(1) = " + 리스트변수명.get(1));
        
            //6. 요소 삭제
        리스트변수명.remove(2);
        System.out.println(리스트변수명);

            //7. indexOf
        System.out.println(리스트변수명.indexOf("유재석")); //찾는값의 인덱스 반환 없으면 -1반환

            //8. contains 찾는값이 있으면 true , 없으면 false
        System.out.println(리스트변수명.contains("유재석"));

        // 반복문과 리스트 활용
        for(int index = 0 ; index<= 리스트변수명.size() -1 ; index++){
            System.out.println(리스트변수명.get(index)) ;
        }
        for(String str : 리스트변수명){
            System.out.println(str);
        }

            //claer 요소 전체삭제
        리스트변수명.clear();

            //isEmpty 요소 존재여부
        boolean 여부 = 리스트변수명.isEmpty();
        System.out.println(여부);






    }//m end
}//c end
