import java.util.Scanner;

public class linearSearch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Array[]={3,2,6,7,4,5};
        System.out.println("enter the number which you want to search");
        int num=sc.nextInt();
        for(int i=0;i<Array.length;i++){
            if(Array[i]==num){
                System.out.println("element is found at location:"+i);
            }
        }
        /* Another method for linear search */
        // int size=sc.nextInt();
        // int numbers[]=new int[size];
        // for(int i=0;i<size;i++){
        //     numbers[i]=sc.nextInt();
        // }
        // System.out.println("enter the element which you want to search");
        // int x=sc.nextInt();
        // for(int i=0;i<size;i++){
        //     if(numbers[i]==x){
        //     System.out.println("x is found at index:"+i);
        // }
        // }
    }
}
