public int binarySearch(int[] nums, int target,int start, int end) {
  while(start<=end){
      int mid=(start+end)/2;
       if(nums[mid]==target)
          return mid;
      if(nums[mid]>target)
          end=mid-1;
      else start=mid+1;    
  }
  return Integer.MIN_VALUE;
}
