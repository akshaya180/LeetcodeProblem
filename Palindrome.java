class Solution {
    public boolean isPalindrome(int x) {

        int sum=0,digit=0;
        int original=x;
        while(x>0)
        {
             digit=x%10;
             sum=sum*10+digit;
              x=x/10;
            

        }
        if(original==sum)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
