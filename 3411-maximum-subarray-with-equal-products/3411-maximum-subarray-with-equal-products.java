class Solution {
    public int maxLength(int[] nums) {
        int l=0;
        int p,lcm,gcd;
        for(int i=0;i<nums.length-1;i++){
            p=nums[i];
            lcm=nums[i];
            gcd=nums[i];
            if(lcm*gcd==p) l=Math.max(l,1);
            for(int j=i+1;j<nums.length;j++){
                p*=nums[j];
                lcm=find_lcm(lcm,nums[j]);
                gcd=find_gcd(gcd,nums[j]);
                if(lcm*gcd==p) l=Math.max(l,j-i+1);
            }
        }
        return l;
    }
    int find_lcm(int a,int b){
        return (a*b)/find_gcd(a,b);
    }
    int find_gcd(int a,int b){
        if(b>a){
            int t=a;
            a=b;
            b=t;
        }
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
}