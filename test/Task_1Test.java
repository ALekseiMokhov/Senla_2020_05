import Task_1.NumberFilter;
import Task_2.LeastCommonMultiplyFinder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task_1Test {
    private NumberFilter numberFilter ;
    @Before
    public void init(){
        numberFilter= new NumberFilter();
    }
    @Test
    public void testIsEven(){
        Assert.assertEquals(true,numberFilter.isEven( 766812 )  );
        Assert.assertNotEquals(true,numberFilter.isEven( -243 )  );


    }
    @Test
    public void testIsPrime(){
        Assert.assertEquals( true,numberFilter.isPrime( 13 ) );
        Assert.assertNotEquals( true,numberFilter.isPrime( 18 ) );
    }
}
