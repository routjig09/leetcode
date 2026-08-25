class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        for(char c : s.toCharArray()){
            result^=c;
        }
        for(char  c : t.toCharArray()){
            result^=c;
        }
        return result;
    }
}


// here i used XOR because in XOR all the element will cancel out and which char will left that will be the result 
//a^b^c^d^a^b^c^d^e = e (everything will cancel oiuu)/