import java.util.Scanner;

public class SumOfEvenOrOddInterger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int number=sc.nextInt();
        int EvenSum=0;
        int OddSum=0;
        for(int i=0;i<=number;i++){
                if(i%2==0){
                    EvenSum+=i;
                   System.out.println(EvenSum);
            }
            else{
                OddSum+=i;
            }
        }
        //    for(int i=0;i<=number;i++){
        //     if(i%2==1){
        //         OddSum+=i;
        //         System.out.println(OddSum);
        //     }
        // }
    }
}
