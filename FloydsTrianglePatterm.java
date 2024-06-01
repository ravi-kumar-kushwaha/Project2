import java.util.Scanner;

public class FloydsTrianglePatterm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any size whoes pattern you want to print");
        int size=sc.nextInt();
        int number=1;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(""+number+" ");
                number++;
            }
            System.out.println("");
        }
    }
}
