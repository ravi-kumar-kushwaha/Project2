import java.util.Scanner;
public class EvenOrOdd2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,choice,EvenSum=0,OddSum=0;
        do{
            System.out.println("enter your number");
            number=sc.nextInt();
            if(number%2==0){
                EvenSum+=number;
            }
            else{
                OddSum+=number;
            }
            System.out.println("do you want to continue? press 1 for yes or press 0 for no");
            choice=sc.nextInt();
        }
        while(choice==1);
        System.out.println("sum of even number is:"+EvenSum);
        System.out.println("sum of odd number is:"+OddSum);
    }
}
