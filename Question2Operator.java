import java.util.Scanner;

public class Question2Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number.");
        int x=sc.nextInt();
        System.out.println("enter second number.");
        int y=sc.nextInt();
        System.out.println("enter third number.");
        int z=sc.nextInt();
        if(x>y&&y>z){
            System.out.println("hello");
        }
        if(x>y&&z<x){
            System.out.println("java");
        }
        if((y=200)<x&&(y+500)<z){
            System.out.println("hello java");
        }
    }
}
