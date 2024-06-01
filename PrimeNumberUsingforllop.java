import java.util.Scanner;

public class PrimeNumberUsingforllop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number to check the number is prime or not");
        int number=sc.nextInt();
        boolean isprime=true;
        if(number==2){
            System.out.println("prime number");
        }
        else{
            // for(int i=2;i<=number-1;i++)
            for(int i=2;i<=Math.sqrt(number);i++){
           if(number%i==0) {
            // number is multiple of i(i is not equal to1 or number)
            isprime=false;
           }
        }
        if(isprime==true){
            System.out.println("prime number");
        }
        else {
            System.out.println("not prime");
        }
        }  
    }
}
