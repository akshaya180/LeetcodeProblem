class Solution {
    public int reverse(int x) {
        long sum=0;
        int digit=0;
        while(x!=0)

        {
            digit=x%10;
            sum=sum*10+digit;
            x=x/10;
            if(sum > 2147483647 || sum < -2147483648) // 32 bit interger range 
            {
                return 0;
            }
        }
        return (int)sum;
        
    }
}
