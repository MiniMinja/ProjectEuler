public class JSolution{
  public static void main(String[] args){
    long a = 600851475143L;
    for(int i = 2;i<Math.sqrt(a);i++){
      while(a%i==0){
        a/=i;
      }
    }
    System.out.println(a);
  }
}
