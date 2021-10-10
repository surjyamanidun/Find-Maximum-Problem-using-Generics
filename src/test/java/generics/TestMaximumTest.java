package generics;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximumTest {
      @Test
      public void givenFirstNumberAsGreater_ShouldReturnTrue() {
            TestMaximum testMaximum = new TestMaximum(100,20,30);
            Assert.assertEquals(100,testMaximum.findMaximum());
      }
      @Test
      public void givenSecondNumberAsGreater_ShouldReturnTrue() {
            TestMaximum testMaximum = new TestMaximum(20,100,30);
            Assert.assertEquals(100,testMaximum.findMaximum());
      }
      @Test
      public void givenThirdNumberAsGreater_ShoulReturnTrue() {
            TestMaximum testMaximum = new TestMaximum(20,30,100);
            Assert.assertEquals(100,testMaximum.findMaximum());
      }
}