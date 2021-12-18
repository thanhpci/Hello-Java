public class BinaryTree<Key> {

    private final Key key;
    public BinaryTree<Key> right;
    public BinaryTree<Key> left;


    public BinaryTree(Key key) {
        this.key = key;
    }

    public BinaryTree(Key key, BinaryTree<Key> left, BinaryTree<Key> right) {
        this(key);
        this.left = left;
        this.right = right;
    }

    private void traversePostOrder() {  //left right parent
        if (left != null) left.traversePreOrder();
        if (right != null) right.traversePreOrder();
        System.out.print(this + " ");
    }

    private void traverseInOrder() {    //left parent right
        if (left != null) left.traversePreOrder();
        System.out.print(this + " ");
        if (right != null) right.traversePreOrder();
    }

    private void traversePreOrder() {   //parent left right
        System.out.print(this + " ");
        if (left != null) left.traversePreOrder();
        if (right != null) right.traversePreOrder();
    }

    public int count() {
        int leftCount = left == null ? 0 : left.count();
        int rightCount = right == null ? 0 : right.count();
        return 1 + leftCount + rightCount;
    }

    public int Height() {
        int leftHeight = left == null ? -1 : left.Height();
        int rightHeight = right == null ? -1 : right.Height();
        return 1 + Math.max(leftHeight , rightHeight);
    }

    public boolean contains(Key key) {
        return key.equals(this.key) ||
                (left != null && left.contains(key)) ||
                (right != null && right.contains(key));
    }

    public String toString() {
        return key.toString();
    }

    public static void main(String[] args) {
        BinaryTree<String> d = new BinaryTree<>("D");
        BinaryTree<String> e = new BinaryTree<>("E");
        BinaryTree<String> f = new BinaryTree<>("F");
        BinaryTree<String> g = new BinaryTree<>("G");
        BinaryTree<String> b = new BinaryTree<>("B", d, e);
        BinaryTree<String> c = new BinaryTree<>("C", f, g);
        BinaryTree<String> a = new BinaryTree<>("A", b, c);
        System.out.println(a);
//        a.traversePreOrder();   //parent left right
//        a.traverseInOrder();    //left parent right
//        a.traversePostOrder();   //left right parent
        System.out.println(a.contains("B"));
        System.out.println(b.Height());
    }


}
