// Time complexity - O(log n)
//Space - O(1)
// Leetcode run -yes

public class FindMinInRotatedArray {
    
        public int findMin(int[] nums) {
            if (nums == null || nums.length == 0) return 0;
            int n = nums.length;
            int low = 0;
            int high = n-1;
            
            while (low <= high){
                if (nums[low] <= nums[high]) return nums[low];
                int mid = low + (high-low)/2;
                if ((mid == n-1 || nums[mid] < nums[mid+1]) && 
                (mid == 0 || nums[mid] < nums[mid-1])){
                    return nums[mid];
                }else if (nums[low] <= nums[mid]){ // left is sorted, 
                    low = mid +1;
                } else {
                    high = mid -1;
                }
            }
            return -1;
        }
    }