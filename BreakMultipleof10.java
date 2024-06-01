import java.util.Scanner;

public class BreakMultipleof10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("enter your number");
             int number=sc.nextInt();
            if(number%10==0){
                break;
            }
            System.out.println(number);
        }
        while(true);
    }
}
