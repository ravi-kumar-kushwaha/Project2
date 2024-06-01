import java.util.Scanner;

public class SumofTwoNumberUsingFunction {
    public static int SumOfTwoNumbers(int num1,int num2){
        int sum=num1+num2;
        System.out.println("sum of num1 and num2 is:"+sum);
        return 1;
    }    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        SumOfTwoNumbers(num1, num2);
    }
}
