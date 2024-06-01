import java.util.Scanner;

public class Question1Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number.");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        int expl1=(a*b/a);
        int expl2=(a*(b/a));
        System.out.println(expl1);
        System.out.println(expl2);
    }
}
