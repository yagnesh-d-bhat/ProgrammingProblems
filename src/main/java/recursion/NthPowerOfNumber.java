package recursion;

/**
 * Calculate nth power of a number
 * For eg 4th power of 2 is 2 ^ 4 = 2 * 2 * 2 * 2 = 16
 *
 */
public class NthPowerOfNumber {
    public static void main(String[] args) {
        System.out.println(new NthPowerOfNumber().power(2,2));
    }

    public int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }
        return base * power(base, exp-1);
    }


}
