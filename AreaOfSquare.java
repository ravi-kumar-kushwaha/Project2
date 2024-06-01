import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the side of the square");
        float side=sc.nextFloat();
        float Area=side*side;
        System.out.println("Area of the Square is:"+Area);
    }
}
