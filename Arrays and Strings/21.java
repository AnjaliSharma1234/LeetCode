class Solution {
    
    Map < Integer , int[] > dp = new HashMap <> () ;
    
    public int[] beautifulArray ( int N ) {
        if( dp.containsKey(N) ) return dp.get(N);
        int res[] = new int[N];
        if(N == 1){
            res[0] = 1 ; return res;
        }
        int index = 0;
        int left[] = beautifulArray((N+1)/2); 
        int right[] = beautifulArray(N/2);
        
        for( int i : left ) {
            
            res[index++]=i*2-1;
        }
        
        for( int i : right ) {
            
            res[index++]=i*2;
        }
        
        dp.put(N,res);
        
        return res;
    }
}
