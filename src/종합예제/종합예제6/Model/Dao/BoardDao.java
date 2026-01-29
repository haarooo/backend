package 종합예제.종합예제6.Model.Dao;

import 종합예제.종합예제6.Model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return instance;
    }
    // 데이터베이스 역할하는 ArrayList <= 추후에 삭제예정
    private static final ArrayList<BoardDto> boards = new ArrayList<>();
    //전역변수에 최신 게시물번호 수 저장 < 식별키 생성 목적 <= 추후에 삭제 예정
    private static int currentNumber = 1;

    // 1. 등록처리
    public boolean doPost(String content , String writer){
        //1. 매개변수에 따른 객체 생성 + 게시물번호 자동 생성
        BoardDto boardDto = new BoardDto(currentNumber, content , writer);
        //2.add 새로운 값 넣기
        boolean saveResult = boards.add(boardDto);
        currentNumber++; //게시물 번호 증가
        //3. 저장 성공 여부를 controller에게 반환한다.

        return saveResult;
    }

    //2. 전체 조회 처리 : controller가 Dao에게 모든 개시물 요청한다
    //개별조회 1개 반환 타입은 : BoardDto vs 전체조회 n 개이면 반환타입 : 배열
    public ArrayList<BoardDto> doGet(){
        return boards;
    }
}
