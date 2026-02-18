//https://leetcode.com/problems/merge-sorted-array/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //Adiciona no array
        int acumulador  = 0;
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] == 0){
                if(acumulador == n){
                   break; 
                }
                nums1[i] = nums2[acumulador];
                acumulador++;
            }
        }

        //Ordena o array
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - 1 - i; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }
}
