//https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {


        String aux = String.valueOf(x);
        String invertida = "";

        for(int i = aux.length(); i >= 1; i--){
                invertida += aux.charAt(i - 1);
        }
        return (aux.equals(invertida)) ? true : false;
    }

}
