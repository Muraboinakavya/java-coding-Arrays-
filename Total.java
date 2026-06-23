 import java.util.Scanner;
public class Total {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many subjects?: ");
        int n = scanner.nextInt();
        int marks[] = new int[n]; 
        for(int i =0;i<n;i++){
            System.out.println("Enter The marks : ");
            marks[i] = scanner.nextInt();
        }
        int tot = 0;
        for(int i=0;i<5;i++){
            tot = tot+marks[i];
        }
        System.out.println("The total marks is :  " + tot);
        float percent = (float)tot/n;
        System.out.println("The percentage ofthe total marks : " +percent);
        scanner.close();

    }
    
}
