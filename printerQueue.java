import javafx.print.Printer;

public class printerQueue {
    LinkList linkList = new LinkList();

    public void enQueue(String toAdd) {
        linkList.addLast(toAdd);
    }

    public boolean isEmpty() {
        if(linkList.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return linkList.size();
    }

    public String deQueue() throws PrinterQueueEmptyException {
        if(linkList.getFirst() == null) {
            PrinterQueueEmptyException exception = new PrinterQueueEmptyException("Trying to print an empty queue.");
            throw exception;
        }
        String output = linkList.getFirst().toAdd;
        linkList.removeFirst();
        return output;
    }

}
