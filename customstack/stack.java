class Main{
    public static void main(String[] args) throws Exception {

        customStack stack = new customStack();

        for (int i = 0; i <= 20; i++) {

            stack.push(i);

        }

        stack.push(21);
        stack.display();

        System.out.println("popped element: "+ stack.pop());
        System.out.println("peeked element: "+ stack.peek());

    }
}

public class customStack{

    private int[] data;

    //initial size of the stack
    private static final int size = 10;

    //pointer to add the element
    int ptr = -1;

    //declaring the size
    public customStack(){

        this.data = new int[size];

    }

    //adding new element to the stack
    public boolean push(int element){

        if(isFull()){

            int []temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;

        }
        ptr++;

        data[ptr] = element;

        return true;

    }

    //popping out an element
    public int pop() throws Exception{

        if(isEmpty()){
            throw new Exception("stack is empty!");
        }

        return data[ptr--];

    }

    public int peek() throws Exception{

        if(isEmpty()){

            throw new Exception("stack is empty!");

        }

        return data[ptr];

    }

    //to check if the stack is full
    public boolean isFull(){

        return ptr == data.length - 1;

    }

    //display all the elements in the stack
    public void display(){

        for (int i = 0; i <= ptr; i++) {

            System.out.print(data[i] + " ");

        }

        System.out.println();

    }


    //to check if the stack is empty
    public boolean isEmpty(){

      return ptr == -1;

    }

}
