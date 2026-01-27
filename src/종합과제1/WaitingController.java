package 종합과제1;

public class WaitingController {
    Waiting[] waitings = new Waiting[100];
    boolean addWaiting(String phone , int count){
        Waiting waiting = new Waiting();
        waiting.phone = phone;
        waiting.count = count;
        for(int index = 0 ; index <= waitings.length -1 ; index++){
            if(waitings[index] == null){
                waitings[index] = waiting;
                return true;
            }
        }return false;
    }Waiting[] getWaitingList(){
        return waitings;
    }
}//class end
