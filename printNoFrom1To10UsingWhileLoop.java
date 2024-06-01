import java.util.Scanner;

public class printNoFrom1To10UsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int number=sc.nextInt();
        int i=1;
        while(i<=number){
            System.out.println(i);
            i++;
        }
    }
}
