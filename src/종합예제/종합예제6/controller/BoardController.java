package 종합예제.종합예제6.controller;

import 종합예제.종합예제6.Model.Dao.BoardDao;
import 종합예제.종합예제6.Model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return instance;
    }
    private BoardDao bd = BoardDao.getInstance();

    //1. 등록제어 view에게 입력받은 content writer 받아서 dao에게 요청 후 결과룰 view에게 전달
    public boolean doPost(String content , String writer){
        boolean saveResult = bd.doPost(content , writer); //1. Dao에게 content 와 writer 전달하고 결과 받기
        //2.Dao에게 받은 결과를 view에게 전달
        return saveResult;
    }
    //2. 전체 조회 제어 : view에게 모든 게시물들을 요청 받아 dao에게 요청하여 결과를 view에게 전달한다.
    public ArrayList<BoardDto> doGet(){
        return bd.doGet();
    }
}
