package day05;

import java.util.Arrays;

public class Exam01 {
    public static void main(String[] args) {
        //1. 배열 = 동일한타입의 여러 자료돌을 순서대로 저장하는 자료타입
        //2. 선언 = 타입[]변수명 = new 타입[총개수]
        //3. 특징 = 1. 동일한 타입끼리 2. 고정길이 3. 요소의 초기값 존재
        //4. 인덱스란 배열내 요소(값)이 저장된 순서 번호, 0번시작
        int[ ]ary1 = new int[3]; //{0,0,0}
        String[] ary2 = {"봄" , "여름" ,"가을" , "겨울"}; //{초기값1 , 초기값2}
        //5. 배열변수의 출력
        System.out.println(ary1);//[I@4c873330: 배열의주속(메모리위치)값 출력
        System.out.println(ary2); //[Ljava.lang.String;@119d7047
        //6. 뱌열변수의 요소/값 전체 출력
        System.out.println(Arrays.toString(ary1));
        System.out.println(Arrays.toString(ary2));
        //배열의 메모리 주소 상태 간단 구조
        /*
         1. new int[3] 선언하면 int[4byte] , int[4byte] , int[4byte]
         2. 12byte 생성
         3. 컴퓨터는 최소의 저장단위를 바이트(위치/주소값)
         4. 배열의 변수는 총 12개의 주소값을 가진게 아니고 가장 첫반째의 주소값을 가진다.
            int ary1 = new int[3]
            ary1 = 101번지 : 첫번째 요소의 주소값이 들어있다
        */
        System.out.println(ary1.length); //배열변수명.length : 배열의 길이 =3
        //배열 요소 수정
        ary1[0] = 10;
        System.out.println(ary1[0]);
        ary2[1] = "spring";
        System.out.println(ary2[1]);
        //9. 배열 요소 추가
        //ary1[4] = 40; 불가능
        //10. 반복문 활용
        for(int index = 0 ; index <= ary1.length -1 ; index ++){
            System.out.println(ary1[index]);
        }
        //11. 향상도니 for문
        //for( 타입 반복변수 : 배열변수명){} , iterator(이터레이터/반복자/순회자)가 가능한 배열/객체
        for(int value : ary1){
            System.out.println(value);
        }






    }
}
