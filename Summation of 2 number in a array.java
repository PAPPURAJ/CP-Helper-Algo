public int[] binarySearch(int[] nums, int target) {
    int v,start=0,end=nums.length-1;
    while(start<=end){
        v=nums[start]+nums[end];
         if(v==target)
            return new int[]{start+1,end+1};
            //output 1 indexed value
        if(v>target)
            end--;
        else start++;    
    }
    return new int[]{};
}
