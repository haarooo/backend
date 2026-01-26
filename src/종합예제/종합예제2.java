package 종합예제;

import java.util.Scanner;

public class 종합예제2 {
    public static void main(String[] args) {
        String[]contents = new String[100];
        String[]writers = new String[100];
        for(;;){
            Scanner scan = new Scanner(System.in);
            System.out.println("============= My Community =============");
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("======================================");
            System.out.print("선택>"); int num = scan.nextInt();
            if(num == 1) {
                scan.nextLine();
                System.out.print("내용 : "); String content = scan.nextLine();
                System.out.print("작성자 : "); String writer = scan.nextLine();
                boolean save =false; //저장했다 true 저장못했다 false
                for (int index = 0; index <= contents.length - 1; index++) {
                    if (contents[index] == null && writers[index] == null) {
                        contents[index] = content; writers[index] = writer;
                        save = true ; break;
                    }



                }//for end
                if(save == true){
                    System.out.println("글쓰기 성공");}
                else{
                    System.out.println("공간이 부족합니다");}

            }else if(num == 2) {
                for (int index = 0; index <= contents.length-1; index++) {
                    if (contents[index] != null && writers[index] != null) {
                        System.out.printf("작성자 : %s , 내용 : %s\n", contents[index], writers[index]);
                    }
                }
            }
        }//for end
    }//main
}//class
