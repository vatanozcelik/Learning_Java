package JavaHomeWork;
import java.util.*;

public class Queue{
    private int elements[];//array to store the queue elements
    private int front;    // front points to front element in the queue
    private int last;     //last element in the queue
    private int capacity;
    private int count;    // current size of the queue
    //constructor
    Queue (int size){
        elements = new int[size];
        capacity = size;
        front = 0;
        last = -1;
        count = 0;
}
    //function to remove front element from the queue
    public void dequeue()
    {
        // check for queue if it is empty stop
        if (isEmpty())
        {
            System.out.println("\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Removing " );
            front = (front + 1) % capacity;
            count--;
        }
        //function to add an item to the queue
        public void enqueue(int item)
        {

            System.out.println("Inserting " + item);

            last = (last + 1) % capacity;
            elements[last] = item;
            count++;
        }
        //function to return the size of the queue
        public int size()
        {
            return count;
        }
        //function to check if the queue is empty or not
        public Boolean isEmpty()
        {
            return (size() == 0);
        }
        // Queue implementation in java
        public static void main(String []args){
            // create a queue of capacity 8
            Queue q = new Queue(8);

            //1 to 20 adding
            for(int i =1 ; i <=20 ; i++){
                q.enqueue(i);

            }
            int size=0;
            size =q.size();
            System.out.println("Queue size is " + size);

            for(int i =1 ; i <=20 ; i++){
                q.dequeue();

            }



            //check for is empty
            if (q.isEmpty())
                System.out.println("Queue Is Empty");
            else
                System.out.println("Queue Is Not Empty");
        }

    }

