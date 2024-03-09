package Heap;
import java.util.ArrayList;
public class insertinHeap {
    static void swap(int x,int y){
        int temp = x;
         x = y;
         y = temp;
    }
    static void add(int data, ArrayList<Integer> al){
        al.add(data);
    //    for(int i = 0;i<al.size();i++) {
            int x = al.size()-1;
            int par = (x-1)/2;
        //    int par = al.indexOf(al.get((x-1)/2));
            while (al.get(x) < al.get(par)){
               int temp = al.get(x);
               al.set(x , al.get(par));
               al.set(par , temp);

      //      }

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        add(2,al);
        add(3,al);
        add(4,al);
        add(5,al);
        add(10,al);
        add(1,al);

        System.out.println(al);



        }
    }

