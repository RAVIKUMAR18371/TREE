package Heap;
import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;
public class KthLargestHEap {
    static void kthLar(int[] arr){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int k = 3;
        //create min heap
        for(int i= 0;i<k;i++){
            pq.add(arr[i]);
        }
        System.out.print(pq);
        System.out.println();
        for(k = 3;k<arr.length;k++){
            if(pq.peek() > arr[k]){
                pq.remove();
                pq.add(arr[k]);
                System.out.print(pq);
                System.out.println();




            }
        }
        System.out.println("the third largest element "+pq.peek());
    //    heapify(arr,pq);
      //  PriorityQueue<PriorityQueue> queue = new  PriorityQueue<>();
       // System.out.println("The kth largest element "+queue.add(pq));
    }
    static void heapify(int[] arr , PriorityQueue<Integer> pq){
        int minindex = 0;
        int left = 2*minindex+1;
        int right = 2*minindex+2;

        if(minindex<3 && arr[minindex]>arr[left]){
            minindex = left;
        }
        if(minindex<3 && arr[minindex]>arr[right]){
            minindex = right;
        }

        if(minindex != 0){
            int temp = arr[0];
            arr[0] = arr[minindex];
            arr[minindex] = arr[0];
        }

    }
    public static void main(String[] args) {
     int[] arr = {5,7,2,4,8,9};
     kthLar(arr);
    }
}
