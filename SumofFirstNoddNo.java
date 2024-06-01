import java.util.Scanner;

public class SumofFirstNoddNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        int sum=0;
        for(int i=0;i<number;i++){
           if(i%2==1){
                     sum=sum+i;
                     System.out.println("sum of first " + " " + number +" "+ "number is: " + sum);
           }
        }
    }
}
