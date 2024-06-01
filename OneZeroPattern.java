import java.util.Scanner;

public class OneZeroPattern {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
            else{
                System.out.print(0);
            }
           
            }
             System.out.println("");
        }
    }
}
/*
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1
 */