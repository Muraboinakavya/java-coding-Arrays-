import java.util.Scanner;
public class Intro {
    public static void main(String[]args){
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
     /*    System.out.println("Enter the  interger ");
        int number = scanner.nextInt();
        System.out.println("Enter the  float value ");
        float digit = scanner.nextFloat();
        System.out.println("Enter the  character");
        char value = scanner.next().charAt(0);
         System.out.println("Interger"+number);
         System.out.println("Float value"+ digit);
         System.out.println("Character" + value);
         */
        System.out.println("Success is When your \"Signature\" becomes \"autograph\".");
        System.out.println("\\Let's learn 'C'\\ together with % shimina mam %");
       // System.out.println("Enter the temp value");
        //int temp = scanner.nextInt();
        System.out.println("Enter the num1");
        int num1 = scanner.nextInt();
        System.out.println("Enter the num2");
        int num2 = scanner.nextInt();
        temp = num1;
        num1=num2;
        num2 = temp;
        System.out.println("The first value "+ num1);
        System.out.println("The second value "+ num2);
        scanner.close();

        



    }
    
}
