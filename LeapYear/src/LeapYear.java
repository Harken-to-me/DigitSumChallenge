public class LeapYear {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999){
            return false;
        }
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            }

            // if the year is not century
            else
                return true;
        }

        else
            return false;
    }
}
