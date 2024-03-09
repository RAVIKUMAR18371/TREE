package Tree;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_Tree tree = new Binary_Tree();
        tree.populate(sc);
        tree.display();
        //tree.preetyDisplay();
        //tree.preOrder();
        //tree.postOder();
        //tree.inOrder();
    }

}
