/*

// A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.

class Gen<T> {
    T ob;  // declare an object of type T.

    // Pass the constructor a reference to
    // an object of type T.
    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }

    // Show type of T.
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

// Demonstrate the generic class
class GenDemo {
    public static void main(String[] args) {
        // Create a Gen reference for Integers.
        Gen<Integer> iOb;

        // Create a Gen<Integer> object and assign its
        // reference to iOb. Notice the use of autoboxing
        // to encapsulate the value 88 within an integer object.
//        iOb = new Gen<Integer>(88);
        iOb = new Gen<>(88);

        // Show the type of data used by iOb.
        iOb.showType();

        // Get the value in iOb. Notice that
        // no cast is needed.
        int v = iOb.getOb();
        System.out.println("Value: " + v);

        System.out.println();

        // Create a Gen object for Strings.
        Gen<String> strOb = new Gen<>("Generics Test");
//        Gen<String> strOb = new Gen<String>("Generics Test");

        // Show the type of data used by strOb.
        strOb.showType();

        // Get value of strOb. Again, notice
        // that no cast is needed.
        String str = strOb.getOb();
        System.out.println("Value " + str);

//        Gen<int> intOb = new Gen<int>(88);  // Primitive types not accepted.
        Gen<Integer> iOb2;
        iOb2 = iOb;

        v = iOb2.getOb();
        System.out.println("Value2: " + v);
    }
}


 */