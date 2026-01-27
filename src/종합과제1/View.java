package 종합과제1;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        WaitingController ct = new WaitingController();
        for(;;){
            Scanner scan = new Scanner(System.in);
            System.out.println("==========맛집 대기 시스템===========");
            System.out.println("1.대기등록 | 2.대기현황");
            System.out.println("==================================");
            System.out.print("선택 >"); int num = scan.nextInt();
            if(num == 1){
                scan.nextLine();
                System.out.print("전화번호 : "); String phone = scan.nextLine();
                System.out.print("인원수 : "); int count = scan.nextInt();
                boolean result = ct.addWaiting(phone , count);
                if(result == true){
                    System.out.println("대기 등록이 완료되었습니다.");
                }else{
                    System.out.println("[경고] 더 이상 대기등록을 할 수 없습니다");
                }
            }else if(num == 2){
                Waiting[] waitings = ct.getWaitingList();
                for(int index = 0 ; index <= waitings.length-1 ; index++){
                    if(waitings[index] != null){
                        System.out.println("전화번호 : "+ waitings[index].phone);
                        System.out.println("인원수 : "+ waitings[index].count);
                    }
                }
            }
        }
    }
}
