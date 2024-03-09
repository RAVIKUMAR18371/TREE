package Heap;

public class slidingWindow_usingArray {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i = 0;i<arr.length-k;i++){
            int M = 0;
            for(int m = i;m<i+3;m++){
                M = Math.max(arr[m],arr[m+1]);
            }
            System.out.print(M+" ");
        }
    }
}
