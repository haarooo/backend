package 종합과제2.model.dao;

import 종합과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao { //싱글톤
    private WaitingDao(){}; //기본 생성자를 private : 외부에서 new하지 못하도록
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){//싱글톤을 반환하는 메소드
        return instance;
    }
    private static final ArrayList<WaitingDto> waitingList = new ArrayList<>(); //데이터베이스 역할을 하는 배열 만들기
    private static int currentNumber; //번호 지정

    //1. 대기 등록
    public boolean doWaiting(String phoneNumber , int peopleNumber){
        WaitingDto waitingDto = new WaitingDto(currentNumber , phoneNumber , peopleNumber); //waitingDto라는 객체 만들기

        boolean saveResult = waitingList.add(waitingDto); //개체를 배열에 저장
        currentNumber++;

        return saveResult;
    }

    //2. 대기 현황 조회

    public ArrayList<WaitingDto> doGet(){

        return waitingList;
    }












}//c end
