import java.util.Scanner;

public class fectorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number which factorial you want to find");
        int number=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=number;i++){
           factorial=factorial*i;
           System.out.println("factorial of "+ number+" " +"is:"+factorial);
        }
    }
}
