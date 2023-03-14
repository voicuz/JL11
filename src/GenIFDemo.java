// A generic interface example.

// A generic containment interface.
// This interface implies that an implementing
// class contains one or more values.
interface Containment<T> {
    // The contains() method tests if a
    // specific item is contained within
    // an object that implements Containment.
    boolean contains(T o);
}

// Implement Containment using an array to
// hold the values.
class MyClass2<T> implements Containment<T> {
    T[] arrayRef;

    MyClass2(T[] o) {
        arrayRef = o;
    }

    // Implement contains()

    @Override
    public boolean contains(T o) {
        for(T x : arrayRef)
            if(x.equals(o)) return true;
        return false;
    }
}

class GenIFDemo {
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3};

        MyClass2<Integer> ob = new MyClass2<>(x);

        if(ob.contains(2))
            System.out.println("2 is in ob.");
        else
            System.out.println("2 is not in ob.");

        if(ob.contains(5))
            System.out.println("5 is in ob.");
        else
            System.out.println("5 is not in ob.");

        // The following is illegat because ob
        // is an Integer containment and 9.25 is
        // a Double Value.
//        if(ob.contains(9.25)) // Illegal.
//            System.out.println("9.25 is in ob.");
    }
}
