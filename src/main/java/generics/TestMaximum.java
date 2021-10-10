package generics;

public class TestMaximum <E extends Comparable<E>>{
      E firstValue;
      E secondValue;
      E thirdValue;
      public TestMaximum(E firstValue, E secondValue, E thirdValue){
            this.firstValue = firstValue;
            this.secondValue = secondValue;
            this.thirdValue = thirdValue;
      }
      public E findMaximum(){
            return TestMaximum.findMaximum(firstValue,secondValue,thirdValue);
      }
      public static  < E extends Comparable <E> > E findMaximum(E firstValue, E secondValue, E thirdValue){
            E maximum = firstValue;
            if ( secondValue.compareTo(maximum) > 0 ){
                  maximum = secondValue;
            }
            if ( thirdValue.compareTo(maximum) > 0 ){
                  maximum = thirdValue;
            }
            return maximum;
      }
}