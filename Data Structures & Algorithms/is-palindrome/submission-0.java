class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-z0-9A-Z]", "").toLowerCase();

        int left = 0, right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            else{
            left++;
            right--;
            }
        }
        return true;
    }
}
