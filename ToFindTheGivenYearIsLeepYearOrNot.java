import java.util.Scanner;

public class ToFindTheGivenYearIsLeepYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the year");
        int year=sc.nextInt();
        if((year%4==0)&&((year%100!=0)||(year%400==0))){
            System.out.println("given year is a leep year");
        }
        else{
            System.out.println("given year is not a leep year");
        }
    }
}
