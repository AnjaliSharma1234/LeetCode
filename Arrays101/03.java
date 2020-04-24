class Solution {
    public int[] sortedSquares(int[] A) {
        
        int[] arr = new int[A.length] ;
        
        for ( int i = 0 , j = A.length - 1 , k = A.length - 1 ; k >= 0 ; k-- ) {
            
            arr[k] = A[i] * A[i] > A[j] * A[j] ? A[i] * A[i++] : A[j] * A[j--] ;
        }
        
        return arr;
    }
}
