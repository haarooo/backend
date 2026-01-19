package day01;

public class Exam03 {

    public static void main(String[] args) { //메인함수
        //1. Ststem.out.println(); 줄바꿈 포한
        //System: 클래스 이면서 시스템(현재기기) 관련 기능/함수 제공
        //out: 출력 관련 기능/함수 갖는 객체를 반환
        //print: 출력함수
        System.out.println("안녕");

        //print : 자료 출력 후 줄바꾼 안함
        System.out.print("안녕2");

        //3. System.out.printf(""); 자료출력+형식문자
        System.out.printf("%s" , "자바안녕");
        /*
        printf(format형식)
            %s: 문자열 , %d: 정수 , %c: 문자 , %f 실수A
            %자릿수d : 자릿수 만큼 자리 차지 , 비어있으면 공백 오른쪽정렬
            %-자릿수d : 왼쪽정렬
            %0자릿수d: 비어있는곳 0으로 채움
            전체자릿수.소수점자릿수f : 소수점 표현
        */
        String name = "유재석"; int age = 10;
        System.out.printf("저는" + name + "이고 나이는" + age + "입니다."  );
        // 변수 또는 수식이 들어가는 자리에 형식문자로 대체
        System.out.printf("저는 %s이고 나이는 %d 입니다.\n" , name , age);
        System.out.printf("저는 %s이고 나이는 %6d 입니다\n" ,name , age);
        System.out.printf("저는 %s이고 나이는 %-6d입니다.\n" , name , age);
        System.out.printf("저는 %s이고 나이는 %06d입니다.\n" , name , age);
        System.out.printf("저는 %s이고 키는 %3.2f입니다.\n" , name , 177.456);


        /* 5. 이스케이프/제어 문자
        // "\n" : 줄바꿈
        */
        System.out.println("안녕1\n안녕2"); //줄바꿈
        System.out.println("안녕\t안녕2");  //들여쓰기
        System.out.println("안녕1\"안녕3"); //따옴표 출력
        System.out.println("안녕\'안녕4"); //따옴표 출력
        System.out.println("안녕\\안녕5"); // \출력

    }
}
