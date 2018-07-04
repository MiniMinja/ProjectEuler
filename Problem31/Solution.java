<<<<<<< HEAD
import java.util.Arrays;
=======

>>>>>>> 3929800b5de271a4bfef39e3286f31578a93cec7
public class Solution{
   public static void main(String[] args){
      int[] coins = {2,5,10,20,50,100,200};
      int[] quantity = new int[7];
<<<<<<< HEAD
      int count = 0;
      while(sum(coins,quantity) <= 200){
        //System.out.println(Arrays.toString(quantity));
        count++;
        if(!add(coins,quantity,0)) break;
      }
=======
      int count = 1;
      for(;add(coins,quantity,0);count++);
>>>>>>> 3929800b5de271a4bfef39e3286f31578a93cec7
      System.out.println(count);
   }
   public static int sum(int[] coins, int[] quantity){
     int sum = 0;
<<<<<<< HEAD
     for(int i = 0 ;i<quantity.length;i++){
       sum+=coins[i]*quantity[i];
=======
     for(int i = 0;i<quantity.length;i++){
       sum += coins[i] * quantity[i];
>>>>>>> 3929800b5de271a4bfef39e3286f31578a93cec7
     }
     return sum;
   }
   public static boolean add(int[] coins, int[] quantity, int k){
<<<<<<< HEAD
     if(k < coins.length){
       if(sum(coins,quantity) + coins[k] > 200){
         quantity[k] = 0;
         return add(coins, quantity, k+1);
       }
       else{
         quantity[k]++;
         return true;
       }
=======
     if(k < quantity.length){
       if(sum(coins,quantity) + coins[k] <= 200){
         quantity[k]++;
         return true;
       }
       else{
         quantity[k] = 0;
         return add(coins, quantity, k+1);
       }
>>>>>>> 3929800b5de271a4bfef39e3286f31578a93cec7
     }
     return false;
   }
}
