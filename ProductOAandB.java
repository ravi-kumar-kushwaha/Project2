import java.util.Scanner;

public class ProductOAandB {
    public static int ProductOfTwoNumber(int num1,int num2){
        int product=num1*num2;
        System.out.println("sum of two number Num1 and Num2 is:"+product);
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();
        ProductOfTwoNumber(num1, num2);
    }
}
