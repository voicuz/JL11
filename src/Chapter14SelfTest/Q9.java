package Chapter14SelfTest;

/* Using the program from Try This 14-1, create a lambda expression that removes all spaces from a string
and returns a result. Demonstrate this method by passing it to changeStr();
 */

interface StringFunc {
    String func(String str);
}

class Q9 {
    /* This method has a functional interface as the type of its first parameter.
Thus, it can be passed a reference to any instance of that interface, including an
instance created by a lambda expression. The second parameter specifies the string to operate on.
 */
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        // Define a lambda expression that removes spaces of a string
        // and assign it to a StringFunc reference variable.
        StringFunc noSpace = (str) -> {
            String result = "";

            for(int i = 0; i <= str.length()-1; i++)
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);

            return result;
        };

        // Pass no-space string to the first argument to changeStr().
        // Pass the input string as the second argument.
        outStr = changeStr(noSpace, inStr);
//        outStr = reverse.func(inStr);
        System.out.println("The string with no space: " + outStr);
    }
}
