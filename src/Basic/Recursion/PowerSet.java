package Basic.Recursion;

import java.util.ArrayList;
/***
 *
 * You are given a string. You need to return the power-set (in any order) of the string.
 * Note: The string s contains lowercase letter of alphabet.
 *
 * Example 1:
 *
 * Input:
 * s = a
 * Output: a
 * Explanation: empty string and a
 * are only sets.
 * Example 2:
 *
 * Input:
 * s = abc
 * Output: a ab abc ac b bc c
 * Explanation: empty string,
 * a, ab, abc, ac, b, bc, c
 * are the sets.
 * Your Task:
 * You don't need to read input or print anything. You only need to complete the function powerSet that takes string s as parameter and returns a list of subsets. The lexicographic-sorting and printing is done automatically by the driver code.
 *
 * Expected Time Complexity: O(2^|s|).
 * Expected Auxiliary Space: O(|s|).
 *
 * Constraints:
 * 1 <= |s| <= 10
 *
 * **/
public class PowerSet {
    static ArrayList<String> powerSet(String s) {
        // add your code here
        ArrayList<String> result = new ArrayList<>();
        String curr = "";
        int i = 0;
        subsets(s, curr, i, result);
        return result;
    }

    static void subsets(String s, String curr, int i, ArrayList<String> result) {
        if (i == s.length()) {
            result.add(curr);
            return;
        }
        subsets(s, curr, i + 1, result);
        subsets(s, curr + s.charAt(i), i + 1, result);
    }
}
