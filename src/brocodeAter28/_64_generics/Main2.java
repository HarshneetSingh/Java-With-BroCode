package brocodeAter28._64_generics;

public class Main2 {
    public static void main(String[] args) {

//        FOR MAKING  GENERIC CLASSES YOU HAVE TO FOLLOW THESE STEPS WHILE INITIALIZING DATA TYPE

//        ClassName<REFERENCE DATA TYPE WHICH YOU'RE SENDING TO CONSTRUCTOR> NAME = NEW ClassName<>();

        myGenericClass<Integer,String> myInt= new myGenericClass<>(1,"HELLO");
        myGenericClass<String, String> myString= new myGenericClass<>("stay focused ","pls harshi");
        myGenericClass<Double,Integer> myDouble= new myGenericClass<>(100.0,1);

        System.out.println(myInt.print());
        System.out.println(myDouble.print());
        System.out.println(myString.print());

//        bounded types = you can create  the objects of a generics class to have data of specific derived types ex.number

        boundedClasses<Double,Integer> boundTypes= new boundedClasses<>(1.3,3);
//     boundedClasses<Char,Integer> boundTypes= new boundedClasses<>(1.3,3);   you cant do this
        System.out.println(boundTypes.print());
    }
}
