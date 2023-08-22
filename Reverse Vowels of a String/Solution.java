class Solution {
    public String reverseVowels(String s) {
        char[] arr= s.toCharArray();
        int start=0;
        int end= s.length()-1;
        while(start < end){
            if(!isVowel(arr[start])){
                start++;
            }
            else if(!isVowel(arr[end])){
                end--;
            }
            else{
                char t= arr[start];
                arr[start]=arr[end];
                arr[end]=t;
                start++;
                end--;
            }
           
        }
        String result= new String(arr);
         return result;
    }

    public boolean isVowel(char temp){
        if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o'|| temp == 'u' || temp == 'A'|| temp == 'E' || temp == 'I'|| temp == 'O' || temp == 'U'){
            return true;
        }
        return false;
    }
}
