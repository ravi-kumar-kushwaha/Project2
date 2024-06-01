import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of character ");
        int number=sc.nextInt();
        char alphabet='A';
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.println();
        }
    }
}
/*
 A
 B C
 D E F
 G H I J
 K L M N 0

 */
