// Demonstrate a raw type.
class Gen<T> {
    T ob; // declare an object of type T.

    // Pass the constructor a reference to an object of type T.
    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }
}

// Demonstrate raw type.
class RawDemo {
    public static void main(String[] args) {

        // Create a Gen object for Integers.
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Create a Gen object for Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");

        // Create a raw-type Gen object and give it a Double value.
        Gen raw = new Gen(98.6);
        System.out.println(raw);

        // Cast here is necessary because type is unknown.
        double d = (Double) raw.getOb();
        System.out.println("value: " + d);

        // The use of raw type can lead to run-time exceptions.
        // Here are some examples.

        // The next cast causes a run-time error.
//        int i = (Integer) raw.getOb();

        // This assignment overrides type safety.
        strOb = raw;  // OK, but potentially wrong.
        Gen raw2 = strOb;
        double d2 = (Double) raw2.getOb();
        System.out.println(d2);
//        String str = strOb.getOb();

        // This assignment also overrides type safety.
        raw = iOb;  // OK, but potentially wrong.
        System.out.println(raw);
        d = (Integer) raw.getOb();
        System.out.println(d);
    }
}
