class TopVotedCandidate {
          static int []lead;
          static int time[];
    public TopVotedCandidate(int[] persons, int[] times) {
        int n=persons.length;
        this.time=times;
        lead=new int[n];
       int max=0;
       int curr=-1;
       int[]cnt=new int[5001];
       for(int i=0;i<n;i++){
        int a=persons[i];
        cnt[a]++;
        if(cnt[a]>=max){
            max=cnt[a];
            curr=a;
        }
        lead[i]=curr;
       }
    }
    
    public int q(int t) {
        int r=lowerBound(t,time);
        
        return lead[r];
        
    }
    public int lowerBound(int target,int[] arr){
        int lo=0;
        int high=arr.length-1;
        int ans=-1;
        while(lo<=high){
            int mid=lo+(high-lo)/2;
            if(arr[mid]<=target){
                ans=mid;
                lo=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */
