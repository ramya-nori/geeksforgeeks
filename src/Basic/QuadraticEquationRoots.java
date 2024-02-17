package Basic;

import java.util.ArrayList;

/***
 *
 *
 * Given a quadratic equation in the form ax2 + bx + c. Find its roots.
 *
 * Note: Return the maximum root followed by the minimum root.
 *
 * Example 1:
 *
 * Input:
 * a = 1
 * b = -2
 * c = 1
 * Output: 1 1
 * Explanation:
 * Roots of equation x2-2x+1 are 1 and 1.
 *
 * Example 2:
 *
 * Input:
 * a = 1
 * b = -7
 * c = 12
 * Output: 4 3
 * Explanation: Roots of equation
 * x2 - 7x + 12 are 4 and 3.
 *
 *
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function quadraticRoots() which takes a, b, c as input parameters and returns a list of two integers containing the floor value of its roots in decreasing order. If roots are imaginary, the returning list should contain only 1 integer ie -1. Always return the greatest integer smaller than or equal to the result.
 * Note: If roots are imaginary, the generated output will display "Imaginary".
 *
 *
 *
 * Expected Time Complexity: O(1)
 * Expected Auxiliary Space : O(1)
 *
 *
 *
 * Constraints:
 * -103 <= a,b,c <= 10
 * **/

public class QuadraticEquationRoots {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        double sq = b * b - 4 * a * c;
        if (sq < 0) {
            result.add(-1);
            return result;
        }
        int root1 = (int) Math.floor((-b + Math.sqrt(sq)) / (2 * a));
        int root2 = (int) Math.floor((-b - Math.sqrt(sq)) / (2 * a));
        result.add(Math.max(root1, root2));
        result.add(Math.min(root1, root2));
        return result;
    }
}
