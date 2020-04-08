class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length ;
        int[] m = new int [nums.length] ;
        
        for ( int i = 0 ; i < nums.length ; i++ ) {
            
            m[k] = nums[i] ;
            
            k++ ;
            if ( k > nums.length - 1 ) {
                k = 0 ;
            }
            
        }
        
        for ( int i = 0 ; i < nums.length ; i++ ) {
            
            nums[i] = m[i];
        }
    }
}
