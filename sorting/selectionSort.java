//space complexity: o(1)
//time complexity: o(n^2)
class main{

    public static void main(String args[]){
        int arr[] = {10,9,8,7,6,5,4,3,2,1};

        for(int i =0; i < arr.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}