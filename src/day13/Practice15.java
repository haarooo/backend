package day13;

import 도서관리.model.BookDto.BookDto;
import 종합예제7.model.dto.BoardDto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice15 {
    static void main() {







        //5
        LocalDateTime dateTime = LocalDateTime.of(2012 , 05 , 07 , 12 ,12 , 12 );
        System.out.println("localDateTime = " + dateTime);
        LocalDateTime dateTime1 = dateTime.plusDays(10);
        LocalDateTime dateTime2 = dateTime.minusDays(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
        String today = dateTime.format(formatter);
        String today10 = dateTime1.format(formatter);
        String today30 = dateTime2.format(formatter);
        System.out.println("dateTime1 = " + dateTime1);
        System.out.println("dateTime2 = " + dateTime2);
        System.out.println("현재:" + today);
        System.out.println("+10일:" + today10);
        System.out.println("-30일:"+ today30);

    }//main e
}//class e

