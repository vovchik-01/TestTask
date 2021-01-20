package HappyPath;

import org.testng.Assert;
import org.testng.annotations.Test;
import rowOperations.Operations;

import java.util.ArrayList;
import java.util.List;

public class HappyPathTestOperations {


    @Test
    void checkReverseLineMethod() {
        String expected = "raw 1";
        String actual = Operations.reverseLine("1 war");
        Assert.assertEquals(actual, expected);
    }


    @Test
    void checkGetNumberFromLine (){
        int expected = 8;
        int actual = Operations.getNumberFromLine("raw 8");
        Assert.assertEquals(actual,expected);
    }


    @Test
    void checkGetSequenceFibonacci (){
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        List<Integer> actual = Operations.getSequenceFibonacci(5);
        Assert.assertEquals(actual,expected);
    }


}
