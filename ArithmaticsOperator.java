import java.util.Scanner;

public class ArithmaticsOperator {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int a=sc.nextInt() ;
    System.out.println("enter second number");
    int b=sc.nextInt();
    int sum=a+b;
    int mul=a*b;
    int sub=a-b;
    int div=a/b;
    int modu=a%b;
       System.out.println("sum of a and b is:"+sum);
       System.out.println("subtraction of a and b is:"+sub);
       System.out.println("multiplication of a and b is:"+mul);
       System.out.println("division of a and b is:"+div);
       System.out.println("modulo of a and b is:"+modu);
    }
}
