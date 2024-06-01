import java.util.Scanner;

public class CalculateTheMarksOfStudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks");
        float marks=sc.nextFloat();
        if(marks>=90){
            System.out.println("your are pass with Grade A+");
        }
        else if(marks>=80){
            System.out.println("your are pass with grad A");
        }
         else if(marks>=70){
            System.out.println("your are pass with grad B+");
        }
         else if(marks>=60){
            System.out.println("your are pass with grad B");
        }
         else if(marks>=50){
            System.out.println("your are pass with grad C+");
        }
         else if(marks>=40){
            System.out.println("your are pass with grad C");
        }
        else{
            System.out.println("sorry you are fail");
        }
    }
}
