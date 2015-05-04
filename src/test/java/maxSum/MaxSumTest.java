package maxSum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Yagnesh on 5/3/2015.
 */
public class MaxSumTest {

    private MaxSum ms;

    @Before
    public void setUp() throws Exception {
        ms = new MaxSum();
    }

    @Test
    public void testSumMaxModM1() throws Exception {
        int[] a = new int[] {3, 3, 9, 9, 5};
        int n = 5;
        int m = 7;
        assertEquals("Max must be 6",6, ms.sumMaxModM(a,n,m) );
    }

    @Test
    public void testSumMaxModM2() throws Exception {
        int[] a = new int[] {3, 3};
        int n = 2;
        int m = 7;
        assertEquals("Max must be 6",6, ms.sumMaxModM(a,n,m) );
    }

    @Test
    public void testSumMaxModM3() throws Exception {
        int[] a = new int[] {3, 1};
        int n = 2;
        int m = 7;
        assertEquals("Max must be 4",4, ms.sumMaxModM(a,n,m) );
    }

    @Test
    public void testSumMaxModM4() throws Exception {
        int[] a = new int[] {3,1};
        int n = 2;
        int m = 1;
        assertEquals("Max must be 0",0, ms.sumMaxModM(a,n,m) );
    }


}