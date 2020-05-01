import Task_4.WordCounter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task_4Test {
    private WordCounter counter;
    private String  text;
    private String word;

    @Before
    public void init(){
         counter = new WordCounter();
         text = " Lorem ipsum lorem Ipsum LOREM IPSUM." ;
         word = "lorem";
    }
    @Test
    public void countWordTest() {
      long l = counter.countWord( text,word );
      Assert.assertEquals( 3,l );
    }
}
