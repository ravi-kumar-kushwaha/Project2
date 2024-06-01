import java.util.Scanner;

public class ReverseOfAnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number which you want to print in reverse");
        int number=sc.nextInt();
      
        while(number>0){
              int lastnumber=number%10;
            System.out.println("reverse of the given no is:"+lastnumber);
            number=number/10;
        }
        System.out.println("");
    }
}
