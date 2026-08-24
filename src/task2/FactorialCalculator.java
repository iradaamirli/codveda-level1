package task2;

public class FactorialCalculator {
    public long factirial(int number){
        if (number < 0){
            throw new IllegalArgumentException("Factorial is not defineed for negative numbers. ");

        }
        if (number == 0 || number == 1){
            return 1;
        }
        return number * factirial(number - 1);
    }
}
