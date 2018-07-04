import java.util.Arrays;
public class Solution{
   public static void main(String[] args){
      int[] coins = {2,5,10,20,50,100,200};
      int[] quantity = new int[7];
      int count = 0;
      while(sum(coins,quantity) <= 200){
        //System.out.println(Arrays.toString(quantity));
        count++;
        if(!add(coins,quantity,0)) break;
      }
      System.out.println(count);
   }
   public static int sum(int[] coins, int[] quantity){
     int sum = 0;
     for(int i = 0 ;i<quantity.length;i++){
       sum+=coins[i]*quantity[i];
     }
     return sum;
   }
   public static boolean add(int[] coins, int[] quantity, int k){
     if(k < coins.length){
       if(sum(coins,quantity) + coins[k] > 200){
         quantity[k] = 0;
         return add(coins, quantity, k+1);
       }
       else{
         quantity[k]++;
         return true;
       }
     }
     return false;
   }
}
