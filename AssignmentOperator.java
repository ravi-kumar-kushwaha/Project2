import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number.");
        int a=sc.nextInt();
        System.out.println("enter second number.");
        int b=sc.nextInt();
        System.out.println(a+=b);
        System.out.println(a-=b);
         System.out.println(a*=b);
          System.out.println(a/=a);
           System.out.println(a=b);
    }
}