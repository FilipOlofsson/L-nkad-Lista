public class LinkList {

    private Node first;

    public Node getFirst() {
        return this.first;
    }

    public LinkList() {
        first = null;
    }

    public void addLast(String toAdd) {
        if(first == null) {
            addFirst(toAdd);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(toAdd);
        }
    }

    public void addFirst(String toAdd) {
        Node temp = new Node(toAdd);
        temp.next = first;
        first = temp;
    }

    public void removeLast() throws PrinterQueueEmptyException {
        if(first == null) {
            PrinterQueueEmptyException exception = new PrinterQueueEmptyException("Linklist is empty.");
            throw exception;
        }
        if(first.next == null) {
            first = null;
        }
        Node temp = first;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void removeFirst() throws PrinterQueueEmptyException {
        if(first == null) {
            PrinterQueueEmptyException exception = new PrinterQueueEmptyException("Linklist is empty.");
            throw exception;
        }
        if(size() == 1) {
            first = null;
        } else {
            first = first.next;
        }
    }

    public int size() {
        if(first == null) {
            return 0;
        }
        int i = 1;
        Node temp = first;
        while(temp.next != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

    public boolean isEmpty() {
        if(first == null)
            return true;
        return false;
    }

    public String toString() {
        if(isEmpty()) {
            return null;
        }
        Node temp = first;
        String output = first.toAdd;
        while(temp.next != null) {
            output = output + " --> " + temp.next.toAdd;
            temp = temp.next;
        }

        return output;
    }

    class Node {

        Node next;

        String toAdd;

        public Node(String toAdd) {
            this.toAdd = toAdd;
            next = null;
        }

    }

}