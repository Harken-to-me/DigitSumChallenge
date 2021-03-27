public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hour){
        if(hour > 23 || hour <0){
            return false;
        } else if((hour < 8 || hour > 22) && barking){
            return true;
        } else return false;
    }
}
