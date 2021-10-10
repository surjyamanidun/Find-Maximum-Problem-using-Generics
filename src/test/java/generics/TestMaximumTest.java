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
      public void givenThirdNumberAsGreater_ShouldReturnTrue() {
            TestMaximum testMaximum = new TestMaximum(20,30,100);
            Assert.assertEquals(100,testMaximum.findMaximum());
      }

      @Test
      public void givenFloatFirstNumberAsGreater_ShouldReturnTrue() {
            TestMaximum testMaximum = new TestMaximum(100.2f,20.4f,30.5f);
            Assert.assertEquals(100.2f,testMaximum.findMaximum());
      }

      @Test
      public void givenSecondFloatNumberAsGreater_ShouldReturnTrue() {
            TestMaximum testMaximum = new TestMaximum(20.4f,100.2f,30.5f);
            Assert.assertEquals(100.2f,testMaximum.findMaximum());
      }

      @Test
      public void givenThirdFloatNumberAsGreater_ShouldReturnTrue() {
            TestMaximum testMaximum = new TestMaximum(20.4f,30.5f,100.2f);
            Assert.assertEquals(100.2f,testMaximum.findMaximum());
      }

      @Test
      public void givenFirstString_WhenGreater_ShouldReturnTrue() {
            TestMaximum testMaximum = new TestMaximum("Peach","Apple","Banana");
            Assert.assertEquals("Peach",testMaximum.findMaximum());
      }

      @Test
      public void givenSecondString_WhenGreater_ShouldReturnTrue() {
            TestMaximum testMaximum = new TestMaximum("Apple","Peach","Banana");
            Assert.assertEquals("Peach",testMaximum.findMaximum());
      }

      @Test
      public void givenThirdString_WhenGreater_ShouldReturnTrue() {
            TestMaximum testMaximum = new TestMaximum("Apple","Banana","Peach");
            Assert.assertEquals("Peach",testMaximum.findMaximum());
      }
}