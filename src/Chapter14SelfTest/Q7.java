package Chapter14SelfTest;

// Create a block lambda that computes the factorial of an integer. Demonstrate its use.
// Use NumericFunc, shown in this chapter, for the functional interface.

interface NumericFunc {
    int fact(int n);
}

class Q7 {
    public static void main(String[] args) {
        NumericFunc test = n -> {
            int num = 1;
            for(int i=2; i<=n; i++)
                num = num * i;
            return num;
        };

        System.out.println("Factorial of 7 is " + test.fact(7));
    }
}
