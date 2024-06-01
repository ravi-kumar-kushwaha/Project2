import java.util.Scanner;

public class FebonanchiSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int firstNumber=0;
        int secondNumber=1;
        System.out.println("enter the size of the series");
        int size=sc.nextInt();
        System.out.println("first number is:"+firstNumber);
        System.out.println("second number is :"+secondNumber);
        for(int i=2;i<=size;i++){
            int nextNumber=firstNumber+secondNumber;
            System.out.println(nextNumber);
            firstNumber=secondNumber;
            secondNumber=nextNumber;
        }
    }
}
