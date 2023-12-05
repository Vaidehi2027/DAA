import java.util.*;
import java.math.BigDecimal;
public class Daa_assignment2{
    public static void main(String[] args){
        int [] arr = {6,3,9,5,2,8};
        long starttimemerge = System.nanoTime();
        merge_sort(arr);
        long endtimemerge = System.nanoTime();
        double totaltime = (endtimemerge - starttimemerge) / (double) (1000000);
        System.out.println("The total time taken is : " + BigDecimal.valueOf(totaltime).toPlainString() + " ms");


    }
    public static int[] merge_sort(int [] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int [] left = merge_sort(Arrays.copyOfRange(arr,0,mid));
        int [] right = merge_sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[]left,int[]right){
        int[] result = new int [left.length + right.length];
        int i = 0;
        int j=0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                result[k] = left[i];
                i++;
            }
            else{
                result[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length){
            result[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
    // public static void quick_sort(int []arr, int low, int high){
    //     if(low >= high){
    //         return;
    //     }
    //     int start = low;
    //     int end = high;
    //     int mid = start + (end-start)/2;
    //     int pivot = arr[mid];

    //     while(start <= end){
    //         while(arr[start] < pivot){
    //             start ++;
    //         }
    //         while(arr[end] > pivot){
    //             end--;
    //         }
    //         if(start <= end){
    //             int temp = arr[start];
    //             arr[start] = arr[end];
    //             arr[end] = temp;
    //             start++;
    //             end--;
    //         }
    //     }
    //     quick_sort(arr,low,end);
    //     quick_sort(arr,start,high);
    // }

}