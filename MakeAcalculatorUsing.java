import java.util.Scanner;

public class MakeAcalculatorUsing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        float firstnumber=sc.nextFloat();
        System.out.println("enter second number");
        float secondnumber=sc.nextFloat();
        System.out.println("choes your operator");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
            System.out.println(firstnumber+secondnumber);
            break;
            case '-':
            System.out.println(firstnumber-secondnumber);
            break;
            case '*':
            System.out.println(firstnumber*secondnumber);
            break;
            case '/':
            System.out.println(firstnumber/secondnumber);
            break;
            case '%':
            System.out.println(firstnumber%secondnumber);
            break;
            default:
            System.out.println("enter a valid operator");
        }
    }
}
