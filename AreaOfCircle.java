import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radious of the circle");
        float radious=sc.nextFloat();
        float AreaOfCircle=22/7f*(radious*radious*radious);
        System.out.println("area of the circle is:"+AreaOfCircle);
    }
}
