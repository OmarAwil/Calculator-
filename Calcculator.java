import java.util.Scanner;

 class Calculator {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter an operator (+ , % , / , * ) ");
        char operator = scanner.next().charAt(0);

        int result;

        switch (operator)
        {
            case '+':
                result = num1 + num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num2 * num2;
                break;
            default :
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("The result is " + result);

    }
}
