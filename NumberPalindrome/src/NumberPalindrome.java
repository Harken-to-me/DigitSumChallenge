public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int lastNumber = 0;
        int reverse = 0;
        int newNum = number;
        if(number == 0)
            return true;

        while(newNum > 0){
            lastNumber = newNum % 10;
            System.out.println(" lastNumber =" + lastNumber);
            reverse = reverse + (lastNumber);
            System.out.println("reverse = " + reverse);
            newNum /= 10;
            System.out.println("newNum =" + newNum);
        }
        if(number == reverse){
            return true;
        }
            return false;
    }
}
