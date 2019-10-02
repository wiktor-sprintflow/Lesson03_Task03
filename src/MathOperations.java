public class MathOperations {
    final double PI = 3.14159265359;

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    double circleField(double r) {
        return (PI * r * r);
    }

    long power(int number) {
        long result = (long) number * (long) number;
        return (result);
    }
}