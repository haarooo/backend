package 종합예제;

import java.util.Scanner;

public class 종합예제5 {
    public static void main(String[] args) {

    }// m end
}// c end

class Board1{
    private String content;
    private String writer;

    public Board1(){

    }

    public Board1(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Board1{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}//Board c end

class BoardController1{
    private static final Board1[] boards =new Board1[100];

    public static boolean doPost(String content , String writer){
        Board1 board = new Board1(content , writer);
        for(int index = 0 ; index <= boards.length-1  ; index++){
            if(boards[index] == null){
                boards[index] = board;
                return  true;
            }
        }return false;
    }

    public static Board1[] doGet(){
        return boards ;
    }
}//c end

class BoardService1{
    public static void main(String[] args) {

        for(;;) {
            Scanner scan = new Scanner(System.in);
            System.out.println("============= My Community =============");
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("======================================");
            System.out.print("선택>") ; int num = scan.nextInt();
            if(num == 1) {
                scan.nextLine();
                System.out.print("내용 : ");
                String content = scan.nextLine();
                System.out.print("작성자 : ");
                String writer = scan.nextLine();

                boolean reuslt1 =BoardController1.doPost(content , writer);
                if(reuslt1 == true){
                    System.out.println("글쓰기 성공");
                }else{
                    System.out.println("글쓰기 실패");
                }
            }else if(num == 2){
               Board1[] result2 = BoardController1.doGet();
               for(int index = 0 ; index <= result2.length-1 ; index++){
                   if(result2[index] != null){
                       System.out.println("내용 : " + result2[index].getContent());
                       System.out.println("작성자 : " + result2[index].getWriter());
                   }
               }
            }
        }
    }
}