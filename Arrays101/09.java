class Solution {
    public boolean validMountainArray(int[] A) {
        
        if ( A.length < 3 ) return false ;
        
        int divider = 0 ;
        
        while ( divider < A.length - 1 && A[divider] < A[divider+1] ) divider++ ;
        
        if ( divider == 0 || divider == A.length - 1 ) return false ;
        
        divider++ ; 
        
        while ( divider > 0 && divider < A.length && A[divider] < A[divider-1]) divider++ ;
        
        if ( divider == A.length ) return true ;
        
        return false ;        
        
    }
}
