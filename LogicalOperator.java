import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number.");
        int a=sc.nextInt();
        System.out.println("enter second nuber.");
        int b=sc.nextInt();
        /*
         1=true.
         0=false.
         */
        System.out.println((a>b)&&(a<b));
        System.out.println((a>b)||(a<b));
        System.out.println(!(a<b));
    }
}
