public class bai2 {
    static class Node {
        public int data;
        public Node parent;
        public Node left;
        public Node right;

        public boolean tempBool1; // Hai biến tạm kiểu boolean có thể dùng cho bất kỳ mục đích gì
        public boolean tempBool2;

        public int tempInt1; // Hai biến tạm kiểu int có thể dùng cho bất kỳ mục đích gì
        public int tempInt2;

        public Node tempNode1; // Hai biến tạm kiểu Node có thể dùng cho bất kỳ mục đích gì
        public Node tempNode2;

        public Node(int data, Node parent, Node left, Node right) {
            this.data = data;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }

    static public Node push(Node root, int n, int newValue) {
        Node newNode = new Node (newValue, null, null, null);
        if (root == null) return newNode;


        return null;

    }

    static public int getMax(Node root) {

        return 0;
    }
}
