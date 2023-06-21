package ConstructorRefDemo;

// Demonstrate a constructor reference.

// MyFunc is a functional interface whose method returns a MyClass reference.
interface MyFunc<T> {
 MyClass func(T s);

}

interface MyFunc2 {
 MyClass func();

}

interface MyClassArrayCreator {
 MyClass[] func(int n);
}

interface MyArrayCreator<T> {
 T[] func(int n);
}

class MyClass<T> {
// private String str;
 private T t;

 // This constructor takes an argument.
 MyClass(T s) {
  t = s;
 }

 // This is the default constructor.
// MyClass() {str = "2";}

 // ...

 T getObj() {
  return t;
 }
}

class ConstructorRefDemo {
 public static void main(String[] args) {
  // Create a reference to the MyClass constructor.
  // Because func() in MyFunc takes an argument, new refers to the parametrized
  // constructor in MyClass, not the default constructor.
  MyFunc<Integer> myClassCons = MyClass<Integer>::new;
//  MyFunc2 myClassCons2 = MyClass::new;

  // Create an instance of MyClass through that constructor reference.
  MyClass mc = myClassCons.func(2);
//  MyClass mc2 = myClassCons2.func();
  MyClass ob = new MyClass("object");

//  Integer i = 5;
//  double d = i.doubleValue();

  // Use the instance of MyClass just created.
  System.out.println("str in mc is " + mc.getObj());
//  System.out.println("str in mc2 is " + mc2.getStr());
  System.out.println("str in mc is " + ob.getObj());


  MyClassArrayCreator mcArrayCons = MyClass[]::new;
  MyClass[] a = mcArrayCons.func(3);
  for(int i=0; i<3; i++) {
   a[i] = new MyClass(i);
  }

  for(int i=0; i<3; i++)
   System.out.println(a[i].getObj());

  MyArrayCreator<Double> mcArrayCons2 = Double[]::new;
  Double[] obInt = mcArrayCons2.func(5);

  for(int i=0; i<3; i++) {
   obInt[i] = new Double(i);
  }
  for(int i=0; i<3; i++)
   System.out.println(obInt[i]);

  MyArrayCreator<MyClass> mcArrayCons3 = MyClass[]::new;
  MyClass[] obStr = mcArrayCons3.func(5);

  for(int i=0; i<3; i++) {

   obStr[i] = new MyClass<>((char) ('A'+i));
  }
  for(int i=0; i<3; i++)
   System.out.println(obStr[i].getObj());

 }
}
