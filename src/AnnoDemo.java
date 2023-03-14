/*

// A simple annotation type.
@interface MyAnno {
    String str();
    int val();
}

class AnnoExample {
    // Annotate method
    @MyAnno(str = "Annotation Example", val=100)
    public static void myMeth(){
        System.out.println("in myMeth().");
        return;
    }
}


class AnnoDemo {
    public static void main(String[] args) {

        AnnoExample.myMeth();

    }

}


 */

// An example that uses @Deprecated.

// A simple annotation type.
@interface MyAnno {
    String str();
    int val();
}

// Deprecate class.
//@Deprecated
class MyClass {
    private String msg;

    MyClass(String m) {
        msg = m;
    }

    // Deprecate a method within a class.
    @MyAnno(str = "Annotation Example", val=100)
    String getMsg() {
        return msg;
    }
}

class AnnoDemo {
    public static void main(String[] args) {
        MyClass myObj = new MyClass("test");

        System.out.println(myObj.getMsg());
    }
}






