package 도서관리.controller;


import product.model.dto.UserDto;
import 도서관리.model.BookDao.UserDao;

public class UserController {
        private UserController(){}
        private static final UserController instance = new UserController();
        public static UserController getInstance(){return instance;}
        private UserDao ud = UserDao.getInstance();


    // 회원가입
    public boolean userAdd(String id , int pwd , String phone){
        boolean userResult = ud.userAdd(id ,pwd ,phone);
        return userResult;
    }

    //일반 로그인
    private int loginSession = 0; //세션이란 일정한 저장소 구역
    public boolean login(String id , int pwd){
        boolean loginResult = ud.login(id, pwd);
        return loginResult;
    }

    //관리자 로그인
    public boolean adminLogin(int adminKey){
        boolean loginResult = ud.adminLogin(adminKey);
        return loginResult;
    }

}
