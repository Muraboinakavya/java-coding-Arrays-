import java.util.Arrays;
public class Copy {
   public static void main(String[]args){
    int num [] = {1, 2, 3, 4, 5};
   int copy[] = num;
    Arrays.fill(num,0);
System.out.println(Arrays.toString(num));
System.out.println(Arrays.toString(copy));
   } 
}
