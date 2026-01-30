package 종합과제2.model.dto;

import 종합과제1.Waiting;

import java.util.ArrayList;

public class WaitingDto {
    //dto라는 기본게시판에 멤버변수를 private으로 저장
    private int no;
    private String phoneNumber ;
    private int peopleNumber ;

    public WaitingDto(){ //기본 생성자 생성

    }

    public WaitingDto(int no, String phoneNumber, int peopleNumber) { //멤버변수 전체를 매개변수로 갖는 생성자 생성
        this.no = no;
        this.phoneNumber = phoneNumber;
        this.peopleNumber = peopleNumber;
    }

    //getter와 setter 생성
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }


    //toString 생성
    @Override
    public String toString() {
        return "WaitingDto{" +
                "no=" + no +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", peopleNumber=" + peopleNumber +
                '}';
    }
}//c end
