import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DdtMultiplicationMethodTest {
    @Parameterized.Parameters
    public static Collection dataDriven(){
        return Arrays.asList(new Object[][]{
                {9,9,81},
                {9,3,27},
                {18,6,108}
        });
    }

    private int x;
    private int y;
    private int expected;

    public DdtMultiplicationMethodTest(int x, int y, int expected){
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void MultiplicationDdtTest(){
        Assert.assertEquals(expected, MethodsBaseDdt.calculateMultiplication(x,y));
    }
}
