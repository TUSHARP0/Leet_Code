class Solution {
    public int compress(char[] chars) {
        int count=1;
        int index=0;
        for(int i=1; i<=chars.length;i++){
            while((i < chars.length) && (chars[i] == chars[i-1])){
                count++;
                i++;
            }
            chars[index++]=chars[i-1]; 
            if(count > 1){
                String s= String.valueOf(count);
                for(char a: s.toCharArray()){
                    chars[index++]=a;
                }
                count=1;
            }
        }
        return index;
    }
}
