import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your income");
        int income=sc.nextInt();
        int tax;
        if(income>50000){
                          tax=income*20/100;
                          System.out.println("paybale tax is:"+tax);
        }
        else if((income>50000)&&(income<=1000000)){
            tax=income*30/100;
            System.out.println("paybale tax is:"+tax);
        }
              else{
                System.out.println("you do not pay any tax");
              }
    }
}
