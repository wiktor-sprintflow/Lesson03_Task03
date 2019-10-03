public class MathOperationsTest {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        int testNumber = 20011;
        System.out.println("Liczba " + testNumber + " jest patrzysta: " + mathOperations.isEven(testNumber));
        System.out.println("Liczba " + testNumber + " jest niepatrzysta: " + mathOperations.isOdd(testNumber));

        double radius = 12.4;
        System.out.println("Pole koła o promieniu " + radius + " wynosi: " + mathOperations.circleField(radius));

        int powerBase = 2333334;
        System.out.println("Kwadrat liczby " + powerBase + " wynosi: " + mathOperations.power(powerBase));
    }
}