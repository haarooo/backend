package 종합예제4test;

import 종합예제4test.BoardController;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        BoardController bc= new BoardController();
        for(;;){
            Scanner scan = new Scanner(System.in);
            System.out.println("==========MyCommunity===========");
            System.out.println("1.게시물쓰기|2.게시물출력");
            System.out.println("================================");
            System.out.print("선택 > "); int num = scan.nextInt();
            if(num ==1){
                scan.nextLine();
                System.out.print("내용 : "); String content = scan.nextLine();
                System.out.print("작성자 : "); String writer = scan.nextLine();

                boolean result = bc.doPost(content , writer);
                if(result == true){
                    System.out.println("저장 성공");
                }else{
                    System.out.println("저장 실패");
                }
            }else if(num ==2){
                Board[] boards = bc.doGet();
                for(int index = 0 ; index<= boards.length-1 ; index++){
                    if(boards[index] != null){
                        System.out.println("내용" + boards[index].content);
                        System.out.println("작성자" + boards[index].writer);
                    }
                }
            }
        }
    }//main end
}//class end
