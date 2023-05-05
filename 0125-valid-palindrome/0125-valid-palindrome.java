class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        if(s.equals("") || s.length() == 1) return true;
        
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}