package Basic.BitWiseMagic;

/**
 *
 * Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some integer x. Return true if N is power of 2 else return false.
 *
 * Example 1:
 *
 * Input:
 * N = 8
 * Output:
 * YES
 * Explanation:
 * 8 is equal to 2 raised to 3 (23 = 8).
 * Example 2:
 *
 * Input:
 * N = 98
 * Output:
 * NO
 * Explanation:
 * 98 cannot be obtained by any power of 2.
 * Your Task:Your task is to complete the function isPowerofTwo() which takes n as a parameter and returns true or
 * false by checking if the given number can be represented as a power of two or not.
 *
 * Expected Time Complexity:O(log N).
 * Expected Auxiliary Space:O(1).
 *
 * Constraints:
 * 0 ≤ N < LONG_MAX
 *
 * */
public class PowerOfTwo {
    /**
     * Explanation of the code:
     *
     * if n is 0, it's not a power of two, so we return false
     *
     * for n > 0
     * If n is a power of 2, then in binary representation of the number, it will only have one set bit i.e., only one 1
     * So performing AND operation with a number less than it by 1 will result in 0
     *
     * Power of two scenario:
     * Consider n = 8
     * Binary representation of 8 = 1 0 0 0
     * n - 1 = 7
     * Binary representation of 7 = 0 1 1 1
     * Performing AND operation for these two
     *
     * 8 -----  1 0 0 0
     * 7 -----  0 1 1 1
     * & ---------------
     *          0 0 0 0    =  0
     * -----------------
     *
     * Not a power of two scenario:
     * Consider n = 7
     * Binary representation of 7 = 0 1 1 1
     * n-1 = 6
     * Binary representation of 6 = 0 1 1 0
     * Performing AND  operation for these two
     *
     * 7 ----- 0 1 1 1
     * 6 ----- 0 1 1 0
     * & --------------
     *         0 1 1 0     =  6
     * ----------------
     * **/
    public static boolean isPowerOfTwo(long n) {
        // Your code here
        if (n == 0)
            return false;
        return ((n & (n - 1)) == 0);
    }
}
