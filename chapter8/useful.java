//GCD


public class useful
{
    
    public useful()
    {
        
        
    }
    
    
    public int gcd(int num1, int num2)
    {
        if (num2 <= num1 && (num1 % num2 == 0))
        {
            return num2;
        }
        else if (num1 < num2)
        {
            return gcd(num2,num1);
        }
        else
        {
            return gcd(num2, num1%num2);
        }
        
        
    }
    
    public boolean palindrome(String p)
    {
        if (p.charAt(0) == p.charAt(p.length()-1))
        {
            if (p.length() == 2 || p.length() == 1 )
            {
                return true;
            }
            return palindrome(p.substring(1,p.length()-1));
        }
        else
        {
            return false;
        }
        
    }
    

}
