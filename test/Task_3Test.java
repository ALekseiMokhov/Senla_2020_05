import Task_3.InputWordsCounter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class Task_3Test {

    private InputWordsCounter wordsCounter;
    private String s ;
    @Before
    public void init(){
        wordsCounter = new InputWordsCounter();
        s += "cbA ee lwedf Wer opijnewvf 3fqy jhr t7j";
    }
    @Test
    public void testCountAndPrintWords() {

        Assert.assertEquals( 8,wordsCounter.countAndPrintWords( s ) );
    }
}
