//https://leetcode.com/problems/plus-one/
class Solution {
    public int[] plusOne(int[] digits) {

        int index = digits.length - 1;

        if(digits[index] != 9){

            digits[index] = digits[index] + 1;
            return digits;

        }else{

            while(digits[index] == 9){

                if(index == 0 && digits[index] == 9){
                    
                    int[] digitsNew = new int[digits.length + 1];
                    digitsNew[0] = 1;
                    return digitsNew;

                }

                index--;
                
                if(digits[index] != 9){

                    digits[index] = digits[index] + 1;
                    for(int i = index + 1; i < digits.length; i++){
                        digits[i] = 0;
                    }
                    return digits;

                }

            }

        }
        
        return digits;
    }
}
