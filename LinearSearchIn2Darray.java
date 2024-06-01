import java.util.Scanner;

public class LinearSearchIn2Darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row of the 2D array");
        int row=sc.nextInt();
        System.out.println("enter the size of column of the 2D array");
        int column=sc.nextInt();
        System.out.println("enter the elements of the 2D array");
        int elements[][]=new int[row][column];
        for(int i=0;i<row;i++){
               for(int j=0;j<column;j++){
                elements[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elemeents which you want to search");
        int searchElement=sc.nextInt();
        for(int i=0;i<row;i++){
               for(int j=0;j<column;j++){
               if(elements[i][j]==searchElement){
                System.out.println("element is found at location:"+ i + " " + j);
               }
            }
        }
    }
}
