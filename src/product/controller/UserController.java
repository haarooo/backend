package product.controller;

import product.model.dao.UserDao;
import product.model.dto.UserDto;
import 종합과제2.controller.WaitingController;
import 종합과제2.model.dao.WaitingDao;
import 종합과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class UserController {

    private UserController(){};
    private static final UserController instance = new UserController();
    public static UserController getInstance(){
        return instance;
    }
    private UserDao ud = UserDao.getInstance();

    // 회원가입
    public boolean userAdd(String id , int pwd , String nickname , String phone){
        boolean userResult = ud.userAdd( id , pwd , nickname , phone);
        return userResult;
    }
    //회원 목록 출력
    public ArrayList<UserDto> doGet(){
        return ud.userdoGet();
    }

    //로그인
    private int loginSession = 0; //세션이란 일정한 저장소 구역
    public String login(String id , int pwd){
        UserDto loginResult = ud.login(id, pwd);
        if(loginResult != null){loginSession = loginResult.getUserNo();
            return loginResult.getNickname();
        }
        return null;
    }

    public boolean logout(){
        loginSession = 0;
        return true;
    }
    public int getLoginSession(){return loginSession;}

}//c end
