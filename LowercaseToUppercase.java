package src;

public class LowercaseToUppercase
{
    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character)
    {
        // write your code here
        int upper = character - 'a' + 'A';

        return (char)upper;
    }

}
