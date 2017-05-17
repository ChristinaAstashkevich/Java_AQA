import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DdtAdditionMethodTest {

    @Parameterized.Parameters
    public static Collection dataDriven(){
        return Arrays.asList(new Object[][]{
                {9,4,13},
                {9,5,14},
                {9,6,15}
        });
    }

    private int x;
    private int y;
    private int expected;

    public DdtAdditionMethodTest(int x, int y, int expected){
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Test
    public void AdditionDdtTest(){
        Assert.assertEquals(expected, MethodsBaseDdt.calculateAddition(x,y));
    }
}
