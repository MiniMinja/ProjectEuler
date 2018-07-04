public class Solution{
  public static void main(String[] args){
    int max = -1;
    for(int i = 999;i>=100;i--){
      for(int j = 999;j>=100;j--){
        if(isPalindrome(""+(i*j)) && i*j > max){
          max = i * j;
        }
      }
    }
    System.out.println(max);
  }
  public static boolean isPalindrome(String num){
    for(int i = 0;i<num.length()/2;i++){
      char firstChar = num.charAt(i);
      char lastChar = num.charAt(num.length()-1-i);
      if(firstChar != lastChar) return false;
    }
    return true;
  }
}
