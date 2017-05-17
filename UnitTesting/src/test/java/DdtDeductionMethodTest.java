import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DdtDeductionMethodTest {
    @Parameterized.Parameters
    public static Collection dataDriven(){
        return Arrays.asList(new Object[][]{
                {9,4,5},
                {9,5,4},
                {9,6,3}
        });
    }

    private int x;
    private int y;
    private int expected;

    public DdtDeductionMethodTest(int x, int y, int expected){
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void DeductionDdtTest(){
        Assert.assertEquals(expected, MethodsBaseDdt.calculateDeduction(x,y));
    }
}
