import java.util.Scanner;

public class FactorialUsingFunction {
    public static int Factorial(int number){
        int factorial=1;
          for(int i=1;i<=number;i++){
                    factorial=factorial*i;
                    System.out.println("factorial of given number is:"+factorial);
            }
            return 1;
          }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number which factorial you want to find");
        int number=sc.nextInt();
        Factorial(number);
    }
}
