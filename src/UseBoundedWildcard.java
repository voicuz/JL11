class A {
    // ...
}

class B extends A {
    // ...
}

class C extends A {
    // ...
}

// Note that D does NOT extend A.
class D {
    // ...
}



// A simple generic class.
class Gen2<T> {
    T ob;

    Gen2(T o) {
        ob = o;
    }
    T getOb() {
        return ob;
    }
}



class UseBoundedWildcard {
    // Here, ? will match A or any class type
    // that extends A.
    static void test (Gen<? extends A> o) {
        // ..
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w = new Gen<>(a);
        Gen<B> w2 = new Gen<>(b);
        Gen<C> w3 = new Gen<>(c);
        Gen<D> w4 = new Gen<>(d);
        Gen<Integer> w5 = new Gen<>(5);
        Gen2<Integer> w8 = new Gen2<>(8);
        Gen<Integer> w6;
        Gen<Double> w7;

//        w5 = (Gen<Integer>) w8;
        w6 = (Gen<Integer>) w5;

        // These calls to test() are OK.
        test(w);
        test(w2);
        test(w3);


        // Can't call test() with w4 because
        // it is not an object of a class that
        // inherits A.
//        test(w4);  // Error.
//        test(w5);  // error
    }
}
