package 종합과제2.view;

import 종합과제1.Waiting;
import 종합과제2.controller.WaitingController;
import 종합과제2.model.dto.WaitingDto;
import 종합예제.종합예제6.Model.dto.BoardDto;
import 종합예제.종합예제6.controller.BoardController;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    Scanner scan = new Scanner(System.in);
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }
    private WaitingController wc= WaitingController.getInstance();

    //메인페이지
    public void indexView(){
        for(;;){
            Scanner scan = new Scanner(System.in);
            System.out.println("============= 맛집 대기 시스템 =============");
            System.out.println("1.대기등록 | 2.대기현황");
            System.out.println("======================================");
            System.out.print("선택>") ; int num = scan.nextInt();
            if(num ==1){writeView();
            } else if(num ==2){printView();}
        }
    }

    //대기 등록 화면
    public void writeView(){
        scan.nextLine();
        System.out.print("전화번호 : "); String phoneNumber = scan.nextLine();
        System.out.print("인원수 : "); int peopleNumber = scan.nextInt();
        boolean saveResult = wc.doWaiting(phoneNumber, peopleNumber);
        //2. 받은 결과에 따른 화면 출력
        if(saveResult){
            System.out.println("대기 등록 완료");
        }else{System.out.println("대기 등록 실패");}
    }

    //대기 현황 조회 화면
    public void printView(){
        ArrayList<WaitingDto> waitingList = wc.doGet();
        for(WaitingDto waitingDto : waitingList){
            System.out.println("===========대기 현황 =============");
            System.out.printf("번호 %d | 연락처 %s | 인원 %d \n" , waitingDto.getNo() , waitingDto.getPhoneNumber() , waitingDto.getPeopleNumber() );
            System.out.println("---------------------------------");
        }
    }









}//c end
