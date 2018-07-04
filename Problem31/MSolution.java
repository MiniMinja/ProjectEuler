public class MSolution{
  public static void main(String[] args){
    int[] coins = {1,2,5,10,20,50,100,200};
    int[] arr = new int[201];
    arr[0] = 1;
    for(int c: coins){
      for(int i = c;i<arr.length;i++){
        arr[i] += arr[i - c];
      }
    }
    System.out.println(arr[200]);
  }
}
