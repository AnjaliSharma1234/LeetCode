class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> a = new ArrayList <> () ;
        
        if ( rowIndex < 0 ) {
            return a ;
        }
        
        a.add(1) ;
        
            for ( int i = 1 ; i <= rowIndex ; i++) {
                for ( int j = a.size() - 2 ; j >= 0 ; j-- ) {
                    a.set( j + 1 , a.get(j) + a.get(j+1)) ;
                }
        a.add(1);
            }
            
        return a ;
        
    }
}
