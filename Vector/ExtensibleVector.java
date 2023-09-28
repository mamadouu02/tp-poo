public class ExtensibleVector {
    
    private Node head = null;
    private Node queue = null;
    private int size = 0;

    private static class Node {

        private Rational data;
        private Node next = null;

        private Node(Rational r) {
            this.data = new Rational(r);
        }
    }

    public String toString() {
        Node node = this.head;

        if (node == null) {
            return "( )";
        }
        
        String s = "";

        while (node.next != null) {
            s += node.data.toString() + ", ";
            node = node.next;
        }

        return "( " + s + node.data.toString() + " )";
    }

    public Rational get(int i) {
        if (i >= this.size) {
            throw new IndexOutOfBoundsException();
        }

        Node node = this.head;

        for (int j = 0; j != i; j++) {
            node = node.next;
        }

        return new Rational(node.data);
    }

    public void append(Rational r) {
        this.size++;

        if (this.queue != null) {
            this.queue.next = new Node(r);
            this.queue = this.queue.next;
        } else {
            this.head = new Node(r);
            this.queue = this.head;
        }
    }

    public int getDimension() {
        return this.size;
    }
}
