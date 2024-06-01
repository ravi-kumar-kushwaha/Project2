import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number whoes pattern you want to print");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number-i+1;j++){
                System.out.print("*");
            }
    //    another way to print this pattern
        // for(int i=number;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
            System.out.println();
        }
    }
}
/*
 * * * * *
 * * * *
 * * *
 * * 
 * 
 */