package Basic.BitWiseMagic;
/**
 * Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers. If both M and N are the same then return -1 in this case.
 *
 * Example 1:
 *
 * Input:
 * M = 11, N = 9
 * Output:
 * 2
 * Explanation:
 * Binary representation of the given numbers are: 1011 and 1001, 2nd bit from right is different.
 * Example 2:
 *
 * Input:
 * M = 52, N = 4
 * Output:
 * 5
 * Explanation:
 * Binary representation of the given numbers are: 110100 and 0100, 5th-bit from right is different.
 * User Task:
 * The task is to complete the function posOfRightMostDiffBit() which takes two arguments M and N and returns the position of first different bits in M and N from right. If both m and n are the same then return -1 in this case.
 *
 * Expected Time Complexity: O(max(log M, log N)).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 0 <= M, N <= 10^9
 **/
public class RightMostDifferentBit {
    /**
     * Explanation of the code:
     * When we perform an AND operation between a number and 1, the result will either be 1 or 0 based on the bit at the position 1
     * Example, consider the number 4
     *  4 ---- 0 1 0 0
     *  1 ---- 0 0 0 1
     *  & ------------
     *         0 0 0 0
     *  --------------
     *  4 & 1 = 0
     *
     * consider 5
     *
     * 5 ---- 0 1 0 1
     * 1 ---- 0 0 0 1
     * &--------------
     *        0 0 0 1
     * ---------------
     *
     * Now to compare the bits of two numbers for a position, we are performing an and operation on both the numbers with
     * 1, then if the value is the same for both, then we right shift the numbers by one position and continue the AND operation
     * logic till the values are different
     *
     * Let's consider the values m = 11, and n = 9
     * m in binary representation m = 1011
     * n in binary representation n = 1001
     *
     * First iteration:
     *      Now perform AND operation with 1 on both numbers
     *      m & 1
     *      11 ---- 1 0 1 1
     *       1 ---- 0 0 0 1
     *       &--------------
     *              0 0 0 1
     *       ---------------
     *       11 & 1 = 1
     *
     *       now with n
     *
     *       9 ---- 1 0 0 1
     *       1 ---- 0 0 0 1
     *       &---------------
     *              0 0 0 1
     *       ----------------
     *       9 & 1 = 1
     *
     *       so for the while condition m&1 == n&1, (11 & 1) == (9 & 1) => 1 == 1 ==> YES
     *       as the while condition passes, we right shift m and n by 1
     *       m = 1011 >> 1 = 101 = 5
     *       n = 1001 >> 1 = 100 = 4
     *       position = 0 + 1 = 1
     * Second iteration:
     *      Now perform AND operation with 1 on both numbers
     *      m & 1
     *      5 ---- 1 0 1
     *      1 ---- 0 0 1
     *      &--------------
     *             0 0 1
     *      ---------------
     *      5 & 1 = 1
     *
     *      now with n
     *
     *      4 ---- 1 0 0
     *      1 ---- 0 0 1
     *      &---------------
     *             0 0 0
     *       ---------------
     *      4 & 1 = 0
     *      *
     *      *       so for the while condition m&1 == n&1, (5 & 1) == (4 & 1) => 1 == 0 ==> NO
     *      As the while condition fails here, we break the loop
     *      position + 1 will be returned to consider the current position which will be 1 + 1 = 2
     **/
    public static int posOfRightMostDiffBit(int m, int n) {
        // Your code here
        if (m == n) {
            return -1;
        }
        int position = 0;
        while ((m & 1) == (n & 1)) {
            position++;
            m = m >> 1;
            n = n >> 1;
        }
        return ++position;
    }
}
