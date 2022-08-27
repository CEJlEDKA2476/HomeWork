package leetCode;

public class Task258 {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    public static int addDigits(int num) {
        if (num <= 0) {
            return 0;
        }
        int part1 = num / 10;
        int part2 = num % 10;
        int result = part1 + part2;
        if (result / 10 != 0) {
            return addDigits(result);
        } else {
            return result;
        }
    }
}
