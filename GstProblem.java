import java.util.Scanner;

public class GstProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the cost of a pencil");
        float costOfPencil=sc.nextFloat();
        System.out.println("enter the cost of a pen");
        float costOfPen=sc.nextFloat();
        System.out.println("enter the cost of a eraser");
        float costOfEraser=sc.nextFloat();
        float Gst=(costOfPencil+costOfPen+costOfEraser)*18/100;
        float Total_cost=(costOfPencil+costOfPen+costOfEraser)+Gst;
        System.out.println("Total cost of the item Back to the user as their bill is:"+Total_cost);
    }
}
