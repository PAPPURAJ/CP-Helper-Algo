    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length,c=matrix[0].length;
        int i=0,j=r*c-1,mid=(i+j)/2;

        while(i<=j){
            int cal=matrix[mid/c][mid%c];

            if(cal==target)
                return true;
            else if(cal<target)
                i=mid+1;
            else 
                j=mid-1;
           
            mid=(i+j)/2;
        }

        return false;
    }
