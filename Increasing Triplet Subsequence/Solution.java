class Solution {
    public boolean increasingTriplet(int[] nums) {
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         for(int k=j+1; k<nums.length; k++){
        //             if((nums[i] < nums[j]) && (nums[j] < nums[k]) && (nums[i] < nums[k])){
        //                 return true;
        //             }else{
        //                 break;
        //             }
        //         }
        //     }

        // }
        int min=Integer.MAX_VALUE;
        int secondMin= Integer.MAX_VALUE;
        for(int i : nums){
            if(i <= min){
                min = i;
            }
            else if(i <= secondMin){
                secondMin=i;
            }else{
                return true;
            }
        }
        return false;
    }
}
