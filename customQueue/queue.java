package rishi.queue;
import rishi.queue.customQueue;

class main{
    public static void main(String[] args) throws Exception {
        customQueue queue = new customQueue();

        for (int i = 0; i < 12; i++) {
            queue.insert(i);
        }

        queue.display();

        System.out.println(queue.front());
        
        System.out.println(queue.remove());

    }
}