package day13;

import day07.package1.A;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Exam03 {
    static void main() {

        //난수클래스

        //1.랜덤 객체 생성
        Random random = new Random();
        //1) 0~9 사이의 난수 생성
        int val1 = random.nextInt();
        System.out.println(val1);
        int val2 = random.nextInt(10);
        System.out.println("val2 = " + val2);
        //2. 1~10 사이의 난수생성
        int val3 = random.nextInt(10)+1;
        System.out.println("val3 = " + val3);
        //3.0~1사이의 실수 생성
        double val4 = random.nextDouble()+1;
        System.out.println(val4);
        //4. boolean
        boolean val5 = random.nextBoolean();
        System.out.println("val5 = " + val5);
        //활용처 : 특정한 목록에서 하나의 항목 랜덤 조회
        ArrayList<String> list = new ArrayList<>();
        list.add("유재석"); list.add("강호동"); list.add("신동엽");
        int index = random.nextInt(list.size());//리스트내 항목개수 만큼 난수 생성
        System.out.println(list.get(index));
        //활용처 : 인증코드/임시비밀번호 생성
        String code = ""; //인증코드 6자리 저장하는 변수
        for (int i = 0; i <= 6; i++) {
            int rand = random.nextInt(26)+97;
            char ch = (char)rand;
            code += ch;//인증코드에 연결
        }
        System.out.println(code);
        //활용처 : 주사위/로또번호

        //2 UUID : 범용 고유 식별자
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        /*
            UUID장점
            - 중복될 확률 거의 없다
            - 랜덤 기반 식별자
            사용처
            - 데이터베이스 PK, 파일명 , 로그인세션(Token)
            - mysql auto_increment : 1 2 3 4 순으로 증가하면 가볍고 노출이 쉽다.
            - UUID : 난수이므로 무겁고 노출이 어렵다


        */







    }//m end
}//c end
