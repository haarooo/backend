package day13;

import 도서관리.model.BookDto.BookDto;
import 종합예제7.model.dto.BoardDto;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice15 {
    static void main() {

        //1
        BookDto1 day = new BookDto1();
        BoardDto1 day1 = new BoardDto1();
        System.out.println(day);
        System.out.println(day1);

        //2
        String str1 = new String("유재석");
        String str2 = new String("유재석");
        System.out.println( str1 == str2 );
        System.out.println( str1.equals( str2 ));

        //3
        String str3 = new String("강호동");
        Class c1 = str3.getClass();
        try { Class c2 = Class.forName("java.lang.String");
        }catch (ClassNotFoundException e){}
        Method[ ] methods = c1.getMethods();
        int count = methods.length;




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

class BookDto1{

}
class BoardDto1{
    @Override
    public String toString() {
        return "BoardDto1{}";
    }
}

