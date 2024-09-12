import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the maximum number of candies among the kids
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }
        
        // Create a result list to store the boolean values
        List<Boolean> result = new ArrayList<>();
        
        // Check for each kid if they can have the greatest number of candies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        
        return result;
    }
}
