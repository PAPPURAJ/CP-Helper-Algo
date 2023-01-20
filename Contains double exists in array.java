    public boolean checkIfExist(int[] arr) {
        TreeSet<Integer> tm=new TreeSet<>();
        for(int i:arr){
             if(tm.contains(i*2) || (i%2==0 && tm.contains(i/2)))
                return true;
             tm.add(i);
        }
        return false;   
        
    }
