//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int k = 1;
        int aux = nums[0];

        for(int i = 0; i < nums.length; i++){

            if(aux != nums[i]){
                aux = nums[i];
                nums[k] = aux;
                k++;
            }

        }

    return k;

    }

}
