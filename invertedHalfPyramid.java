import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int number=sc.nextInt();
        for(int i=number;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.println(i);
            }
            System.out.println(" ");
        }
    }
}
