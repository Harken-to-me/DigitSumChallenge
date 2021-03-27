public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds){
        if (minutes <0 || (seconds < 0 || seconds >59 )){
            return "Invalid value";
        }
//        int remainingSeconds = seconds % 60;
//        int minutesFromSeconds = (seconds - remainingSeconds) / 60;
        int remainingMinutes = minutes % 60;
        int hoursFromMinutes = (minutes - remainingMinutes) / 60;

        return ""
    }
}
