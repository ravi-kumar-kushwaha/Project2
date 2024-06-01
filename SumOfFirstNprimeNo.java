import java.util.Scanner;

public class SumOfFirstNprimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(("enetr the number"));
        int number=sc.nextInt();
        int sum=0;
        for(int i=0;i<=number;i++){
             if(i%2==0){
                 sum=sum+i;
                  System.out.println("sum of first"+number+"even number is:"+sum);
             }
        }
    }
}
