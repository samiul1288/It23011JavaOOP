package samiuljava;

public class mathassigment
{ public static void main(String[] args) {
            double a=5.0, b=3.0;
            double angle=90;
            double p= Math.pow(a, b);
            System.out.println("Power (a^b): "+p);
            double sqrt = Math.sqrt(a);
            System.out.println("Square Root of a: " + sqrt);
            double absValue = Math.abs(-a);
            System.out.println("Absolute Value: " + absValue);
            double radians = Math.toRadians(angle);
            double sine = Math.sin(radians);
            System.out.println("Sine of angle: " + sine);
            double logValue = Math.log(a); // Natural logarithm of a
            System.out.println("Natural Logarithm of a: " + logValue);
        }
}
