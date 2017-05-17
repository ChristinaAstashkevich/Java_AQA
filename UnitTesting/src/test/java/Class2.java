import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class Class2 {

    @Category(FastTests.class)
    @Ignore("This test is empty so ignored")
    @Test
    public void emptyTest(){
//this test is empty
    }
}
