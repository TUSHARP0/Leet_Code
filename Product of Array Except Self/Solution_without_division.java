class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result= new int[nums.length];
        int leftprod=1;
        for(int i=0; i < nums.length; i++){
            result[i]=leftprod;
                leftprod*=nums[i];
                
        }
        int rightprod=1;
        for(int i=nums.length-1;i>=0; i--){
            result[i]*=rightprod;
            rightprod*= nums[i];
        }
       
        return result;
    }
}
