import org.junit.*;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

import java.util.concurrent.TimeUnit;

@Category(SlowTests.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Class1 {

    Mathematics m = new Mathematics();

    @AfterClass
    public static void afterClass(){
        System.out.println("Tests complete runing with the next results:");
    }

    @Before
    public void beforeMethod(){
        m.setResult(0);
    }

    @Test(timeout = 1000)
    public void additionMethodTest() throws InterruptedException {
        int expectedResult = 29;
        m.add(19, 10);
        TimeUnit.SECONDS.sleep(100);
        Assert.assertEquals("ERROR: Expected "+expectedResult+", Actual "+m.getResult(), expectedResult, m.getResult());
    }

    @Test
    public void deductionMethodTest(){
        m.setResult(1);
        int expectedResult = 30;
        m.deduct(50, 20);
        Assert.assertEquals("ERROR: Expected "+expectedResult+", Actual "+m.getResult(), expectedResult, m.getResult());
    }

    @Test
    public void multiplicationMethodTest(){
        int expectedResult = 30;
        m.multiply(10, 3);
        Assert.assertEquals("ERROR: Expected "+expectedResult+", Actual "+m.getResult(), expectedResult, m.getResult());
    }

    @Test
    public void divisionMethodTest(){
        int expectedResult = 2;
        m.divide(10, 5);
        Assert.assertEquals("ERROR: Expected "+expectedResult+", Actual "+m.getResult(), expectedResult, m.getResult());
    }

    @Test(expected=ArithmeticException.class)
    public void exceptionDivisionMethodTest(){
        m.divide(0,0);
    }
}
