// An example of capturing a local variable from the enclosing scope.

interface MyFunc {
    int func(int n);
}

class VarCapture {
    static int nnn = 0;
    public static void main(String[] args) {
        // A local variable that can be captured.
        int num = 10;


        MyFunc myLambda = (n) -> {
            // This use of num is OK. It does not modify num.
            int v = num + n;
            System.out.println(nnn);
            nnn = 7;

            // However the following is illegal because it attempts to modify
            // the value of num.
//            num++;
            return v;
        };

        // Us the lambda. This will display 18.
        System.out.println(myLambda.func(8));

        // The following line of code will also cause an error, because
        // it would remove the effectively final status from num.
//        num = 9;
    }
}
