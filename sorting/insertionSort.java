// worst and average time complexity o(n^2)
// best case o(n)
class main{
    public static void main(String[] args){
                for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j>0 && arr[j - 1] > arr[j]){
                int x = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = x;
                j--;
            }

        }

        System.out.println(Arrays.toString(arr));

    }
}