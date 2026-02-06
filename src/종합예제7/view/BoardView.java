package 종합예제7.view;

import 종합예제7.controller.BoardController;
import 종합예제7.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    private BoardView(){};
    private static final BoardView instance = new BoardView();
    public static BoardView getInstance(){return instance;}

    private BoardController bc = BoardController.getInstance();



    private Scanner scan = new Scanner(System.in);
    public void index(){
        for(;;){
            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("============ My Community =============");
                System.out.println("1.게시물작성 | 2.게시물출력 | 3.게시물수정 | 4.게시물삭제");
                System.out.println("======================================");
                System.out.print("선택>") ; int ch = scan.nextInt();
                if(ch ==1){write();
                } else if(ch ==2){findALL();
                } else if(ch ==3){update();
                } else if(ch==4){delete();
                }else{System.out.println("없는 기능번호입니다");}

            }catch (InputMismatchException e){System.out.println("잘못된 입력 방식");
                scan = new Scanner(System.in);
            }catch (Exception e){System.out.println("시스템오류");}

        }//for end
    }// index end

    //1 게시물 등록
    public void write(){
        scan.nextLine();
        System.out.print("내용 : "); String bcontent = scan.nextLine();
        System.out.print("작성자 : ");String bwriter = scan.nextLine();
        boolean result = bc.write(bcontent , bwriter);
        if(result){
            System.out.println("게시물 등록 성공");
        }else{System.out.println("게시물 등록 실패");}
    }

    //4 게시물 삭제
    public void delete(){
        System.out.print("삭제할 게시물번호 : "); int bno = scan.nextInt();
        boolean result = bc.delete(bno);
        if(result){System.out.println("게시물 삭제 성공");
        }else{System.out.println("게시물 삭제 실패 또는 없는 게시물 번호");}
    }

    //3 게시물 수정
    public void update(){
        System.out.print("수정할 게시물번호 : "); int bno = scan.nextInt();
        scan.nextLine();
        System.out.print("수정할 내용 : "); String bcontent = scan.nextLine();
        boolean result = bc.update(bno , bcontent);
        if(result){System.out.println("게시물 수정 성공");
        }else{System.out.println("게시물 수정 실패");}
    }
    //게시물 조회
    public void findALL(){
        ArrayList<BoardDto> boards = bc.findALL();
        for(BoardDto board : boards){
            System.out.printf("번호 : %d , 작성일 : %s , 작성자 : %s , 내용 %s \n",
            board.getBno() , board.getBdate() , board.getBwriter() , board.getBcontent());
        }
    }

}// class end
