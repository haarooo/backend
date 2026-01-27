package 종합예제;

public class BoardController {
    Board[] boards = new Board[100];
    Boolean doPost(String 내용 , String 작성자){
        Board board = new Board();
        board.내용 = 내용;
        board.작성자 = 작성자;
        for(int index = 0 ; index <= boards.length-1 ; index++){
            if(boards[index] == null){
                boards[index] =board; //생성한 객체 저장
                return true;
            }
        }return false;
    }
    Board[] doGet(){
        return boards;
    }
}
