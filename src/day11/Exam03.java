package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam03 {
    public static void main(String[] args) {
        // JDBC : 자바 데이터베이스 연결
        // mysql-connector-j-9.6.0.jar
        // .jar
        //연동
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 동적할당 = 해당 클래스가 존재하면 동적으로 객체 생성
            //연동2
            String url = "jdbc:mysql://localhost:3306/mydb0205";
            String user = "root";
            String password = "1234";
            //구현체
            Connection conn = DriverManager.getConnection(url , user , password);
            System.out.println("연동성공");

            //연동 이후 DML 실행하기
            String sql = "insert into buy values(null , 'BLK' ,'지갑' , null , 30 ,10 )"; //실행할 sql 문법을 문자열로 작성
            PreparedStatement ps  = conn.prepareStatement(sql);
            int count = ps.executeUpdate(); //기재된 sql실행
            System.out.println(count);
        }catch (ClassNotFoundException e) {
            System.out.println(e);
        }catch (SQLException e){
            System.out.println("등록된 DB서버로 연동 실패" + e);
        }





    }// m end
}// c end
