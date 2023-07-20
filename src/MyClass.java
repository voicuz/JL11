class MyClassT {
    int a;
    int b;

    // Initialize a and b individually.
    MyClassT(int i, int j) {
        a = i;
        b = j;
    }

    // Use this() to initialize a and b to the same value.
    MyClassT(int i) {
        this(i, i);  // invokes MyClassT(i, i);
    }
}

class MyClassTdemo {
    public static void main(String[] args) {
        var ob = new MyClassT(3, 3);
        System.out.println(ob.a + " " + ob.b);

        var ob2 = new MyClassT(8);
        System.out.println(ob2.a + " " + ob2.b);

        System.out.println();
        System.out.println();

        ob.a = 5;
        System.out.println(ob.a + " " + ob.b);
    }
}