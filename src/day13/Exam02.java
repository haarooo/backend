package day13;

import java.lang.classfile.instruction.StoreInstruction;
import java.util.Arrays;

public class Exam02 {
    static void main() {
        //String 클래스
        //1. 문자열 표현 방법
        char str1 = '유'; // char 한글자만 저장
        char[] str2 = {'유' , '재' ,'석'}; //char 타입 배열

        //2. 문자 변환 , 아스키코드(c) ,  유니코드(java)
        char str3 = 65;
        System.out.println(str3);
        char[] str4 = {74 , 65 , 86 , 65};
        System.out.println(Arrays.toString(str4));
        char str5 = '김';
        System.out.println((int)str5);

        //3. 문자열 생성
        String str6 = "유재석"; //문자 리터럴 형식
        String str7 = "유재석";
        String str8 = new String("유재석");//문자 객체 형식
        System.out.println(str6 == str7); //true
        System.out.println(str6 == str8);//false // == 리터럴비교
        System.out.println(str6.equals(str8)); //true //equals = 객체비교

        //4. 주요 기능/메소드
        //concat
        String str9 = "자바";
        System.out.println(str9.hashCode());
        String str10 = str9.concat("프로그래밍");
        System.out.println(str10.hashCode());
        System.out.println(str9.concat("프로그래밈")); //concat = 문자연결gkdu 새로운반환 함수

        //문자열 + 새로운문자열
        String str11 = str9 + "프로그래밍";

        //StringBuilder , append 함수 이용하여 문자열 연결 , 주소값유지 가능
        StringBuilder builder = new StringBuilder();
        builder.append(str9);
        builder.append("프로그래밍");
        System.out.println(builder);

        //String.format("% , 문자열")
        String str12 = String.format("%s%s" , str9 , "프로그래밍");
        System.out.println(str12);

        //"""자동 줄바꿈 표현
        String str13 = """
                자바
                프로그래밍
                """;
        System.out.println(str13);

        //활용 : JDBC SQL
        String name = "유재석";
        String sql1 = "insert into table(name)values("+name+")";
        String sql2 = "insert into table(name)values(".concat(name +")");
        String sql3 = String.format("insert into table(name)values(%s)" , name);
        StringBuilder sql4 = new StringBuilder();
        sql4.append("insert into table(name)");
        sql4.append("value(");
        sql4.append(")");
        String sql5 = "insert into table(name)values(?)";
        
        //.chatAt(인덱스)
        char gender = "010507-1234567".charAt(8);
        System.out.println("gender = " + gender);

        //.length(); 문자열내 문자 개수/길이 반환
        System.out.println("010111-1231223".length());

        //8.replace(기존문자 , 새로운문자): 치환
        String str14 = "자바프로그래밍".replace("자바" , "JAVA");
        System.out.println(str14);

        //활용 : HTML(데이터수집 과정 정제/정리)
;       String html = "<div>유재석</div><br/><div>강호동</div><br/>";
        System.out.println(html.replaceAll("<br/>" , "\n"));

        //.substring(시작 , [끝]) 시작부터 끝 인덱스까지 추출
        String str15 = "010123-1234123".substring(0,6);
        System.out.println(str15);

        //.split("구분문자"), 구분문자 기준으로 잘라서 배열로 반환
        String[] str16 = "010123-1234123".split("-");
        System.out.println("str16[0] = " + str16[0]);
        System.out.println("str16[1] = " + str16[1]);

        //.indexOf("찾을문자") 찾을문자가 존재하면 인덱스번호 아니면 -1반환 , 활용처 : 검색
        //.contains("찾을문자"), 찾을문자가 존재하면 true 아니면 false 반환
        System.out.println("자바 프로그래밍언어".indexOf("프로"));
        System.out.println("자바 프로그래밍 언어".contains("프로"));

        //13.getbytes(), 문자열을 byte[]배열로 반환
        byte[] str17 = "ABC ".getBytes();
        System.out.println(Arrays.toString(str17));
        String str18 = new String(str17);
        System.out.println(str18);




    }
}
