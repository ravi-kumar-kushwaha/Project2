import java.util.Scanner;

public class InvertedHalfPyramidWithNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number whoes patten you want to print");
        int number=sc.nextInt();
        for(int i=number;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
/*
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
 */