/**
 * Simple use of "this" keyword
 *
 */
import java.util.*;

public class TestKeywordThis{
    private int count;
    public TestKeywordThis(){
        count = 0;
    }
    public TestKeywordThis increment(){
        count++;
        return this;
    }
    public void getCount(){
        System.out.println(count);
    }
    public static void main(String args[]){
        TestKeywordThis newTest = new TestKeywordThis();
        newTest.increment().increment().increment().increment().getCount();
    }
}