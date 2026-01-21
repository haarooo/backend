package day03;

public class Exam01 {
    public static void main(String[] args) {
        //1. 조건문
        int 온도 = 5;
        if (온도 <= 10) System.out.println("외투 입니다");

        //실행문이 2개일때 중괄호
        int 나이 = 20;
        if (나이 >= 19) {
            System.out.println("성인 입니다");
            System.out.println("19세 입니다.");
        }

        //3.
        boolean 회원검사 = false;
        if (회원검사 == true) {
            System.out.println(" 안녕하세요 회원님 ");
        } else {
            System.out.println("비회원 입니다");
        }

        //여러 조건에 따른 하나의 실행문을 갖는다
        int 지갑돈 = 1750;
        if(지갑돈 >= 3000){System.out.println("택시를 탄다");}
        else if(지갑돈 >= 1700){System.out.println("버스를 탄다");}
        else if(지갑돈>=1200){System.out.println("자전거 탄다");}
        else{System.out.println("걸어간다");}

        //여러 조건에 따른 여러 실행문을 갖는다
        if(지갑돈 >= 3000){System.out.println("택시를 탄다");}
        if(지갑돈 >= 1700){System.out.println("버스를 탄다");}
        if(지갑돈>=1200){System.out.println("자전거 탄다");}
        if(지갑돈<1200){System.out.println("걸어간다");}

        //5. if중첩
        int age = 25;
        char gender = 'w';
        if(age >=19){
            System.out.println("성인");
            if(gender == 'w'){
                System.out.println("성인여자");
        }else{
                System.out.println("성인남자");}
        }


        //6. switch: 논리 검사 보다 값에 따른 흐름 제어 사용
        char grade = 'B'; //case가 일치하면 실행 , 아래 case모두 실행
        switch(grade){
            case 'A':
                System.out.println("우수학생");
                //아래 switch 탈출
            case 'B':
                System.out.println("장려학생");
                break;
            default :
                System.out.println("학생");
        }

        //7. switch 중첩
        int adult = 1;
        char gender2 = 'w';
        switch (adult){
            case 1 :
                System.out.println("성인");
                switch (gender2){
                    case 'w':
                        System.out.println("성인여자");
                        break;
                    case 'm' :
                        System.out.println("성인남자");
                }
                break;
            default:
                System.out.println("미성년자");
        }

    }//main e
}
