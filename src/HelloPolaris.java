////INTRO TO JAVA EXERCISE
//
//public class HelloPolaris {
//
//    public static void main(String[] args) {
//
//        System.out.println("Howdy there Polaris");
//        System.out.print("Hello Po ");
//        System.out.println("lice!!!");
//
////SYNTAX,TYPES, & VARIABLES EXERCISES
//
//////#1
//        int myFavoriteNumber = 27;
//        System.out.println(myFavoriteNumber);
//////#2
////
//        String myString = ("How are you doing today?");
//        System.out.println(myString);
////
//////#3
//        String myString1 = ("A");
//        System.out.println(myString1);
//////java: variable myString is already defined in method main(java.lang.String[])
////
//////#4
//        String myString2 = ("3.14159");
//        System.out.println(myString2);
//
//
//////#5
//      long myNumber;
//        System.out.println(myNumber);
////    //java: variable myNumber might not have been initialized
////
//////#6
//      long myNumber = 3.14;
//////        //java: variable myNumber is already defined in method main(java.lang.String[])
//////
////////#7
//       long myNumber = 123L;
//////        //java: variable myNumber is already defined in method main(java.lang.String[])
//////
////////#8
//       int myNumber = 123;
//////        //java: variable myNumber is already defined in method main(java.lang.String[])
//////
////////#9
//       float myNumber = 3.14;
//////        //java: variable myNumber is already defined in method main(java.lang.String[])
//////
//////#10
//       int x = 5;
//       System.out.println(x++);
//       System.out.println(x);
////Answer: 6
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
////java: variable x is already defined in method main(java.lang.String[])
//
////#11
//        int class;
////java: not a statement
//
////#12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
////Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
////	at HelloPolaris.main(HelloPolaris.java:71)
//
////        int three = (int) "three";
////java: incompatible types: java.lang.String cannot be converted to int
//
////#13
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//
////#14
////        What happens if you assign a value to a numerical variable that is larger
//////        (or smaller) than the type can hold? What happens if you increment a numeric
//////        variable past the type's capacity?
////
//////Unlike JavaScript, decimal and integer numbers are entirely different types.
////// For the numeric types in Java, you can always assign a value of lesser precision
////// to a type of greater precision, but not the other way around.
////// For example, the value 128 could be a short or an int, but not a byte.
//
//
//
//
//
//    }
//}
