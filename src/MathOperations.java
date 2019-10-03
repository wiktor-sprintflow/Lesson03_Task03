public class MathOperations {
    final double PI = 3.14159265359;

    boolean isEven(int number) {
        return (number % 2 == 0);
    }

    boolean isOdd(int number) {
        return !isEven(number);
    }

    double circleField(double r) {
        return (PI * r * r);
    }

    long power(int number) {
        long result = (long) number * (long) number;
        return (result);
    }
}