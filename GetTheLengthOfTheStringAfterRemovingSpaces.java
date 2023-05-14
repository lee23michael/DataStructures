package src;

public class GetTheLengthOfTheStringAfterRemovingSpaces
{
    public int getLength(String str)
    {
        // write your code here
        String input = str.replace(" ", "");
        return input.length();
    }
}
