package recursion;

/**
 * How to find the sum of digits of a positive number using recursion?
 * eg, if number is 123, sum is 1+2+3 = 6
 */
public class SumOfDigitsOfPositiveNumber {
    public static void main(String[] args) {
        SumOfDigitsOfPositiveNumber sum = new SumOfDigitsOfPositiveNumber();
        System.out.println(sum.sumOfDigits(1234));
    }
    int sumOfDigits(int number) {
        if ( number <= 0 ) {
            return 0;
        }
        return number % 10 + sumOfDigits(number / 10);
    }
}
