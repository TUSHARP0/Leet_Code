class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals (str2+str1)){
            return "";
        }
       return str1.substring(0,gcd(str1.length(), str2.length()));
    }

    public int gcd(int num1, int num2){
        return num2 == 0 ? num1 : gcd(num2, num1%num2);
    }
}
