package comDylan;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

import static comDylan.App.CompareString;
import static comDylan.App.addition;
import static comDylan.App.div;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by dylanb on 23/02/2018.
 */
public class AppTest {

    String name;

    @Test
    public void test() throws Exception {
        App add = new App();
        int result =addition(4, 5);
        assertEquals(9, result, 0);
    }
    @Test
    public void TestFail(){
        App add = new App();
        int result =addition(4, 5);
        assertEquals(7, result, 0);
    }

    @Test(timeout=1000)
    public void TestTimeout(){
        App add = new App();
        int result =addition(4, 5);
        assertEquals(9, result, 0);
    }

    @Test
    public void TestFailure(){
        fail("Testing failure");
    }

    @Test(expected = ArithmeticException.class)
    public void TestException() throws Exception{
        App add = new App();
        int result =div(4, 0);
        assertEquals(7, result);
    }

    @Ignore
    public void ignoreTest(){
        App add = new App();
        int result =addition(4, 5);
        assertEquals(7, result, 0);
    }

    @Test
    public void CompareTwoStringTest() {
        App add = new App();
        String str1 = CompareString("Dylan", "Baadjies");
        String str2 = "Dylan Baadjies";
        assertEquals(str2,str1);
    }


}