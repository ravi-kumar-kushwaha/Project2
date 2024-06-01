import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int number=sc.nextInt();
        for(int i=0;i<=number;i++){
            if(i==5){
                System.out.println(i);
                break;
            }
        }
        System.out.println("you are out of the loop");
    }
}
