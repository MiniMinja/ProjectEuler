import java.util.Arrays;
import java.util.HashSet;
public class Solution{
  public static void main(String[] args){
    HashSet<Integer> pandigitals = new HashSet<Integer>();
    long sum = 0;
    for(int i = 100; i<1000;i++){
      for(int j = 10;j<100;j++){
        if(isPandigital(i,j) && !pandigitals.contains(i * j)){
          sum+=i*j;
          pandigitals.add(i * j);
        }
      }
    }
    for(int i = 0; i<10;i++){
      for(int j = 1000;j<9999;j++){
        if(isPandigital(i,j) && !pandigitals.contains(i * j)){
          sum+=i*j;
          pandigitals.add(i * j);
        }
      }
    }
    System.out.println(sum);
  }
  public static boolean isPandigital(int a, int b){
    return isPandigital((""+a+b+(a*b)).toCharArray());
  }
  public static boolean isPandigital(char[] str){
    int sum = 0;
    int appearedOnce = 0;
    for(int i = 0;i<str.length;i++){
      int bit = 1;
      bit <<= str[i]-'1';
      if((appearedOnce & bit)==0 && (sum & bit) == 0){
        sum |= bit;
        appearedOnce |= bit;
      }
      else{
        appearedOnce &= ~bit;
      }
    }
    return sum == 0b111111111 && appearedOnce == 0b111111111;
  }
}
