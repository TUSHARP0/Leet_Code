class Solution {
    public boolean isPalindrome(String s) {
        String sample = s.toLowerCase().replaceAll("[\\s\\p{Punct}]+","");
        StringBuilder sample2 = new StringBuilder(sample);
        String result = String.valueOf(sample2.reverse());
        if(sample.equals(result)){
            return true;
        }
        return false;
    }
}
