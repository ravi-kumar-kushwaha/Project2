import java.util.Scanner;

public class CopyTheElementsOftheOneArraytoAnotherArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of the array");
        int elements[]=new int[size];
        int elements2[]=new int[size];
        for(int i=0;i<size;i++){
            elements[i]=sc.nextInt();
            // elements2[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
           elements2[i]=elements[i];
           }
           for(int i=0;i<elements2.length;i++){
         System.out.println("elements of the array2 is"+elements2);
        }
    }
}
