public class BubbleSort {
    public static void printBubbleSort(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    // assending order
    public static void main(String[] args) {
        int array[]={19,9,12,8,3,6,5,1};
        for(int i=0;i<array.length;i++){
           for(int j=0;j<array.length-i-1;j++){
            if(array[j]>array[j+1]){
                int temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
           }
        }
        printBubbleSort(array);
       }
}
