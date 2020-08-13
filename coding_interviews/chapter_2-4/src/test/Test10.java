package test;

import org.junit.Test;
import  recursion_iteration.Solution10;
public class Test10 {

    @Test
    public void test_1(){
        long x = Solution10.Fibonacci_1(10);
        System.out.println(x);
    }

    @Test
    public void test_2(){
        long x = Solution10.Fibonacci_2(10);
        System.out.println(x);
    }
}
