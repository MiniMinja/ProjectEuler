import java.util.Arrays;
public class Solution{
  public static void main(String[] args){
    long sum = 0;
    for(int i = 0; i<1000;i++){
      for(int j = 0;j<1000;j++){
        if(isPandigital(i,j)){
          sum+=i*j;
        }
      }
    }
    System.out.println(sum);
  }
  public static boolean isPandigital(int a, int b){
    return isPandigital((""+a+b+(a*b)).toCharArray());
  }
  public static boolean isPandigital(char[] str){
    Arrays.sort(str);
    if(str.length != 9) return false;
    for(int i = 0;i<str.length;i++){
      if(str[i] != '0' + i+1) return false;
    }
    return true;
  }
}
