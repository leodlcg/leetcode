//https://leetcode.com/problems/roman-to-integer/

class Solution {
    public int romanToInt(String s) {
        
        int[] numbers = new int[s.length()];
        int resultado = 0;

        for(int i = 0; i < s.length(); i++){

            switch(s.charAt(i)){

            case 'I':
            numbers[i] = 1;
            break;

            case 'V':
            numbers[i] = 5;
            break;

            case 'X':
            numbers[i] = 10;
            break;

            case 'L':
            numbers[i] = 50;
            break;

            case 'C':
            numbers[i] = 100;
            break;

            case 'D':
            numbers[i] = 500;
            break;

            case 'M':
            numbers[i] = 1000;
            break;

            }
        }

        for(int i = 0; i < numbers.length; i++){

            if(i >= (numbers.length - 1)){
                resultado += numbers[i];
                break;
            }

            if(numbers[i] >= numbers[i + 1]){
                resultado += numbers[i];
            }else{
                resultado += (numbers[i + 1] - numbers[i]);
                i++;
            }

        }

        return resultado;

    }
}
