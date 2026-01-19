package day01;

import java.util.Scanner;

public class Exam04 {

    public static void main(String[] args) {
        //1. 입력객체
        //Scanner 클래스 : 입력받은 자료들을 특정한 타입으로 변환
        //new: 객체를 생성할때 사용되는 키워드
        //new Scanner :  Scanner 객체 만들겠다
        //(System.in) : 시스템 입력 객체를 Scanner 객체엑 전달
        // 시스템 입력 객체를 Scanner 객체에 대입하여 Scanner 객체 생성
        // Scanner 변수명 = new Scanner(System.in);
        Scanner 입력변수 = new Scanner(System.in);

        //입력함수
        //1. .next();     : 입력받은 자료들을 문자열(String)으로 반환, 띄어쓰기 불가능
        System.out.print("1.next() : "); // 입력전 가이드
        String str1 = 입력변수.next(); // 콘솔에서 키보드로 입력받고 enter 입력시 입력종료
        System.out.println(str1);

        //2. .nextLine() : 입력받은 자료를 문자열(String)로 반환 , 띄어쓰기 포함
        // nextLine()사용할때 앞전에 next()가 존재하면 임의의 nextLine()하나 더 작성
        입력변수.nextLine();
        System.out.print("2.nextLine() : ");
        String str2 = 입력변수.nextLine();
        System.out.println( str2 );

        //3. nextByte()
        System.out.print("3.nextByte() : ");
        byte b1 = 입력변수.nextByte();
        System.out.println( b1 );

        //4. .nextShort
        System.out.print("4.nextShort() : ");
        short s1 = 입력변수.nextShort();
        System.out.println(s1);

        //5. .nextInt()
        System.out.print("5.nextInt() : ");
        int i1 = 입력변수.nextInt();
        System.out.println(i1);


        //6. .nextLong();
        System.out.print("6.nextLong() : ");
        long l1 = 입력변수.nextLong();
        System.out.println(l1);

        //7. .nextfloat() , .nextDouble()
        System.out.print("7.nextFloat() : ");
        float f1 = 입력변수.nextFloat();
        System.out.println(f1);

        System.out.print("7.nextDouble() : ");
        double d1 = 입력변수.nextDouble();
        System.out.println(d1);

        //8. .nextBoolean
        System.out.println("9.nextBoolean() : ");
        boolean b2 = 입력변수.nextBoolean();
        System.out.println(b2);

        //9. next().charAT(0) , 입력받은 자료에서 첫번째 글자 반환, char문자 스캔 없음
        System.out.println("10.next().charAt(0) : ");
        char c1 = 입력변수.next().charAt(0);
        System.out.println(c1);

    }
}
