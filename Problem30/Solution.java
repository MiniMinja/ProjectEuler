import java.util.*;
public class Solution{
  public static void main(String[] args){
    int res = 0;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(int i = 2;i<355000;i++){
      if(i == digitSum(""+i)){
        res += i;
        arr.add(i);
      }
    }
    System.out.println(arr);
    System.out.println(res);
  }
  public static int digitSum(String num){
    int sum = 0;
    for(int i = 0;i<num.length();i++){
      sum+=(int)Math.pow(num.charAt(i)-'0', 5);
    }
    return sum;
  }
}
