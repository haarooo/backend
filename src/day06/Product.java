package day06;

public class Product {
    String name;
    int stock;

    boolean sell(int count){
        if(count > stock){
            System.out.println("재고부족");
            return false;
        }else if(count<=stock){
            stock -= count;
            return true;
        }else{return true;}
    }
}
