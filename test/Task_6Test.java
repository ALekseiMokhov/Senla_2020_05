import Task_6.DynamicCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task_6Test {
    DynamicCalculator calculator;
    int[] testValues;
    int[] testWeights;
    int testCapacity;
    @Before
    public void init() {
        calculator = new DynamicCalculator();
        testValues =new int[] {1,2,3,51,44};
        testWeights =new int[] {4,5,6,3,18};
        testCapacity = 22;
    }


    @Test
    public void testKnapsackDP() {
      Assert.assertEquals(95,
              calculator.knapsackDP( testWeights,testValues,testValues.length,testCapacity ) );
    }
}
