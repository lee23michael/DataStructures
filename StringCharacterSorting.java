package src;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCharacterSorting
{
    /**
     * @param str: Arbitrary non-empty string
     * @return String in alphabetical ascending order
     */
    public String handle(String str)
    {
        // write your code here
        char[] chararry = str.toCharArray();
        Arrays.sort(chararry);

        return String.valueOf(chararry);
    }
}
