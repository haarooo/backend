package product.model.dao;

import product.model.dto.ProductDto;
import product.model.dto.UserDto;

import java.util.ArrayList;

public class UserDao {

    private UserDao() {};
    private static final UserDao instance = new UserDao();
    public static UserDao getInstance() {//싱글톤을 반환하는 메소드
        return instance;
    }
    private static final ArrayList<UserDto> userLists = new ArrayList<>();
    private static int userNo = 100;

    //회원 등록 함수
    public boolean userAdd(String id, int pwd, String nickname , String phone) {
        UserDto userDto = new UserDto(userNo, id , pwd , nickname , phone);
        boolean userResult = userLists.add(userDto);
        userNo++;
        return userResult;
    }
    //반환
    public ArrayList<UserDto> userdoGet(){
        return userLists ;
    }


    //로그인 구현
    public UserDto login(String id , int pwd){
        for(int index = 0 ; index <= userLists.size() -1 ; index++){
            UserDto userDto =userLists.get(index);
            if(userDto.getId().equals(id) && userDto.getPwd() == pwd){
                return userDto;
            }
        }return null;
    }

    public String findName(int loginNo){
        for(int index = 0 ; index<= userLists.size()-1 ; index++){
            if(userLists.get(index).getUserNo() == loginNo){
                return userLists.get(index).getNickname();
            }
        }return null;
    }




}// c end


