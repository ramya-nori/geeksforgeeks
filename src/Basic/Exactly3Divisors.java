package Basic;
/**
 *
 * Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.
 *
 *
 *
 * Example 1:
 *
 * Input:
 * N = 6
 * Output: 1
 * Explanation: The only number less than 6 with
 * 3 divisors is 4 which has 1, 2 and 4 as divisors.
 * Example 2:
 *
 * Input:
 * N = 10
 * Output: 2
 * Explanation: 4 and 9 have 3 divisors.
 *
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function exactly3Divisors() that takes N as input parameter and returns count of numbers less than or equal to N with exactly 3 divisors.
 *
 *
 *
 * Expected Time Complexity : O(N^1/2 * N^1/4)
 * Expected Auxilliary Space :  O(1)
 *
 *
 *
 * Constraints :
 * 1 <= N <= 109
 *
 * **/
public class Exactly3Divisors {
    public boolean isPrime(int N) {
        // code here
        if (N == 1) {
            return false;
        }
        if (N == 2 || N == 3) {
            return true;
        }
        if (N % 2 == 0 || N % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(N); i = i + 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public int exactly3Divisors(int N) {
        //Your code here
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (isPrime(i) && i * i <= N) {
                count++;
            }
        }
        return count;
    }
}
