
class BST2 {
    class Node{
        int key;
        Node left,right;


        Node(int key ){
            this.key = key;
            this.left = this.right = null;
        }
    }

    private Node root;

    // EKLEME
    public void add(int key){
        root = addRec(root, key);
    }

    private Node addRec(Node root ,int key){
        if(root == null) return new Node(key);
        if(key < root.key ) root.left = addRec(root.left, key);
        else if (key> root.key) root.right = addRec(root.right, key);
        return root;
    }

    // SİLME
    public void delete(int key){
        root = deleteRec(root,key);
    }

    private Node deleteRec(Node root ,int key){
        if(root == null ) return null;
        if(key < root.key) root.left = deleteRec(root.left,key);
        else if (key > root.key) root.right = deleteRec(root.right,key);
        else{
            if(root.left == null) return root.right;
            if (root.right == null) return root.left;
            root.key = minValueRec(root.right);
            root.right = deleteRec(root.right,root.key);

        }
        return root;
    }

    // MİN BULMA
    public int minValue() {
        if (root == null) return -1;
        return minValueRec(root);
    }

    private int minValueRec(Node root){
        while( root.left != null ) root = root.left;
        return root.key;
    }


    // MAX BULMA
    public int maxValue() {
        if (root == null) return -1;
        return maxValueRec(root);
    }

    private Integer maxValueRec(Node root){
        while( root.right != null ) root = root.right;
        return root.key;
    }


    //SIRALI GÖSTERİM
    public void inOrderTraversal(){
        inOrderTraversalRec(root);
    }

    private void inOrderTraversalRec(Node root){
        if(root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.key + " ");
            inOrderTraversalRec(root.right);
        }
    }

    public static void main(String[] args) {
        BST2 bst = new BST2();
        bst.add(1);
        bst.add(222);
        bst.add(32);
        bst.add(44);
        bst.add(5);

        bst.inOrderTraversal();
        bst.delete(1);
        bst.inOrderTraversal();


    }
}

