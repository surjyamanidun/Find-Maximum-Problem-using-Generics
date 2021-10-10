package generics;
public class TestMaximum <E extends Comparable<E>>{
    E firstValue;
    E secondValue;
    E thirdValue;
    E[] moreParameters;
    
    public TestMaximum(E firstValue, E secondValue, E thirdValue, E... moreParameters){
          this.firstValue = firstValue;
          this.secondValue = secondValue;
          this.thirdValue = thirdValue;
          this.moreParameters= moreParameters;
    }
    
    public E findMaximum(){
          return TestMaximum.findMaximum(firstValue,secondValue,thirdValue,moreParameters);
    }
    
    public static  < E extends Comparable<E> > E findMaximum(E firstValue, E secondValue, E thirdValue,E... moreParameters){
          E maximum = firstValue;
          if ( secondValue.compareTo(maximum) > 0 ){
                maximum = secondValue;
          }
          if ( thirdValue.compareTo(maximum) > 0 ){
                maximum = thirdValue;
          }
          if (moreParameters.length != 0 ){
                for (E parameter: moreParameters){
                      if ( parameter.compareTo(maximum) > 0 ){
                            maximum = parameter;
                      }
                }
          }
          printMax(maximum);
          return maximum;
    }
    
    public static <E extends Comparable<E>> void printMax(E maximum){
          System.out.println("Maximum value is :"+maximum);
    }
}