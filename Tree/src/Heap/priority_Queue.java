package Heap;
import java.util.Comparator;
import java.util.PriorityQueue;
public class priority_Queue {
    class student implements Comparable<student>{
        String name;
        int rank;

        student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
