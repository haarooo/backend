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
    public String login(String id , int pwd){
        String loginResult = ud.login(id, pwd);
        return loginResult;
    }

}//c end
