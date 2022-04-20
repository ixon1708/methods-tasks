public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number1 = calculator.getInt();
        char operation = calculator.getOperation();
        int number2 = calculator.getInt();
        double calculation = calculator.calc(number1, number2, operation);
        System.out.printf("%d %c %d = %.2f", number1, operation, number2, calculation);
    }

    //task1
    public static double maxOfTwo(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    //task2
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //task3
    public static double squareThenPlusFour(double number) {
        return number * number + 4;
    }

    //task4
    public static boolean greaterThen69(double number) {
        return number > 69;
    }

    //task5
    public static int calcPower(int base, int power) {
        int multiplication = 1;
        for (int i = 0; i < power; i++) {
            multiplication *= base;
        }
        return base;
    }

    //task6
    /*  * - тут точка (x1,y1)
        **
        * *  c
      a *  *
        *   *
        ****** а тут точка (x2,y2)
          b
        a и b - катеты, с - гипотенуза, которая образована точками (x1,y1) и (x2,y2)
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        int a = y1 - y2; // результат может быть с минусом, но это не важно, ведь дальше будет возведенеие в квадрат
        int b = x1 - x2;
        return Math.sqrt(a * a + b * b);
    }

}
