public class ValiedPalindrome
{
    public static void main(String[] args)
    {

    }
    public boolean isPalindrome(String str)
    {
        // set all character to lower case
        str = str.toLowerCase();

        // set start and end point of a string
        int start = 0, end = str.length()-1;

        // compare start and end characters
        while(start < end)
        {
            char ch1 = str.charAt(start);
            char ch2 = str.charAt(end);

            // ignore special character
            if(!Character.isLetterOrDigit(ch1))
            {
                start++;
                continue;
            }

            if(!Character.isLetterOrDigit(ch2))
            {
                end++;
                continue;
            }


            if(ch1 != ch2)
            {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}