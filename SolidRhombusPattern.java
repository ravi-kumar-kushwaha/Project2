import java.util.Scanner;

public class SolidRhombusPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=number-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
/*
                              * * * *
                             * * * *
                            * * * *
                           * * * *
 */