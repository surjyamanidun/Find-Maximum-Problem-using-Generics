package generics;

public class TestMaximum {
      Integer firstInteger;
      Integer secondInteger;
      Integer thirdInteger;
      
      public TestMaximum(Integer firstInteger, Integer secondInteger, Integer thirdInteger){
      this.firstInteger = firstInteger;
      this.secondInteger = secondInteger;
      this.thirdInteger = thirdInteger;
      }
      /**
       * to find the max integer out of given 3 integers
       * @return maximum
       */
      public int findMaximum(){
          Integer maximum = firstInteger;
          if ( secondInteger.compareTo(maximum) > 0 ){
                maximum = secondInteger;
          }
          if ( thirdInteger.compareTo(maximum) > 0){
                maximum = thirdInteger;
          }
          return maximum;
      }
}