import java.util.Scanner;

public class average3Numbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number");
        float num1=sc.nextFloat();
        System.out.println("enter second number");
        float num2=sc.nextFloat();
        System.out.println("enter third number");
        float num3=sc.nextFloat();
        float Average=(num1+num2+num3)/3;
        System.out.println("Average of three numbers are:"+Average);
    }
}
