import java.util.Scanner;

public class SwapeTwoNumberUsingFunction {
    public static int SwapeTwoNumber(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("first number is"+num1);
        System.out.println("second number is"+num2);
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        SwapeTwoNumber(num1, num2);
    }
}
