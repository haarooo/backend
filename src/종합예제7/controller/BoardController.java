package 종합예제7.controller;

import 종합예제7.model.dao.BoardDao;
import 종합예제7.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){};
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){return instance;}

    private BoardDao bd = BoardDao.getInstance();

    // 1. 게시물 등록 controller

    public boolean write(String bcontent , String bwriter){
        boolean result = bd.write(bcontent , bwriter);
        return result;
    }

    // 4 게시물삭제
    public boolean delete(int bno){
        boolean result = bd.delete(bno);
        return result;
    }

    // 3 게시물 수정
    public boolean update(int bno , String bcontent){
        boolean result = bd.update(bno , bcontent);
        return result;
    }

    //2 게시물 출력
    public ArrayList<BoardDto> findALL(){
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }


}// c end
