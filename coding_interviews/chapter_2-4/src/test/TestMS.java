package test;
import org.junit.Test;
import recursion_iteration.MySearch;

public class TestMS {
    @Test
    public void testBS(){
        int b = MySearch.binSearch(7);
        System.out.println(b);
    }
}
