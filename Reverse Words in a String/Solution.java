class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ",0);
        Collections.reverse(Arrays.asList(arr));
        return String.join(" ", arr).replaceAll("\\s+"," ").trim(); 
    }
}
