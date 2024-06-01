import java.util.Scanner;
public class BubbleSort2 {
    public static void printBubbleSort(int numbers[], int size){
        for(int i=0;i<size;i++){
               System.out.println(numbers[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
       int size=sc.nextInt();
        System.out.println("enter the elements of the array");
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(numbers[j+1]>numbers[j]){
                    int temp=numbers[j+1];
                    numbers[j+1]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        printBubbleSort(numbers,size);
    }
}
