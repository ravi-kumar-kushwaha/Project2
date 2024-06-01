import java.util.Scanner;

public class SumOfTheElementsOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of the array");
        int elements[]=new int[size];
        for(int i=0;i<size;i++){
            elements[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+elements[i];
            System.out.println("sum of elements of the array is"+sum);
            
        }
        System.out.println("average of all the elements of the array is:"+sum/size);
    }
}
