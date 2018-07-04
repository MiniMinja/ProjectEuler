import java.util.ArrayList;
public class Solution{
  public static void main(String[] args){
    int max = 1;
    int d = -1;
    for(int i = 1000;i>=max;i--){
      int rs = getRecurringSize(i);
      if(max < rs){
        max = rs;
        d = i;
      }
    }
    System.out.println(d);
  }
  public static int getRecurringSize(int d){
    ArrayList<Integer> visited = new ArrayList<Integer>();
    int num = 1;
    do{
      if(visited.contains(num)){
        return visited.size() - visited.indexOf(num);
      }
      else visited.add(num);
      num *= 10;
      num %= d;
    }while(num > 0);
    return -1;
  }
}
