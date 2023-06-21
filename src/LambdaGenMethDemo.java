interface TestGen<T> {
    boolean test(T n, T m);
}

class MyClassGen<T> {
    static <T> boolean myGenMeth(T x, T y) {
        boolean result = false;
        // ..
        return result;
    }
}

class LambdaGenMethDemo {
    public static void main(String[] args) {

        TestGen<Integer> mRef = MyClassGen::<Integer>myGenMeth;

    }

}
