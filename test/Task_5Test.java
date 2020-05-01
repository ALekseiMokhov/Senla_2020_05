import Task_5.PalindromeChecker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task_5Test {
    PalindromeChecker checker;
    @Before
    public void init(){
        checker = new PalindromeChecker();
    }

    @Test
    public void testIsPalindrome() {
        Assert.assertEquals(true,checker.isPalindrome( 189981 ));
        Assert.assertNotEquals(true,checker.isPalindrome( 2234 ));
    }
}
