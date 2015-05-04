package maxSum;

import java.util.Arrays;

/**
 * Created by Yagnesh on 5/3/2015.
 */
public class MaxSum {

    public int sumMaxModM(int[] a, int n, int m) {
        int max = 0;
        for (int i = 0 ; i < n ; i++) {
            for (int j = i + 1; j <=n ; j++) {
                int[] sub = Arrays.copyOfRange(a, i, j);
                int temp = sumArrayModM(sub,m);
                if (max < temp ) {
                    max = temp;
                }
            }
        }
        return max;
    }

    private int sumArrayModM(int[] sub, int m) {
        int sum = 0;
        for (int i = 0 ; i < sub.length ; i++) {
            sum += sub[i];
        }
        return sum % m;
    }
}

