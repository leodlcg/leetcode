//https://leetcode.com/problems/range-sum-query-immutable/?envType=problem-list-v2&envId=design
class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        
        int acumulador = 0;
        for(int i = left ; i <= right ; i++){
            acumulador = acumulador + nums[i];
        }
        return acumulador;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
