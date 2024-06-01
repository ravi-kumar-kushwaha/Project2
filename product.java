import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        int product=num1*num2;
        System.out.println("product of number1 and number2 is:"+product);
    }
}
