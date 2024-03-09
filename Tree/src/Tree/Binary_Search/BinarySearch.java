package Tree.Binary_Search;

public class BinarySearch {
    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;

        }
        public int getValue(){
            return value;
        }
    }

    public Node Root;

    public BinarySearch() {

    }

    public int height(Node node) {// Empty tree = null then only node=null
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return Root == null;
    }

    public void insert(int value){
        Root = insert(value , Root);

    }
    public Node insert(int value , Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value , node.left);
        }
        if(value > node.value){
            node.right = insert(value , node.right);
        }
        node.height = Math.max(height(node.left) , height(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums){
        for(int i = 0; i < nums.length; i++){
            this.insert(nums[i]);
        }

    }

    public boolean balanced(){

        return balanced(Root);
    }
    public boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);

    }

    public void display() {
        display(this.Root, "Root Node: ");
   }

   public void display(Node node , String details){
        if(node == null){
         return;
        }
       System.out.println(details + node.value);

        display(node.left , "Left child of" +  node.getValue() + " : ");

       display(node.right , "Right child of" +  node.getValue() + " : ");
   }
}
