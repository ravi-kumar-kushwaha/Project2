import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of the array");
        int elements[]=new int[size];
        for(int i=0;i<size;i++){
            elements[i]=sc.nextInt();
        }
       System.out.println("enter the number which you want to search");
        int searchElement=sc.nextInt();
        for(int i=0;i<size;i++){
            if(searchElement==elements[i]){
                System.out.print("element is found at location:"+i);
            }
           }
         System.out.println();
    }
}
