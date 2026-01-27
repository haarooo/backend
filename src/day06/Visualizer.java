package day06;

public class Visualizer {

    String getStars(int x){
        String result = "";
        for(int i = 0 ; i < x ; i++){
            result += "★";
        }
        return result;
    }

}
