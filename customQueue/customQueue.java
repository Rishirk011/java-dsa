package rishi.queue;
import rishi.queue.customQueue;

class main{
    public static void main(String[] args) throws Exception {
        char []arr = {'a','b','c','a','b','d','b','a'};
        int left = 0, right = 1;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[right] == arr[left]){

                res = 0;
                left++;

            }

            else{

                res++;
                right++;

            }

        }
        System.out.println(res);
    }
}