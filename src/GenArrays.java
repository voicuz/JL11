// Generics and arrays.
class GenA<T extends Number> {
    T ob;

    T[] vals;  // ok

    GenA(T o, T[] nums) {
        ob = o;

        // This statement is illegal.
//        vals = new T[10];  // Can't create an array of T.

        // But, this statement is OK.
        vals = nums;
    }
}

class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};

        var iOb = new GenA<Integer>(50, n);

        // Can't create an array of type-specific generic references.
//        GenA<Integer>[] gens = new GenA<Integer>[10]; // Wrong.

        // This is OK.
        GenA<?>[] gens = new GenA<?>[10];

        Double[] d = {1.1, 2.2, 3.3, 4.4, 5.5};

        var ob2 = new GenA<Double>(60.6, d);


        gens[0] = iOb;
        gens[1] = ob2;
        gens[2] = new GenA<>(2.2, n);

        System.out.println();
    }
}
