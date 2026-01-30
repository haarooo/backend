package 종합과제2.controller;

import 종합과제2.model.dao.WaitingDao;
import 종합과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    private WaitingController(){};
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }
    private WaitingDao wd = WaitingDao.getInstance();

    // 대기 등록 제어
    public boolean doWaiting(String phoneNumber , int peopleNumber){
        boolean saveResult = wd.doWaiting(phoneNumber , peopleNumber);
        return saveResult;
    }

    //대기 현황 조회 제어
    public ArrayList<WaitingDto> doGet(){
        return wd.doGet();
    }
}//c end
