//https://leetcode.com/problems/longest-common-prefix/

class Solution {

    public String longestCommonPrefix(String[] strs) {

    if(strs.length <= 1 || strs[0].equals("")){
        return strs[0];
    }

    String resultado = "";

    for(int i = 0; i < strs[0].length(); i++){

        char aux = strs[0].charAt(i);

        for(int j = 0; j < strs.length; j++){ 

        try{
            if(aux != strs[j].charAt(i)){
                return resultado;
            }
        }catch(StringIndexOutOfBoundsException e){
            return resultado;
        }
       
        }

        resultado = resultado + aux;

    }

    return resultado;

    }

}
