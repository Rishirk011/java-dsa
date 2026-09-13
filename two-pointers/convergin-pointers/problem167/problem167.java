/*

space complexity - O(1)
uses start and end regardless of the array's size

time complexity - O(N)
processes each of the N elements once in the worst case

*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int start = 0;
        int end = numbers.length - 1;

        while(start < end){

            int sum = numbers[start] + numbers[end];

            if(sum == target){
                return new int[]{start + 1, end + 1};
            }

            else if(sum > target){
                end--; 
            }

            else{
                start++;
            }                

        }

        return new int[]{-1,-1};

    }
}