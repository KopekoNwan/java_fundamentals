package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int strValue = str.length();

        String str2 = "hello";
        int str2Value = str2.length();
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual = strValue == str2Value;
        if(isEqual == true) {
            System.out.println("Both have the same length (true)");
        }else{
            System.out.println("Both have different length (false)");
        }


        // please concatenate str & str2 and set the result to a new String variable below
        String newStr = str + str2;
        System.out.println(newStr);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        int newStr2 = newStr.indexOf('!');
        System.out.println(newStr2);

    }


}