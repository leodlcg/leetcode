//https://leetcode.com/problems/length-of-last-word/
class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.strip(); // Tira os espacos desnecessarios.
 
        String resultado = s.substring((s.lastIndexOf(" ") + 1), s.length()); //Armazena exatamente a ultima palavra.

        return resultado.length(); //Retorna o tamanho da palavra.
    }
}
