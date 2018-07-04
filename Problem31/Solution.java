public class Solution{
   public static void main(String[] args){
      int[] coins = {2,5,10,20,50,100,200};
      int[] quantity = new int[7];

   }
   public static sum(int[] coins, int[] quantity){
     int sum = 0;
     for(int i = 0 ;i<quantity.length;i++){
       sum+=coins[i]*quantity[i];
     }
     return sum;
   }
}
