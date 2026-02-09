package day02;

public class Exam01 {
    public static void main(String[] args) {
        //1. 타입 = 자료형  = 분류 = 자료들을 분류/나누는 방법
        // 자동 타입 변환( 묵시적 : 개발자 따로 할게 없다 ), 자료의 손실 없음
        // byte > short > int > long > float > double (작은상자 > 큰상자)
        byte byteValue = 10;
        short shortValue = byteValue; // byte타입 > short타입으로 변환
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        //2. 연산중 자동 타입 변환
        // byte + byte = int , byte + short = int , int + int = int , int 이하 피연산자들은 연산하면 int로 결과
        // long/float/double 들은 피연산자 중에 더 큰 타입으로 결과
        byte b1 = 10 ; byte b2 = 20; short s1 = 30 ; int i1 = 40; long l1 = 50; float f1 = 3.14f; double d1 = 41.24;
        int result1 = b1+b2;
        int result2 = b1+s1;
        int result3 = i1+i1;
        long result4 = l1+i1; //int + long = long
        float result5 = i1+f1; // int + float = float
        double result6 = d1+i1; // int + double = double

        //3. 강제 타입 변환/캐스팅(명시작 : 개발자가 변환할 타입 작성)
        //double > float > long > int > short > byte , 자료 손실있음
        double dvalue = 3.14;
        float fvalue = (float)dvalue; // (새로운타입)기존값
        long lvalue = (long)fvalue;
        int ivalue = (int)lvalue;
        short svalue = (short)ivalue;
        byte bvalue = (byte)svalue; //aa
    }
}
