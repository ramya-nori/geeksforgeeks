package Basic.BitWiseMagic;
/**
 *Given an integer N. The task is to return the position of first set bit found from the right side in the binary representation of the number.
 * Note: If there is no set bit in the integer N, then return 0 from the function.
 *
 * Example 1:
 *
 * Input:
 * N = 18
 * Output:
 * 2
 * Explanation:
 * Binary representation of 18 is 010010,the first set bit from the right side is at position 2.
 * Example 2:
 *
 * Input:
 * N = 12
 * Output:
 * 3
 * Explanation:
 * Binary representation of  12 is 1100, the first set bit from the right side is at position 3.
 * Your Task:
 * The task is to complete the function getFirstSetBit() that takes an integer n as a parameter and returns the position of first set bit.
 *
 * Expected Time Complexity: O(log N).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 0 <= N <= 10^8
 * */
public class FirstSetBit {
    //Function to find position of first set-bit in the given number.
    /*
    * Explanation of the code:
    * Suppose n is 12 (binary representation: 1100).
    * We initialize the position counter to 1.
    * In the while loop:
        *We check if n is greater than 0. Since it is, we enter the loop.
        * We check if the rightmost bit of n is set.
        * In the first iteration
            n & 1 evaluates to 0, because the rightmost bit of 12 is not set.
            We shift n one position to the right (n = n >> 1), which results in n becoming 6 (binary: 0110).
            We increment the position counter to 2.
        * In the next iteration:
            n is still greater than 0, so we continue the loop.
            We check if the rightmost bit of n is set.
            Now, n & 1 evaluates to 0 again, because the rightmost bit of 6 is not set.
            We shift n one position to the right again, resulting in n becoming 3 (binary: 0011).
            We increment the position counter to 3.
        * In the next iteration:
            n is still greater than 0, so we continue the loop.
            We check if the rightmost bit of n is set.
            Now, n & 1 evaluates to 1, because the rightmost bit of 3 is set.
            Since the rightmost bit is set, we return the current position, which is 3.
    *
    * */
    public static int getFirstSetBit(int n) {
        // Your code here
        int position = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                return position;
            }
            n = n >> 1;
            position++;
        }
        return 0;
    }
}
