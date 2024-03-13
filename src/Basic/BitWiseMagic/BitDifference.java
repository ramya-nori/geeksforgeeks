package Basic.BitWiseMagic;
/**
 * You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.
 *
 * Example 1:
 *
 * Input: A = 10, B = 20
 * Output: 4
 * Explanation:
 * A  = 01010
 * B  = 10100
 * As we can see, the bits of A that need
 * to be flipped are 01010. If we flip
 * these bits, we get 10100, which is B.
 * Example 2:
 *
 * Input: A = 20, B = 25
 * Output: 3
 * Explanation:
 * A  = 10100
 * B  = 11001
 * As we can see, the bits of A that need
 * to be flipped are 10100. If we flip
 * these bits, we get 11001, which is B.
 *
 * Your Task: The task is to complete the function countBitsFlip() that takes A and B as parameters and returns the count of the number of bits to be flipped to convert A to B.
 *
 * Expected Time Complexity: O(log N).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 1 ≤ A, B ≤ 10^6
 **/
public class BitDifference {
    // Function to find number of bits needed to be flipped to convert A to B
    /**
     *Explanation of the code:
     * For a XOR operator, the bits that are different will result in 1.
     * i.e.,
     * consider a = 20, b = 25
     * Now XOR operation on a and b results in the set bits in the positions where a and b's bits are different
     *
     * 20 ---- 1 0 1 0 0
     * 25 ---- 1 1 0 0 1
     * ^----------------
     *         0 1 1 0 1 = 13
     * -----------------
     * Now from Brian Kernighan's Algorithm, we have learnt that performing AND operation on a number with a number less
     * than it by 1 discards the rightmost set bit, and we will count it
     * Now for the while loop:
     * first iteration:
     *      n = 13
     *      n-1 = 12
     *
     *      13 ---- 1 1 0 1
     *      12 ---- 1 1 0 0
     *      &--------------
     *              1 1 0 0
     *     ----------------
     *     n = 12
     *     count = count + 1 = 1
     *
     * Second iteration:
     *     n = 12
     *     n-1 = 11
     *
     *     12 ---- 1 1 0 0
     *     11 ---- 1 0 1 1
     *     &---------------
     *             1 0 0 0
     *     ----------------
     *     n= 8
     *     count = count + 1 = 1 + 1 = 2
     *
     * Third iteration:
     *     n = 8
     *     n-1 = 7
     *
     *     8 ---- 1 0 0 0
     *     7 ---- 0 1 1 1
     *     &--------------
     *            0 0 0 0
     *     ---------------
     *
     *     n = 0
     *     loop ends after failing the condition, and we return the count which is 3
     **/
    public static int countBitsFlip(int a, int b) {
        // Your code here
        int n = a ^ b;
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
