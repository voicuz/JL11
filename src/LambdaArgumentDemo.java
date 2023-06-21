
interface StringFunc {
    String func(String str);
}

class LambdaArgumentDemo {
    /* This method has a functional interface as the type of it's first parameter.
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

        // Define a lambda expression that reverse the contents of a string
        // and assign it to a StringFunc reference variable.
        StringFunc reverse = (str) -> {
            String result = "";

            for(int i = str.length()-1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        // Pass reverse to the first argument to changeStr().
        // Pass the input string as the second argument.
//        outStr = changeStr(reverse, inStr);
        outStr = reverse.func(inStr);
        System.out.println("The string reversed: " + outStr);


        // This lambda expression replaces spaces with hypens.
        // It is embedded directly into the call to changeStr().
        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("The string with spaces replaced: " + outStr);


        // This block lambda reverse the case of the characters in the string.
        // It is also embedded directly into the call to changeStr().
        outStr = changeStr((str) -> {
            String resut = "";
            char ch;

            for(int i=0; i < str.length(); i++) {
                ch = str.charAt(i);
                if(Character.isUpperCase(ch))
                    resut += Character.toLowerCase(ch);
                else
                    resut += Character.toUpperCase(ch);
            }
            return resut;
        }, inStr);

        System.out.println("The string in reversed case: " + outStr);
    }
}
