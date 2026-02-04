package day10;

public interface Keyboard {
    // 상수
    public static final String 제조사 = "인텔";
    String 제조일 = "2025-03-04";

    //추상메소드
    public abstract void aKey();
    int bKey(int x , int y);
}// class end
