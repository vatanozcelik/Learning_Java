package app;
class Queue{
    private int[] elements;
    private int size = elements.length;
    private int counter = 0;
    public Queue() {
        elements = new int[8];
    }
    public void enqueue(int element){
        elements[counter] = element;
        counter++;
    }
    public int dequeue() {
        int turn = elements[counter];
        elements[counter] = 0;
        counter--;
        return turn;
    }
    public boolean isempty(){
        if(counter != 0){
           throw new RuntimeException("neden boyle olduki!!! ");
        }
        return true;
    }
    public int getSize(){
        return elements.length;
    }

    private int size() {
    }

    private boolean isEmpty() {
    }
}
public class homeWork {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for(int i = 1;i <= 20; i = i + 1)
        {
            queue.enqueue(i);
        }
        int size = queue.getSize();
        System.out.println(" getsize of the queue: "+size);
        for(int i = 1;i <= 20; i = i + 1)
        {
            int donence = queue.dequeue();
            System.out.printf("%d\t",donence);
        }
        boolean TrueOrFalse = queue.isempty();
        System.out.println(TrueOrFalse);

    }
}
