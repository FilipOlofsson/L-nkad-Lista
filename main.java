public class main {
    public static void main(String[] args) {
        printerQueue printerQUeue = new printerQueue();

        try {
            printerQUeue.deQueue();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
