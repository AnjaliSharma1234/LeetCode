class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int sum = 0 ;
        int left = 0 ;
        int min_length = Integer.MAX_VALUE ;
        
        for ( int i = 0 ; i < nums.length ; i++ ) {
            
            sum += nums[i];
            
            while ( sum >= s ) {
                min_length = Math.min( min_length , i + 1 - left ) ;
                sum -= nums[left] ;
                left++ ;
            }
        }
        
        return (min_length != Integer.MAX_VALUE) ? min_length : 0 ;
    }
}
