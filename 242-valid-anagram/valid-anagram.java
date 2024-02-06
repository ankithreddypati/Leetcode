class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int i : counts) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}


//Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

// class Solution {
//     public boolean isAnagram(String s, String t) {
        
//         if(s.length()!=t.length()){
//             return false;
//         }

//         HashMap <Character, Integer> counts = new HashMap <>();
//             for (int i=0; i< s.length();i++){
//                 counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i),0)+1 );
//                 counts.put(t.charAt(i), counts.getOrDefault(t.charAt(i),0)-1 );

//             } 
//             for (char c: counts.keySet()){
//                 if (counts.get(c) !=0){
//                     return false;
//                 }
//             }

//             return true;
//             }
// }