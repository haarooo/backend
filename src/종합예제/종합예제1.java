package 종합예제;

import java.util.Scanner;

public class 종합예제1 {
    public static void main(String[] args) {
        String content1 = null;
        String writer1  = null; //초기값을 null(자료가 비어있음)
        String content2 = null;
        String writer2  = null;
        String content3 = null;
        String writer3  = null;

        for(;;){
            Scanner scan = new Scanner(System.in);
            System.out.println("============= My Community =============");
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("======================================");
            System.out.print("선택>");
            int num = scan.nextInt();
            if(num == 1) {
                scan.nextLine();
                System.out.print("내용 : ");
                String 내용 = scan.nextLine();
                System.out.print("작성자 : ");
                String 작성자 = scan.nextLine();

                if(content1 == null && writer1 ==null){
                    content1 = 내용 ; writer1 = 작성자 ;
                    System.out.println("[안내] 글쓰기 성공");}
                else if(content2 == null && writer2 == null){
                    content2 = 내용 ; writer2 = 작성자;
                    System.out.println("[안내] 글쓰기 성공");}
                else if(content3 == null && writer3 == null){
                    content3 = 내용 ; writer3 = 작성자;
                    System.out.println("[안내] 글쓰기 성공");}
                else{
                    System.out.println("게시물을 등록할 공간이 부족합니다.");}
            }
            else if(num == 2){
                if(content1 != null && writer1 != null){
                    System.out.printf("작성자 : %s , 내용 : %s \n" , content1 , writer1);
                }
                if(content2 != null && writer2 != null) {
                    System.out.printf("작성자 : %s , 내용 : %s \n", content2, writer2);
                }
                if(content3 != null && writer3 != null) {
                    System.out.printf("작성자 : %s , 내용 : %s \n", content3, writer3);
                }

            }
        } //for end
    } //main end
} //class end

