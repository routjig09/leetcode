
// class Solution {

//     public int lengthOfLongestSubstring(String s) {

//         HashSet<Character> set = new HashSet<>();

//         int left = 0;
//         int max = 0;

//         for (int right = 0; right < s.length(); right++) {

//             while (set.contains(s.charAt(right))) {
//                 set.remove(s.charAt(left));
//                 left++;
//             }

//             set.add(s.charAt(right));
//             max = Math.max(max, right - left + 1);
//         }

//         return max;
//     }
// }


class Solution {

    public int lengthOfLongestSubstring(String s) {
        boolean[] seen = new boolean[256];
        int left = 0;
        int max = 0;
        for(int right = 0; right<s.length();right++){
            char ch = s.charAt(right);
            while(seen[ch]){
                seen[s.charAt(left)]=false;
                left++;
            }
            seen[ch]=true;
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}