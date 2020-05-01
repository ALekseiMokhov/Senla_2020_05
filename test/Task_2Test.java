import Task_2.LeastCommonMultiplyFinder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task_2Test {
    LeastCommonMultiplyFinder finder ;
    @Before
    public void init(){
        finder = new LeastCommonMultiplyFinder();
    }
    @Test
    public void testGCD(){
        Assert.assertEquals( 3,finder.GCD( 6,21 ) );
    }
    @Test
    public void testLCM(){
        Assert.assertEquals( 24,finder.LCM( 3,8 ) );
    }
}
