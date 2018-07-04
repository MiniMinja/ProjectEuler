public class Solution{
  public static int[] arr;
  public static void main(String[] args){
    arr = sieve(87400);
    int max = -1;
    int maxA = -1;
    int maxB = -1;
    for(int a = -1000;a <=1000;a++){
      for(int b = -1000; b <=1000;b++){
        int n =0;
        while(isPrime(func(a,b,n))){
           n++;
        }
        //if(n > 0) System.out.println(n);
        if(n > max){
           max = n;
           maxA = a;
           maxB = b;
        }

      }
    }
    System.out.println(max);
    System.out.println(maxA);
    System.out.println(maxB);
    System.out.println(maxA * maxB);
  }
  public static int func(int a, int b, int n){
    return Math.abs(n * n + a * n + b);
  }
  public static boolean isPrime(int n){
    return arr[n] != 0;
  }
  public static int[] sieve(int n){
    int[] arr = new int[n];
    for(int i =0;i<n;i++) arr[i] = i;
    for(int i = 2;i<n;i++){
      for(int j = i+i;j<n;j+=i){
        arr[j] = 0;
      }
    }
    return arr;
  }
}
