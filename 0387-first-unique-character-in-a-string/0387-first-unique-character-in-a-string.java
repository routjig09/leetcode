// class Solution {
//     public int firstUniqChar(String s) {
//         // String s = "leetcode";
//         for(int i = 0; i<s.length();i++){
//             int count = 0;
//             for(int j = 0;j<s.length();j++){
//                 if(s.charAt(i) == s.charAt(j)){
//                     count++;
//                 }
//             }
//             if(count == 1){
//                 // System.out.println(s.charAt(i));
//                 return i;
//             }
//         }
//         // System.out.println(-1);
//         return -1;

//     }
    
// }

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;  
            }
        }

        return -1;  
    }
}
