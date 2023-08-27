class Solution {
    public int compress(char[] chars) {
       int count=1;
       int write=0;
        for(int i=1; i <= chars.length; i++){
            if(i < chars.length && chars[i] == chars[i-1]){
                count++;
            }else{
                chars[write++]=chars[i-1];
                if(count > 1){
                    char[] countChars = String.valueOf(count).toCharArray();
                    for(char c: countChars){
                        chars[write++]=c;
                    }
                }
                count=1;
            }
        }
        return write;
    }
}
