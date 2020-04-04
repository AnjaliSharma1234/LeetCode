class Solution {
    public int dominantIndex(int[] nums) {
       int largest = nums[0];
        boolean flag = true; 
        int index = 0;

        //find largest number
        for ( int i = 0 ; i < nums.length ; i++ )  {
            if ( nums[i] > largest ) {
                largest = nums[i];
                index = i;
            }
        }
        //check the condition
        for ( int i = 0 ; i < nums.length ; i++) {
            if ( i != index && largest  < (2 * nums[i])) {
                flag = false;
            }
        }
        if(flag) {
            return index;
        } else {
            return -1;
        } 
    }
}
