class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Set<Integer> nums = new HashSet() ;
        
        for ( int n : arr ) {
            
            if ( nums.contains( 2 * n ) || ( n % 2 == 0 && nums.contains( n / 2 )) ) {   
            return true ;
            }
            nums.add(n);
        }
        
        return false ;
        
    }
}
