package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double d = 20.00d;
        double dd = 80.00d;
        double ddd = (d+dd) * 100d;
        System.out.println("my ddd =  " + ddd);
        double dmod = ddd % 40.00d;
        System.out.println("the remainder = " + dmod);
        boolean b = dmod == 0d ? true : false;
        System.out.println("boolean variable = " + b);
        if(!b){
            System.out.println("got some remainder");
        }
    }
}
