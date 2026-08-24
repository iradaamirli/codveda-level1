package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FactorialCalculator factorialCalculator = new FactorialCalculator();

        try {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();

            long result = factorialCalculator.factirial(number);

            System.out.println("Factorial of " + number + " = " + result);

        }
        catch (InputMismatchException e){
            System.out.println("Please enter a valid integer. ");
        }
        catch (IllegalArgumentException e ){
            System.out.println(e.getMessage());
        }
        finally {
            sc.close();
        }
    }
}