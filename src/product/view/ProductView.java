package product.view;

import product.controller.ProductController;
import product.controller.UserController;
import product.model.dto.UserDto;
import 종합과제2.controller.WaitingController;
import 종합과제2.view.WaitingView;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
        //회원가입 화면
        Scanner scan = new Scanner(System.in);
        private ProductView(){}
        private static final ProductView instance = new ProductView();
        public static ProductView getInstance(){
            return instance;
        }
        private ProductController pc= ProductController.getInstance();
        private UserController uc= UserController.getInstance();


    //메인페이지
    public void indexView(){
        for(;;){
            Scanner scan = new Scanner(System.in);
            System.out.println("=========== 회원제 중고거래 시스템 ===========");
            System.out.println("1.회원가입 | 2.로그인");
            System.out.println("===================================");
            System.out.print("선택>") ; int num = scan.nextInt();
            if(num ==1){signView(); //회원가입
            } else if(num ==2){loginView();} //로그인
        }
    }


    //회원가입
    public void signView(){
        scan.nextLine();
        System.out.print("아이디 : "); String id = scan.nextLine();
        System.out.print("비밀번호 : "); int pwd = scan.nextInt();
        System.out.print("닉네임 : "); String nickname = scan.next();
        System.out.print("연락처 : "); String phone = scan.next();
        boolean saveResult = uc.userAdd(id , pwd , nickname , phone);
        //2. 받은 결과에 따른 화면 출력
        if(saveResult){
            System.out.println("[안내] 회원가입이 완료되었습니다.");
        }else{System.out.println("[경고] 회원가입 실패");}
    }

    //로그인
    public void loginView(){
        System.out.println("---로그인---");
        System.out.print("아이디 : "); String id = scan.next();
        System.out.print("비밀번호 : "); int pwd = scan.nextInt();
        String loginResult = uc.login(id ,pwd);
        System.out.println("[안내]"+loginResult+"님, 환영합니다.");
    }

}
