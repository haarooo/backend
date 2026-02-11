package day13;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exam01 {
    static void main() {
        
    
    //내부 라이브러리/클래스 : Object,Class,래퍼클래스

    //1 날짜/시간 클래스
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
    //정해진 날짜/시간
        LocalDateTime dateTime = LocalDateTime.of(2025 , 02 , 14 , 11,30 , 12);
        System.out.println("dateTime = " + dateTime);
    //정해진 패턴(형식) 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String today = dateTime.format(formatter); //날짜/시간객체.format
        System.out.println("today = " + today);
    //날짜계산 , plusxxx(증가값)
        LocalDateTime dateTime1 = dateTime.plusDays(10);
        System.out.println("dateTime1 = " + dateTime1);
        LocalDateTime dateTime2 = dateTime1.minusDays(30);
        System.out.println("dateTime2 = " + dateTime2);
    //날짜 세부 정보
        int year = localDateTime.getYear();
        System.out.println("year = " + year);
        int month = localDateTime.getMonthValue();
        System.out.println("month = " + month);
        int day = localDateTime.getDayOfMonth();
        System.out.println("day = " + day);
    }//main e
}//class e
