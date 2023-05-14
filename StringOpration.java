package src;
import java.lang.reflect.Array;
import java.util.*;
public class StringOpration
{
    public static void main (String[] args)
    {
        String str1 = "This is a algorithm practise";
        System.out.println("str1 = "+str1);

        /*Search substring*/

        // Using indexOf() method
        System.out.println("\nSearch substring by using indexOf()");
        // search for the first character which ASCIICode is 97
        System.out.println("The first ASCIICode 97 is at index: " + str1.indexOf(97));
        // search for the first character a
        System.out.println("THe first 'a' is at index: " + str1.indexOf('a'));
        // search for first  character with ASCIICode 97 from index 9
        System.out.println("The first character with ASCIICode 97 from index 9 is at index: " + str1.indexOf(97,9));
        //search for character a from index 9
        System.out.println("The first character 'a' from index 9 is at index: " + str1.indexOf('a',9));
        //search for substring al
        System.out.println("The first substring \"al\" is at index: " + str1.indexOf("al"));
        //search for substring al from index 8
        System.out.println("From index 8, the first substring \"al\" is at index: " + str1.indexOf("al",8));


        // Using lastIndexOf() method
        System.out.println("\nSearch substring by using lastIndexOf() ");
        // search for the last character with ASCIICode 97
        System.out.println("The last character with ASCIICode 97 is at index: " + str1.lastIndexOf(97));
        // search for character a
        System.out.println("The last 'a' is at index: "  + str1.lastIndexOf('a'));
        // search for character's ASCIICode is 97 until index 9
        System.out.println("The last character with ASCIICode 97 from index 9 is at index: " + str1.lastIndexOf(97,9));
        //search for character a until index 9
        System.out.println("The last character 'a' from index 9 is at index: " + str1.lastIndexOf('a',9));
        // search for substring al
        System.out.println("The last substring \"al\" is at index: " + str1.lastIndexOf("al"));
        // search for substring al until  index 8
        System.out.println("From index 8, the last substring \"al\" is at index: " + str1.lastIndexOf("al",8));

        //Using contains() method
        System.out.println("\nCheck if a string contains any substring");
        System.out.println("str1 contains \"practise\": "+ str1.contains("practise"));
        System.out.println("str1 contains \"java\": "+ str1.contains("java"));

        System.out.println("\n"+"-".repeat(100)+"\n");

        /*Split, join and trim string */

        String str2 = "  Java,Python,C#,C++   ";
        System.out.println("str2 = "+str2);

        // Split string by ,
        System.out.println("\nSplit str2 by using \",\" :");
        String[] split = str2.split(",");
        for(String item : split)
        {
            System.out.println(item);
        }

        System.out.println("\nSplit str2 at most 3 parts by using \",\" :");
        String[] split2 = str2.split(",",3);
        for(String item : split2)
        {
            System.out.println(item);
        }

        // Join string with determined symbol
        System.out.println("\nSplit str2 with \",\" then join with \"->\" :");
        System.out.println(String.join("->",str2.split(",")));

        //Substring
        System.out.println("\nSubstring from index 6 is: "+ str2.substring(6));
        System.out.println("\nSubstring from index 6 to index 10 is: "+ str2.substring(6,10));

        // Trim empty space at the beginning and the end of the string
        System.out.println("\nDelete empty spaces at the beginning and the end of str2 :");
        System.out.println(str2.trim());

        System.out.println("\n"+"-".repeat(100)+"\n");

        /*Comparison */

        String str3 ="abc",str4 = "abc", str5 = new String("abc");
        System.out.println("str3 = "+ str3 + "\nstr4 = "+str4);
        System.out.println( "str5 = " + str5 + " (Created by new String(\"abc\"))");

        //Using "==" to compare reference
        System.out.println("\nCompare Strings by using \"==\" to compare reference ");

        // Same instances refer to same address
        System.out.println("\"abc\" == \"abc\" : " + ("abc" == "abc"));
        // str3 and str4 refer to same instance
        System.out.println("str3 == str4 : " + (str3 == str4));
        // str3 refer to an address of an instance, str5 refer to an address of an object
        System.out.println("str3 == str5 : " + (str3 == str5));
        // str3 and "abc" refer to same address
        System.out.println("str3 == \"abc\" : " + (str3 == "abc"));
        // str5 refer to an address of an object which is different than the address of "abc"
        System.out.println("str5 == \"abc\" : " + (str5 == "abc"));

        //Using equals() method to compare values
        System.out.println("\nCompare Strings by using equals() to compare values ");

        // str3 and str4 have same content
        System.out.println("str3.equals(str4) : " + str3.equals(str4));
        // str3 and str5 have same content
        System.out.println("str3.equals(str5) : " + str3.equals(str5));
        // str3 and "abc" have same content
        System.out.println("str3 == \"abc\" : " + str3.equals("abc"));
        // "abc" and str5 have same content
        System.out.println("\"abc\".equals(str5) : " + "abc".equals(str5));

        //Using compareTo() method to compare orders
        System.out.println("Compare Strings by using compareTo() method to compare orders");

        String str6 = "acd", str7 = "AcD";

        // return value > 0 : String 1 > String 2
        // return value == 0 : String 1 = String 2
        // return value < 0 : String 1 < String 2
        System.out.println("str3 compare with str6 : "+str3.compareTo(str6));
        System.out.println("str6 compare with str7 : "+str6.compareTo(str7));
        // Ignore letter's case
        System.out.println("str6 compare with str7 ignoring letter case: "+str6.compareToIgnoreCase(str7));

        System.out.println("\n"+"-".repeat(100)+"\n");

        /* Covert other type to String */

        int int1 = 32;
        long long1 =108L;
        float float1 = 15.6f;
        double double1 = 78.9;
        char char1 = 'e';
        boolean bool1 = false;
        System.out.println("int int1 = 32 \nlong long1 =108L \nfloat float1 = 15.6f \ndouble double1 = 78.9 \nchar char1 = 'e' \nboolean bool1 = false");

        // Using String.valueOf method
        System.out.println("\nCovert other type to String by using String.valueOf() method");
        String intStr1 = String.valueOf(int1);
        String longStr1 = String.valueOf(long1);
        String floatStr1 = String.valueOf(float1);
        String doubleStr1 = String.valueOf(double1);
        String charStr1 = String.valueOf(char1);
        String boolStr1 = String.valueOf(bool1);

        System.out.println("int1 to string : " + intStr1);
        System.out.println("long1 to string : " + longStr1);
        System.out.println("float1 to string : " + floatStr1);
        System.out.println("double1 to string : " + doubleStr1);
        System.out.println("char1 to string : " + charStr1);
        System.out.println("bool1 to string : " + boolStr1);


        // Adding empty string
        System.out.println("\nCovert other type to String by adding empty string");
        String intStr2 = "" + int1;
        String longStr2 = "" + long1;
        String floatStr2 = "" + float1;
        String doubleStr2 = "" + double1;
        String charStr2 = "" + char1;
        String boolStr2 =  "" + bool1;

        System.out.println("int1 + \"\" : " + intStr2);
        System.out.println("long1 + \"\" : " + longStr2);
        System.out.println("float1 + \"\" : " + floatStr2);
        System.out.println("double1 + \"\" : " + doubleStr2);
        System.out.println("char1 + \"\" : " + charStr2);
        System.out.println("bool1 + \"\" : " + boolStr2);

        System.out.println("\n"+"-".repeat(100)+"\n");

        /* Convert reference type to String */

        //Using toString() method will return object's address
        int[] arr = {1,2,3};
        Object obj = new Object();
        System.out.println("int[] arr = {1,2,3} \nObject obj = new Object()");

        System.out.println("\nConvert reference type to String by using toString() method");
        String arrStr = arr.toString();
        String objStr = obj.toString();
        System.out.println("arr.toString() return arr's address : " + arrStr );
        System.out.println("obj.toString() return obj's address : " + objStr );

        // Convert array to String by using Arrays.toString method
        System.out.println("\nConvert array to String by using Arrays.toString() method");
        System.out.println("arr.toString() return arr's address : " + Arrays.toString(arr) );

        // Convert char[] to String using String.valueOf() method
        System.out.println("\nConvert char[] to String");

        char[] chars = {'a','b','c','d'};
        String charStr = String.valueOf(chars);
        System.out.println("char[] chars = {'a','b','c','d'}\nchars to string : "+ charStr);

    }

}
