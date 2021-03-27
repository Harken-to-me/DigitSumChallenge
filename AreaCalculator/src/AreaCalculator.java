public class AreaCalculator {
    public static double area(double radius){
        if(radius <0d)
            return -1.0;

        //double powerOf = Math.pow(radius, radius);
        //double result = (double)powerOf * (double)Math.PI;
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0)
            return -1.0;

        return (x * y);
    }
}
