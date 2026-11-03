//space complexity: o(1)
//time complexity: o(n)
class main{
    public static void main(String args[]){
        
        for(int i = arr.length - 1; i >=0; i--){
            int swap = 0;
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap += 1;
                }
            }
            System.out.println(swap);

            if(swap == 0){
                break;
            }
            
        }
        System.out.println("bubble sorted");

        System.out.println(Arrays.toString(arr));

    }

}