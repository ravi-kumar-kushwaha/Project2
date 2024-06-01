import java.util.Scanner;

public class MinimumElementOfTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the araray");
        int size=sc.nextInt();
        System.out.println("enter the elements of the array");
        int elements[]=new int[size];
        for(int i=0;i<size;i++){
            elements[i]=sc.nextInt();
        }
        int minimum=elements[0];
        for(int i=0;i<size;i++){
            if(elements[i]<minimum){
                minimum=elements[i];
            }
        }
        System.out.println("minimum element of the array is:"+minimum);
    }
}
