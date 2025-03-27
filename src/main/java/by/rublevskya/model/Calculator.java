package by.rublevskya.model;

public class Calculator {

    public double add (double num1, double num2) {
        return num1 + num2;
    }

    public double subtract (double num1, double num2) {
        return num1 - num2;
    }

    public double multiply (double num1, double num2) {
        return num1 * num2;
    }

    public double divide (double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }

    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Сложение: " + calculator.add(25, 5));
        System.out.println("Вычитание: " + calculator.subtract(25,11));
        System.out.println("Умножение: " + calculator.multiply(25, 11));
        System.out.println("Деление: " + calculator.divide(25, 5));
    }
}
