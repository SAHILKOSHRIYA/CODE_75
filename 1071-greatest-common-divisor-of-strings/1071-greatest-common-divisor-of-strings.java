class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if str1 + str2 is equal to str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // No common divisor
        }
        
        // Find the greatest common divisor of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());
        
        // The gcd string will be the prefix of str1 up to the gcdLength
        return str1.substring(0, gcdLength);
    }
    
    // Helper function to compute the greatest common divisor (GCD) of two integers
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
