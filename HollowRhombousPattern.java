import java.util.Scanner;

public class HollowRhombousPattern {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(i==1||j==1||i==number||j==number){
                System.out.print("*");
            }
            else{
                System.out.print("  ");
            }
            }
            for(int j=1;j<=number-i;j++){
                if(i==1||j==1||i==number||j==number){
                System.out.print("*");
            }
            else{
                System.out.print("  ");
            }
            }
           System.out.println(" ");
        }
    }
}
