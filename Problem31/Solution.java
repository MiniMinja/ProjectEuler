
public class Solution{
   public static void main(String[] args){
	    int[] coins = {2,5,10,20,50,100,200};
      int[] quantity = new int[7];
      int count = 1;
      for(;add(coins,quantity,0);count++);
      System.out.println(count);
   }
   public static int sum(int[] coins, int[] quantity){
     int sum = 0;
     for(int i = 0;i<quantity.length;i++){
       sum += coins[i] * quantity[i];
     }
     return sum;
   }
   public static boolean add(int[] coins, int[] quantity, int k){
     if(k < quantity.length){
       if(sum(coins,quantity) + coins[k] <= 200){
         quantity[k]++;
         return true;
       }
       else{
         quantity[k] = 0;
         return add(coins, quantity, k+1);
       }
     }
     return false;
   }
}
