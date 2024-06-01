import java.util.Scanner;

public class ternoryOperator {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter first number");
       int x=sc.nextInt();
       System.out.println("enter second number"); 
       int y=sc.nextInt();
       boolean z=(x<y) ? true:false;
       System.out.println(z);
       int R=(x>y) ? x:y;
       System.out.println(R);
    }
}
