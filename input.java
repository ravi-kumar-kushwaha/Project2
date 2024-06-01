import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        // String name=sc.next(); 
        // System.out.println("your name is:"+name);
        String name=sc.nextLine();
        System.out.println("your name is:"+name);
        float price=sc.nextFloat();
        System.out.println(price);
    }
}
