class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack= new Stack<>();
        for(int i=0; i<asteroids.length; i++){
            if(stack.isEmpty() || asteroids[i] > 0){
                stack.push(asteroids[i]);    
        }else{
            while(!stack.isEmpty() && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(asteroids[i])){
                stack.pop();
            }
            if(!stack.isEmpty() && (-stack.peek() == asteroids[i] || stack.peek() == -asteroids[i])){
                stack.pop();
            }
            else if(stack.isEmpty() || (!stack.isEmpty() && stack.peek() < 0 && asteroids[i] < 0))
                stack.push(asteroids[i]);
        }
        }
        int[] result=new int[stack.size()];
        int s= stack.size()-1;
        while(!stack.isEmpty()){
            result[s--] = stack.pop();
        }
    return result;
}
}
