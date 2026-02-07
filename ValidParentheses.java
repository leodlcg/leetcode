// https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {


        if(s.length() <= 1){
            return false;
        }

    int[] type = new int[s.length()];
    int aux = 0;

    for(int i = 0; i < s.length(); i++)

        switch(s.charAt(i)){

            case '(':

                if((i + 1) == s.length()){
                    return false;
                }

                type[aux] = 1;
                aux++;
                break;

            case '[':

                if((i + 1) == s.length()){
                    return false;
                }

                type[aux] = 2;
                aux++;
                break;

            case '{':   

                if((i + 1) == s.length()){
                    return false;
                }

                type[aux] = 3;
                aux++;
                break;

            case ')':

            try{

                if(type[aux - 1] == 1){
                    aux--;
                    break;
                }else{
                    return false;
                }

            }catch(ArrayIndexOutOfBoundsException e){
                return false;
            }

            case ']':

            try{

                if(type[aux - 1] == 2){
                    aux--;
                    break;
                }else{
                    return false;
                }

            }catch(ArrayIndexOutOfBoundsException e){
                return false;
            }

            case '}':

            try{

                if(type[aux - 1] == 3){
                    aux--;
                    break;
                }else{
                    return false;
                }

            }catch(ArrayIndexOutOfBoundsException e){
                return false;
            }

            default:
                return false;
        }

        if(aux > 0){
            return false; 
        }else{
            return true;
        }
    }

}
