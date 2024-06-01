import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number"); 
       int number=sc.nextInt();
       int i=1;
       while(i<=number){
           System.out.println(i+":-"+"hello how are you");
            i++;
       }
    }
}
