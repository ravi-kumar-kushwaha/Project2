import java.util.*;
public class FrequencyOfEachElemet{
    public static void CountFrequency(int arr[],int n){
        System.out.println("count the frequency of each elements");
        for(int i = 0;i<n;i++){
            int count = 1;
            for(int j=i+1;j<n;j++){
               if(arr[i]==arr[j]){
                count++;
                arr[j] = -1; //marked as visited frequency
            }
            }
            if(arr[i] != -1){
                System.out.println(arr[i] + "    "+count);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        CountFrequency(arr, n);
    }
}

        // enter the size of the array
        // 8
        // enter the elements of the array
        // 1
        // 4
        // 2
        // 1
        // 3
        // 2
        // 1
        // 4
        // count the frequency of each elements
        // 1    3
        // 4    2
        // 2    2
        // 3    1