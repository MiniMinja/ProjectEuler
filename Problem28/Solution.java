public class Solution{
  public static void main(String[] args){
    long sum = 1;
    int n = 1;
    for(int i = 2;i<1001;i+=2){
      for(int j = 0;j<4;j++){
        n+=i;
        sum+=n;
      }
    }
    System.out.println(sum);
  }
}
