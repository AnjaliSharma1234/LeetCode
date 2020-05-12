class Solution {
    public int[] replaceElements(int[] arr) {
        
        int[] temp = new int[arr.length];
        int max = -1 ;
        
        for ( int i = arr.length - 1 ; i >= 0 ; i-- ) {
            temp[i] = max;
            max = Math.max(max, arr[i]) ;
        }
        return temp ;
    }
}
