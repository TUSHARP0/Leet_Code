class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<String>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                stack.pop();
            }else{
                char sample = s.charAt(i);
                stack.push(String.valueOf(sample));
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return String.valueOf(sb.reverse());
    }
}
