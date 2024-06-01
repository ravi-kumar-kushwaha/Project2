import java.util.Scanner;

public class FeverCheacking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your tempratuer");
        double tempratuer=sc.nextDouble();
        if(tempratuer>100){
            System.out.println("you have a fever");
        }
        else{
            System.out.println("you don't have a fever ");
        }
    }
}
