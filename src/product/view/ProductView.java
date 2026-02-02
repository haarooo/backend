package product.view;

import product.controller.ProductController;
import product.controller.UserController;
import product.model.dto.ProductDto;
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
        System.out.print("아이디 : "); String id = scan.next();
        System.out.print("비밀번호 : "); int pwd = scan.nextInt();
        System.out.print("닉네임 : "); String nickname = scan.next();
        System.out.print("연락처 : "); String phone = scan.next();
        boolean saveResult = uc.userAdd(id , pwd , nickname , phone);
        //2. 받은 결과에 따른 화면 출력
        if(saveResult==true){
            System.out.println("[안내] 회원가입이 완료되었습니다.");

        }else{System.out.println("[경고] 회원가입 실패");}
    }

    //로그인
    public void loginView(){
        System.out.println("---로그인---");
        System.out.print("아이디 : "); String id = scan.next();
        System.out.print("비밀번호 : "); int pwd = scan.nextInt();
        String loginResult = uc.login(id ,pwd);
        if(loginResult != null){
            System.out.printf("%s님 환영합니다 \n" , loginResult);
            index();
        }else{
            System.out.println("로그인 실패");
        }
    }
    //로그인 이후 선택뷰
    public void index(){
        for(;;){
            System.out.println("1. 제품등록 2.제품전체조회 3. 로그아웃");
            System.out.print("선택 > ");int num = scan .nextInt();
            if(num == 1){pAdd();}
            else if(num ==2){findAll();}
            else if(num ==3){uc.logout(); break;}
        }
    }

    //제품 등록페이지
    public void pAdd(){
        System.out.print("제품명 : "); String product = scan.next();
        System.out.print("제품가격 :"); int price = scan.nextInt();
        System.out.print("제품설명 : "); String content = scan.next();
        boolean result = pc.pAdd(product , price , content);
        if(result == true){
            System.out.println("제품 등록 성공");
        }else{
            System.out.println("제품 등록 실패");
        }
    }

    public void findAll(){
        ArrayList<ProductDto> productDtos = pc.findALl();
        for(int index = 0 ; index <= productDtos.size() -1 ; index++){
            ProductDto productDto = productDtos.get(index);
            System.out.printf("제품번호 : %d | %s | %d | %s | 판매자 : % \n", productDto.getProductNo() , productDto.getProduct() , productDto.getPrice() , productDto.getContent() , productDto.getPname()
        );

        }
    }



}
