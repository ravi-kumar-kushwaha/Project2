import java.util.Scanner;

public class ToFindTheNumberIsPositiveOrNegetive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        if(number>0){
            System.out.println("number enterd by you is a positive number");
        }
        else{
            System.out.println("number entered by you is a negative number");
        }
    }
}
