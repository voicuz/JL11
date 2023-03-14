
// Demonstrate the traditional use of the instanceof operator.
class Alpha {
    // ...
}

class Beta extends Alpha {
    // ..
}

class Gamma extends Alpha {
    // ..
}

class InstanceOfDemo {
    public static void main(String[] args) {
        Alpha alpha = new Alpha();
        Beta beta = new Beta();
        Gamma gamma = new Gamma();
        boolean b;

        // instanceof succeeds when the object is the same
        // type as the specified type.
        if(alpha instanceof Alpha)
            System.out.println("alpha is instance of Alpha");
        if(beta instanceof Beta)
            System.out.println("beta is instance of Beta");
        if(gamma instanceof Gamma)
            System.out.println("gamma is instance of Gamma");

        // instanceof succeeds when the object is an instance
        // of a subclass of the specified type.
        if(beta instanceof Alpha)
            System.out.println("beta is also a instance of Alpha");
        if(gamma instanceof Alpha)
            System.out.println("gamma is also a instance of Alpha");


        // This won't compile because gamma is not an instance of Beta
        // or a subclass of Beta.
//        if(gamma instanceof Beta) System.out.println("wrong");

        if(alpha instanceof Gamma) {
            System.out.println("alpha is a instance of Beta and can be cast");
            beta = (Beta) alpha;
        }

        b = alpha instanceof Gamma;
        System.out.println(b);

        // Now make an Alpha reference refer to a Beta object.
        alpha = beta;

        // Because alpha refers to a Beta, this if will succeed and
        // alpha can be cast to Beta.
        if(alpha instanceof Beta) {
            System.out.println("alpha can be cast to Beta");
            beta = (Beta) alpha;
        }

//        gamma = (Gamma) alpha;
//        System.out.println(b);

        // This instanceof will fail because alpha refers to a Beta
        // object, which cannot be cast to Gamma. Thus, it prevents
        // a runtime error.
        if(alpha instanceof Gamma) {
            // This won't execute.
            gamma = (Gamma) alpha; // error.
        }
    }
}
