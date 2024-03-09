package Tree;
import java.util.Scanner;

public class Binary_Tree {

       static class Node{
            int value;
            Node Left;
            Node Right;

            public Node(int value){
                this.value = value;
            }
        }

        public Node Root;

        public void populate(Scanner sc){
            System.out.println("Enter the Root Node: ");
            int value = sc.nextInt();
            Root =  new Node(value);
            populate(sc , Root);
        }

        private void populate(Scanner sc , Node node){//-> Node node = new Node(value).
            System.out.println("Do you want to enter left of " + node.value);
            boolean left = sc.nextBoolean();
            if(left){
                System.out.println("Enter the value of the Left of: "+ node.value);
                int value = sc.nextInt();
                node.Left = new Node(value);
                populate(sc , node.Left);
            }

            System.out.println("Do you want to enter right of: " + node.value);
            boolean right = sc.nextBoolean();
            if(right){
                System.out.println("Enter the value of the right of: "+ node.value);
                int value = sc.nextInt();
                node.Right = new Node(value);
                populate(sc , node.Right);

            }
        }

        public void display(){
            display(Root , " ");
        }

        public void display(Node node, String indent){
            if(node == null){
                return;
            }
            System.out.println(indent + node.value);
            display(node.Left , indent + "\t");
            display(node.Right ,  indent + "\t");
        }
        /*
        public void preetyDisplay(){
            preetyDisplay(Root , 0);
        }

        public void preetyDisplay(Node node , int level){
            if(node == null){
                return;
            }

            preetyDisplay(node.Right , level + 1);

            if(level != 0){
                for(int i = 0; i < level - 1; i++){
                    System.out.println("|\t\t");
                }
                System.out.println("|-------->" + node.value);
        } else {
                System.out.println(node.value);
            }
            preetyDisplay(node.Left , level + 1);
            }

         */

      public void preOrder(){
          preOrder(Root);
      }

      public void preOrder(Node node){
          if(node == null){
              return;
          }
          System.out.println(node.value + " "); // node value getting printed
          //Node-->Left-->Right
          preOrder(node.Left);
          preOrder(node.Right);
      }

    public void inOrder(){
        preOrder(Root);
    }

    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.Left);
        System.out.println(node.value + " "); // node value getting printed
        //Left-->Node-->Right
        inOrder(node.Right);
    }

    public void postOrder(){
        postOrder(Root);
    }

    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.Left);
        postOrder(node.Right);
        System.out.println(node.value + " "); // node value getting printed
        //Left-->Right-->Node

    }

    }





