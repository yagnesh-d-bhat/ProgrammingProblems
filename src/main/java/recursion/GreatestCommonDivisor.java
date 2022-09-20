package recursion;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();

        System.out.println(gcd.calculateGCD(48,12));
    }

    private int calculateGCD(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            return -1;
        }
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 == 0) {
            return num1;
        }
        return calculateGCD(num2, num1 % num2);
    }
}
