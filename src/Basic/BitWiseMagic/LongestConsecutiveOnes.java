package Basic.BitWiseMagic;
/**
 *
 * Given a number N. Find the length of the longest consecutive 1s in its binary representation.
 *
 * Example 1:
 *
 * Input: N = 14
 * Output: 3
 * Explanation:
 * Binary representation of 14 is
 * 1110, in which 111 is the longest
 * consecutive set bits of length is 3.
 * Example 2:
 *
 * Input: N = 222
 * Output: 4
 * Explanation:
 * Binary representation of 222 is
 * 11011110, in which 1111 is the
 * longest consecutive set bits of length 4.
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function maxConsecutiveOnes() which returns the length of the longest consecutive 1s in the binary representation of given N.
 *
 * Expected Time Complexity: O(log N).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 1 <= N <= 10^6
 *
 * **/
public class LongestConsecutiveOnes {
    public static int maxConsecutiveOnes(int N) {
        int res = 0;
        int count = 0;
        // Your code here
        while (N != 0) {
            if (N % 2 == 1) {
                count++;
                res = Math.max(res, count);
            } else {
                count = 0;
            }
            N /= 2;
        }
        return res;
    }
}
