package Basic.BitWiseMagic;
/**
 * Given a number N. The task is to check whether it is sparse or not. A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.
 *
 * Example 1:
 *
 * Input: N = 2
 * Output: 1
 * Explanation: Binary Representation of 2 is 10,
 * which is not having consecutive set bits.
 * So, it is sparse number.
 * Example 2:
 *
 * Input: N = 3
 * Output: 0
 * Explanation: Binary Representation of 3 is 11,
 * which is having consecutive set bits in it.
 * So, it is not a sparse number.
 *
 * Your Task: The task is to complete the function checkSparse() that takes n as a parameter and returns 1 if the number is sparse else returns 0.
 *
 *
 * Expected Time Complexity: O(1).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 1 <= N <= 10^6
 *
 * **/

public class IsSparse {
    /**
     *
     *Explanation of the code:
     *If any two or more consecutive bits are set, then when you right shift the number by one and perform an AND
     * operation, at least one set-bit of the two numbers will be at the same positions.
     *
     * Consider a number 12
     * Its binary representation is : 1 1 0 0
     * n >> 1 will be: 0 1 1 0 = 6
     * Now AND operation on both the numbers:
     * n        -------- 1 1 0 0
     * n >> 1   -------- 0 1 1 0
     * &-------------------------
     *                   0 1 0 0    = 4
     * --------------------------
     * 12 has two consecutive set-bits, and the value operation was greater than 1
     *
     * Let's consider 10
     * Its binary representation is : 1 0 1 0
     * n >> 1 will be: 0 1 0 1 = 5
     * Now AND operation on both the numbers:
     * n        -------- 1 0 1 0
     * n >> 1   -------- 0 1 0 1
     * &-------------------------
     *                   0 0 0 0    = 0
     * --------------------------
     * 10 has no consecutive set-bits. So when we right-shift 10 by 1, and perform an AND operation, no set bits in both
     * the numbers are at the same position, so the result was 0.
     * */
    public static boolean isSparse(int n) {
        // Your code here
        if ((n & (n >> 1)) >= 1)
            return false;
        return true;
    }
}
