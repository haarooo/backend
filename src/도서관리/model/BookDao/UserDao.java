package 도서관리.model.BookDao;


import 도서관리.model.BookDto.UserDto;

import java.util.ArrayList;

public class UserDao {
    private UserDao(){};
    private static final UserDao instance = new UserDao();
    public static UserDao getInstance(){return instance;}
    private static final ArrayList<UserDto> userList = new ArrayList<>();
    private static int userNo = 1;


    //회원 등록 함수
    public boolean userAdd(String id, int pwd, String phone) {
        UserDto userDto = new UserDto(userNo, id , pwd , phone);
        boolean userResult = userList.add(userDto);
        userNo++;
        return userResult;
    }

    //일반 로그인 함수
    public boolean login(String id , int pwd){
        for(int index = 0 ; index <= userList.size() -1 ; index++){
            UserDto userDto =userList.get(index);
            if(userDto.getId().equals(id) && userDto.getPwd() == pwd){
                return true;
            }
        }return false;
    }


    //관리자 로그인 함수
    public boolean adminLogin(int adminKey){
            if(adminKey == 1234 ){
                return true;
            }
        return false;
    }




}
