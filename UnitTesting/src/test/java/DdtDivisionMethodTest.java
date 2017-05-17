import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DdtDivisionMethodTest {
    @Parameterized.Parameters
    public static Collection dataDriven(){
        return Arrays.asList(new Object[][]{
                {9,9,1},
                {9,3,3},
                {18,6,3}
        });
    }

    private int x;
    private int y;
    private int expected;

    public DdtDivisionMethodTest(int x, int y, int expected){
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void DivisionDdtTest(){
        Assert.assertEquals(expected, MethodsBaseDdt.calculateDivision(x,y));
    }
}
