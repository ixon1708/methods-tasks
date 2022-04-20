import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);

    public int getInt() {
        return scanner.nextInt();
    }

    public char getOperation() {
        return scanner.next().charAt(0);
    }

    public double calc(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / (double) num2;
        }
        return 0;
    }

}
