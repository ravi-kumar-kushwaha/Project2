import java.util.Scanner;

public class NestedLoopStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number whoes pattern you want to print");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            // one line
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
       
    }
}
/*
 * 
 * *
 * * *
 * * * *
 */