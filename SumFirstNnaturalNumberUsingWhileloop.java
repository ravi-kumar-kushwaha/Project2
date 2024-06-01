import java.util.Scanner;

public class SumFirstNnaturalNumberUsingWhileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int number =sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=number){
           System.out.println("sum of first"+number+"natural number is:-"+ sum);
             sum=sum+i;
            i++;
        }
    }
}
