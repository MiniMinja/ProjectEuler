import java.util.*;
public class Solution{
  public static void main(String[] args){
    HashSet<Double> arr = new HashSet<Double>();
    for(int a = 2;a<=100;a++){
      for(int b = 2;b<=100;b++){
        double res = Math.pow(a,b);
        arr.add(res);
      }
    }
    System.out.println(arr);
    System.out.println(arr.size());
  }
}
