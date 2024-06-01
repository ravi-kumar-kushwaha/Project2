import java.util.Scanner;

public class sumOfThreeNoUsingFunctionOverloading {
    public static int Sum(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        System.out.println("enter third number");
        int num3=sc.nextInt();
        System.out.println(Sum(num1, num2, num3));
    }
}
