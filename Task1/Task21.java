
import java.util.Scanner;

public class Task21 {

    public static int calc(int numOfAction, int num1, int num2) {
        switch (numOfAction) {
            case 1:
                num1 += num2;
                return num1;
            case 2:
                num1 -= num2;
                return num1;
            case 3:
                num1 *= num2;
                return num1;
            case 4:
                num1 /= num2;
                return num1;
            default:
                return num1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfAction;
        int num1 = 0;
        int num2 = 0;
        do {
            System.out.println("Введите номер действия\n1 " +
                    "- Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление\n5 - Выход\n...");
            numOfAction = in.nextInt();
            if (numOfAction == 5) {
                break;
            }
            if (num1 == 0 && num2 == 0) {
                System.out.println("Введите 2 числа:");
                num1 = in.nextInt();
                num2 = in.nextInt();
            } else {
                System.out.println("Введите 2-ое число:");
                num2 = in.nextInt();
            }

            num1 = calc(numOfAction, num1, num2);
            System.out.println("Результат - " + num1);
        }
        while (numOfAction != 5);
        in.close();
    }
}
