package Heap;

import java.util.ArrayList;

public class MinHeap {
    static void heapSort(ArrayList<Integer> al){
        int n = al.size();
        for(int i = n/2;i>=0;i--){
            heapify(i , al);
        }

        //push the largest at the end
        for(int i = n-1;i>0;i--){
            int temp = al.get(0);
            al.set(i,al.get(0));
            al.set(0,al.get(i));

            heapify(i--,al);
        }

    }
   static void heapify(int index , ArrayList<Integer> al){
       int minindex = index;
       int left = 2*index+1;
       int right = 2*index+2;

       if(left<al.size() && al.get(minindex)>al.get(left)){
           minindex = left;
       }
       if(right < al.size() && al.get(minindex)>al.get(right)){
           minindex = right;
       }
       if(index != minindex){
           int temp = al.get(index);
           al.set(index , al.get(minindex));
           al.set(minindex , temp);

           heapify(minindex,al);
       }
       else{
           System.out.print(al+" ");
       }


    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(1);

        heapify(0 , al);
        System.out.println("The smallest element in heap "+al.get(0));
    }
}
