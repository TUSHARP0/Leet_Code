class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result= new ArrayList<>();
        int maxCandy= Arrays.stream(candies).max().getAsInt();
        for(int i=0; i < candies.length; i++ ){
            if(candies[i]+extraCandies >= maxCandy){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
