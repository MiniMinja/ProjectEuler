public class MSolution{
  public static void main(String[] args){
    int[] arr = new int[201];
    int[] coins = {1,2,5,10,20,50,100,200};
    arr[0] = 1;
    for(int x: coins){
      for(int i = 1;i<arr.length;i++){
        arr[i] += arr[i - x];
      }
    }
    System.out.println(arr[200]);
  }
}
