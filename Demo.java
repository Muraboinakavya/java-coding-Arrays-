import java.util.Scanner;
import java.util.Arrays;

//import java.util.Scanner;
public class Demo {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = scanner.nextInt();
        int[]array = new int[n];
        System.out.println("Enter the array elements");

      //  int reverse = 0;
        for(int i = 0;i<n;i++){
            
          System.out.println("The reverse Array is : " + i);
        }
          for(int i=array.length-1;i=<=0;i--){
            System.out.println("the reverse value is  "+i);
          }

    }
   // System.out.println("The reverse Array is : "+reverse);
    scanner.close();
}
    

