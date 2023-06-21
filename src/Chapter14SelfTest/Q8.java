package Chapter14SelfTest;

/* Create a generic functional interface called MyFunc<T>. Call its abstract method func(). Have func() return
a reference of type T. Have it take a parameter of type T. (Thus, MyFunc is a generic version of NumericFunc shown in the chapter.)
Demonstrate its use by rewriting your answer to question 7 so it uses MyFunc<T> rather than NumericFunc.
 */

interface MyFunc<T> {
    T func(T n);
}

class Q8 {
    public static void main(String[] args) {
        MyFunc<Double> test = n -> {
            var num = (n*0) + 1;
            for(int i=2; i<=n; i++)
                num = num * i;
            return num;
        };

        System.out.println("Factorial of 7 is " + test.func(7.5));
    }
}
