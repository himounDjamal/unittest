package dz.training.test;

public class somm {
  public int som (int a , int b){
      return a+b;
  }
  public int sub (int a , int b) {
            return a - b;
  }

  public int div(int a , int b){
      if(b == 0){
          throw new IllegalArgumentException("divion sur zero");
      }
      return a/b;
  }
}