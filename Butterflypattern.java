import java.util.Scanner;

public class Butterflypattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(number-i)+1;j++){
                System.out.print(" ");
            }
           
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println("");
        }
       for(int i=number;i>=1;i--){
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(number-i)+1;j++){
                System.out.print(" ");
            }
           
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println("");
        }
    }
}
