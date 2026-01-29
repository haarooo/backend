package 종합예제.종합예제6.view;

import 종합예제.Board;
import 종합예제.종합예제6.Model.Dao.BoardDao;
import 종합예제.종합예제6.Model.dto.BoardDto;
import 종합예제.종합예제6.controller.BoardController;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    private Scanner scan = new Scanner(System.in);

    private BoardView(){}
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){
        return  instance;
    }
    private BoardController bc= BoardController.getInstance();

    //메인페이지
    public void indexView(){
        for(;;){
            Scanner scan = new Scanner(System.in);
            System.out.println("============= My Community =============");
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("======================================");
            System.out.print("선택>") ; int num = scan.nextInt();
            if(num ==1){writeView();}
            else if(num ==2){printView();}
        }
    }




    //1. 등록 입출력화면
    public void writeView(){
        System.out.print("작성자 : "); String writer = scan.nextLine();
        System.out.print("내용 : "); String content = scan.nextLine();
        boolean saveResult = bc.doPost(content, writer);//컨트롤러에게 입력받은 content, writer 전달하여 결과 받아오기
        //2. 받은 결과에 따른 화면 출력
        if(saveResult){
            System.out.println("글쓰기 성공");
        }else{System.out.println("글쓰기 실패");}
    }
    public void printView(){
        ArrayList<BoardDto> boards = bc.doGet();
        for(BoardDto boardDto : boards){
            System.out.printf("번호 : %d , 작성자 : %s , 내용 : %s \n" , boardDto.getNo() , boardDto.getWriter() , boardDto.getContent());
        }
    }

}
