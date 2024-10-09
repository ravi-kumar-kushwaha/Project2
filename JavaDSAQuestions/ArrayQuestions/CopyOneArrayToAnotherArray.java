import java.util.Scanner;
//Program to copy all elements of one array into another array
public class CopyOneArrayToAnotherArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        System.out.println("enter the element of the array");
        int arr1[] = new int[n];
       
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        int arr2[] = new int[n];
        for(int i=0;i<n;i++){
           arr2[i] = arr1[i];
        }
        System.out.println("arr1 is:");
        for(int i=0;i<arr1.length;i++){
           System.out.print(arr1[i]+" ");
         }
         System.out.println("arr2 is:");
         for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
          }
    }
}
        // Enter the size of the array
        // 5
        // enter the element of the array
        // 1
        // 2
        // 3
        // 4
        // 5
        // arr1 is:
        // 1 2 3 4 5 
        // arr2 is:
        // 1 2 3 4 5