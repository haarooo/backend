package 도서관리.view;

import day07.Book;
import 도서관리.controller.BookController;
import 도서관리.controller.UserController;

import java.util.Scanner;

public class BookView {
    Scanner scan = new Scanner(System.in);
    //싱글톤
    private BookView() {
    }

    ;
    private static final BookView instance = new BookView();

    public static BookView getInstance() {
        return instance;
    }

    private BookController bc = BookController.getInstance();
    private UserController uc = UserController.getInstance();

    //메인페이지
    public void indexView() {
        for (; ; ) {
            Scanner scan = new Scanner(System.in);
            System.out.println("=========== 도서관리 시스템 ===========");
            System.out.println("1.회원가입 |2.로그인 | 3.관리자 로그인");
            System.out.println("===================================");
            System.out.print("선택>");
            int num = scan.nextInt();
            if (num == 1) {signView();//회원가입
            } else if (num == 2) { loginView();
            } else if (num == 3) { adminloginView();//관리자 로그인
            }
        }
    }

    // 일반 회원가입
    public void signView(){
        System.out.print("아이디 : "); String id = scan.next();
        System.out.print("비밀번호 : "); int pwd = scan.nextInt();
        System.out.print("연락처 : "); String phone = scan.next();
        boolean saveResult = uc.userAdd(id , pwd , phone);
        //2. 받은 결과에 따른 화면 출력
        if(saveResult==true){
            System.out.println("[안내] 회원가입이 완료되었습니다.");

        }else{System.out.println("[경고] 회원가입 실패");}
    }

    //일반 로그인
    public void loginView(){
        System.out.println("---로그인---");
        System.out.print("아이디 : "); String id = scan.next();
        System.out.print("비밀번호 : "); int pwd = scan.nextInt();
        boolean loginResult = uc.login(id ,pwd);
        if(loginResult){
            System.out.println("로그인 성공");
            index();
        }else{
            System.out.println("로그인 실패");
        }
    }

    //관리자 로그인
    public void adminloginView(){
        System.out.println("---로그인---");
        System.out.print("관리자 키 : "); int adminKey = scan.nextInt();
        boolean loginResult = uc.adminLogin(adminKey);
        if(loginResult == true){
            System.out.println("로그인 성공");

        }else{
            System.out.println("로그인 실패");
        }
    }

    //일반 로그인 후 화면
    public void index(){
        for(;;){
            System.out.println("=========== 도서관리 시스템 ===========");
            System.out.println("1. 도서대출 2.도서반납 3. 전체 도서 조회 , 4.내 대출 도서 조회 , 5,로그아웃");
            System.out.println("=========== 도서관리 시스템 ===========");
            System.out.print("선택 > ");int num = scan .nextInt();
            if(num == 1){borrow();}
            else if(num ==2){bookReturn();}
            else if(num ==3){};
        }
    }

    //도서 대출
    public void borrow(){
        System.out.print("도서명 : "); String name = scan.next();
        boolean result = bc.borrow(name);
        if(result == true){
            System.out.println("도서 대출 성공");
        }else{
            System.out.println("도서 대출 실패");
        }
    }

    //도서 반납
    public void bookReturn(){
        System.out.print("도서명"); String name = scan.next();
        boolean result = bc.bookReturn(name);
        if(result == true){
            System.out.println("도서 반납 성공");
        }else {
            System.out.println("도서 반납 실패");
        }
    }











}//c end
