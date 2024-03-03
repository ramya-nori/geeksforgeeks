package Basic;
/**
 *Given a number N and a bit number K, check if Kth index bit of N is set or not. A bit is called set if it is 1. Position of set bit '1' should be indexed starting with 0 from LSB side in binary representation of the number.
 * Note: Index is starting from 0. You just need to return true or false, driver code will take care of printing "Yes" and "No".
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * K = 0
 * Output:
 * No
 * Explanation:
 * Binary representation of 4 is 100, in which 0th index bit from LSB is not set. So, return false.
 * Example 2:
 *
 * Input:
 * N = 4
 * K = 2
 * Output:
 * Yes
 * Explanation:
 * Binary representation of 4 is 100, in which 2nd index bit from LSB is set. So, return true.
 * Example 3:
 *
 * Input:
 * N = 500
 * K = 3
 * Output:
 * No
 * Explanation:
 * Binary representation of 500 is 111110100, in which 3rd index bit from LSB is not set. So, return false.
 * Your task:
 * You don't have to read input or print anything. Your task is to complete the function checkKthbit that takes n and k as parameters and returns either true(if kth bit is set) or false(if kth bit is not set).
 *
 * Expected Time Complexity: O(1).
 * Expected Auxiliary Space: O(1).
 *
 * Constraints:
 * 1 ≤ N ≤ 10^9
 * 0 ≤ K ≤ 31
 * **/
class CheckBit {
    // Function to check if Kth bit is set or not.
    /*
    * Explanation of the code:
    * Suppose n is 12 (binary representation: 1100) and k is 2.
    * We want to check whether the 2nd bit from the right is set.
    * Shift n to the right k positions:
        x = n >> k = 12 >> 2 = 3
    * In binary: 12 (1100) -> 3 (11)
    * Check if the rightmost bit of x is set:
        x & 1 = 3 & 1 = 1
    * The result is 1, indicating that the rightmost bit of x is set.
    * Return true because the kth bit of n is set.
    * So, for the given example, the method checkKthBit(12, 2) will return true.
    * This method efficiently determines whether the kth bit of an integer is set or not by using bitwise operations,
    *  and it does so in constant time and space, making it compliant with the constraints specified.
    * */
    static boolean checkKthBit(int n, int k) {
        // Your code here
        int x = (n >> k);
        if ((x & 1) != 0)
            return true;
        else return false;
    }

}