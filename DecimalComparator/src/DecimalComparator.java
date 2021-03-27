public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        double aa = a * 1000;
        double bb = b * 1000;
        double a1 = (int)aa;
        double b1 = (int)bb;
        if(a1 == b1){
            return true;
        }return false;
    }
}
