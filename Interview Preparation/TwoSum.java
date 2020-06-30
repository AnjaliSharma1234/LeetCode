class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map < Integer , Integer > record = new HashMap <> () ;
        
        for ( int i = 0 ; i < nums.length ; i++ ) {
            int diff = target - nums[i] ;
            
            if ( record.containsKey( diff ) ) {  
                return new int[] { record.get(diff) , i } ;
            }
            
            record.put( nums[i] , i ) ;
        }
        
        return new int[0] ; 
    }
}
