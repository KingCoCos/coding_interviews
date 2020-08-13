package recursion_iteration;

/**
 * @author: jcc
 * @date: 2020/8/11
 * 题目要求：求斐波那契数量的第n项
 * 分析：f(n) = f(n-1) + f(n-2)
 */

public class Solution10 {
    /**
     *方法1：直接递归
     * 时间复杂度：O(2^n)
     * 空间复杂度：O(n) --入栈的函数个数，即递归树的高度
     */
    public static long Fibonacci_1(int n){
        if (n <= 0) {
            return 0;
        }

        if (n == 1){
            return 1;
        }

        return Fibonacci_1(n-1) + Fibonacci_1(n-2);
    }

    /**
     * 方法2：动态规划。从下往上计算，保存两项中间值f(n-1)和f(n-2)
     * 时间复杂度：O(n)
     * 空间复杂度：O(1）
     */
    public static long Fibonacci_2(int n){

        int[] dp = {0,1};
        if (n < 2){
           return dp[n];
        }

        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = fib;
        }

        return fib;
    }

}
