class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int anslen=0;
        int[] dp=new int[10];
        for(int i=0;i<digits.length;i++){
              dp[digits[i]]++;;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=100;i<=998;i+=2){
            int[] temp=new int[10];
            int u=i%10,t=(i%100)/10,h=i/100;
            temp[u]++;
            temp[t]++;
            temp[h]++;
            if(temp[u]<=dp[u] && temp[t]<=dp[t] && temp[h]<=dp[h] ){
                res.add(i);
            }
            
        }
        int[] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
           ans[i]=res.get(i);
        }
        return ans;
    }
}
