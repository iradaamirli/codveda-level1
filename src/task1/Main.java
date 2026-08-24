package task1;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        try {
            System.out.println("How many numbers do you want to calculate? ");
            int count = sc.nextInt();

            if (count < 2){
                System.out.println("Please enter at least 2 numbers. ");
                return;
            }
            double[] numbers = new double[count];

            for (int i = 0; i < count; i++){
                System.out.println("Enter number " + (i+1) + ":");
                numbers[i] = sc.nextDouble();
            }
            System.out.println("Choose operation (+,-,*,/): ");
            char operation = sc.next().charAt(0);

            double result;
            switch (operation){
                case '+' -> result = calculator.add(numbers);
                case '-' -> result = calculator.substract(numbers);
                case '*' -> result = calculator.multiply(numbers);
                case '/' -> result = calculator.divide(numbers);

                default -> {
                    System.out.println("Invalid operation. ");
                    return;
                }
            }
            System.out.println("Result: " + result);
        } catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter valid numbers. ");
        } catch (ArithmeticException e){
            System.out.println("Error: " +e.getMessage());
        } finally {
            sc.close();
        }


        }
    }
