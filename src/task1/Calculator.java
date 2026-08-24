package task1;

public class Calculator {

    public double add(double[] numbers) {
        double result = 0;

        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    public double substract(double[] numbers) {
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }

        return result;
    }

    public double divide(double[] numbers) {
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            result /= numbers[i];
        }
        return result;

    }

    public double multiply (double[] numbers){
        double result = 1;

        for (double number : numbers){
            result *= number;
        }
        return result;
    }
}