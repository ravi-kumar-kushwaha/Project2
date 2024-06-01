import java.util.Scanner;

public class hollowRectengularPattern {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter any number which you want to print");
       int number=sc.nextInt(); 
       for(int i=1;i<=number;i++){
        for(int j=1;j<=number;j++){
            if(i==1||j==1||i==number||j==number){
              System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println(" ");
       }
    }
}

/*
 * * * *
 *     *
 *     *
 * * * *
 */