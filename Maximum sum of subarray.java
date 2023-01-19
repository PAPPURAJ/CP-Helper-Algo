    public int KadanesAlgorithm(int[] nums) {
        int maxSum=Integer.MIN_VALUE,curSum=0;

        for(int i:nums){
            maxSum=Math.max(maxSum, (curSum+=i)<0?0:curSum);
            if(curSum<0)
                curSum=0;    
        }
        return maxSum;    
    }
