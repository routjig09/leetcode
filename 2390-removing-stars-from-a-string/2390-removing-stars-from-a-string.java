class Solution {
    public String removeStars(String s) {

        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '*') {
                result.deleteCharAt(result.length() - 1);
            } 
            else {
                result.append(s.charAt(i));
            }
        }

        return result.toString();

        // Stack<Character> st = new Stack<>();
        // for(int i = 0;i<s.length();i++){
        //     if(s.charAt(i) == '*'){
        //         st.pop();
        //     }else{
        //         st.push(s.charAt(i));
        //     }
        // }
        // StringBuilder res = new StringBuilder();
        // while(!st.isEmpty()){
        //     res.append(st.pop());
        // }
        // res.reverse();
        // return res.toString();

        
    }
}