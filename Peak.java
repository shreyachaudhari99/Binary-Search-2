// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int findPeakElement(int[] nums) {
        int start =0, end = nums.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            
            if((mid == 0 || nums[mid]>nums[mid-1]) && (mid == nums.length-1 || nums[mid]>nums[mid+1]))
                return mid;
            
            else if(nums[mid+1] > nums[mid])
                start = mid+1;
            
            else
                end = mid-1;
        }
        return -1;
    }
}