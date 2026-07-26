class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ind1 = 0, ind2 = numbers.length-1;
        int arr[] = new int[2];

        while(ind1 < ind2){
            int sum = numbers[ind1] + numbers[ind2];

            if(sum == target){
                arr[0] = ind1 +1;
                arr[1] = ind2+1;
                break;
            }
            else if(sum > target){
                ind2--;
            }
            else{
                ind1++;
            }
        }
        return arr;
    }
}
