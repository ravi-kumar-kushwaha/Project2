import java.util.Scanner;

public class sum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("sum of number1 and number2 is:"+sum);
    }
}
