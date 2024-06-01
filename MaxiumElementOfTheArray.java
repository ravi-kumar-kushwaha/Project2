import java.util.Scanner;

public class MaxiumElementOfTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the Array");
        int size=sc.nextInt();
        System.out.println("enter the elements of the Array");
        int elements[]=new int[size];
        int max=elements[0];
        for(int i=0;i<size;i++){
            elements[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(elements[i]>max){
                max=elements[i];
            }
        }
         System.out.println("maxium elements of the array is"+max);
    }
}
