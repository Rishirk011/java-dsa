package rishi.queue;


public class customQueue{

    public int []data;
    public int ptr = 0;
    private static int size = 10;

    public customQueue(){
        this.data = new int[size];
    }

    public boolean insert(int ele){

        if (isFull()){

            int []temp = new int[data.length * 2];

            for (int i = 0; i < ptr; i++) {
                temp [i] = data[i];
            }

            data = temp;

        }

        data[ptr++] = ele;

        return true;

    }

    public int remove() throws Exception{

        if(isEmpty()){
            throw new Exception("queue is empty");
        }

        for (int i = 1; i < ptr - 1; i++) {

            data[i-1] = data[i];

        }

        ptr--;

        return data[0];


    }

    public int front() throws Exception {
        
        if (isEmpty()){
            throw new Exception("queue is empty!");
        }
        
        return data[0];
    }
    
    public void display(){

        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i] + " ");
        }

    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

}


