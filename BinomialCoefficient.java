import java.util.Scanner;
 public class BinomialCoefficient {
    public static int factorial(int num){
            int factorial=1;
            for(int i=1;i<=num;i++){
                factorial=factorial*i;
                System.out.println("factorial og given number is:"+factorial);
            }
             return factorial;
    }
   public static int BinomialCoeffi(int num,int r){
        int fact_n=factorial(num);
        int fact_r =factorial(r);
        int fact_nminusr=factorial(num-r);
        int BinomialCoeffi=fact_n/(fact_r*fact_nminusr);
        return BinomialCoeffi;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        System.out.println("enter the value of r");
        int r=sc.nextInt();
        //    factorial(num);
       System.out.println("Bionomial coefficiant is:"+BinomialCoeffi(num,r));
    }
}
/*
               nCr=n!/r!*(n-r)!
 */