public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0L){
            System.out.println("Invalid Value");
        }else {


            long hours = minutes / 60L;
            long days = hours / 24L;
            long remainderDays = days % 365L;
            long years = days / 365L;
            System.out.println(minutes + " min = " + years + " y and " + remainderDays + " d");
        }
    }
}
