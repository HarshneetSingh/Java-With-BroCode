package brocodeAter28._29_;


public class A_accessModifiers {

     /*  modifiers                 class      package        subclass      World

         public                      Y           Y              Y            Y
         protected                   Y           Y              Y            N
         Default (no modifier)       Y           Y              N            N
         private                     Y           N              N            N

     */

    //    default modifier

    //    it can be access within the class or within the same package
          String defaultVar = "hello this is default";


    //    Public modifier

    //    it can be access within the class or within the same package or diff package

           public String publicVar = "hello this is public";

    //     Protected modifier

    //     it can be access within the class package, but in case of diff package it will work on subclass only(inherited class)

           protected String protectedVar="hello this is protected";

    //     private modifier

    //     it can be access within the same class only

            private String privateVar="hello this is private";

    public static void main(String[] args) {
        A_accessModifiers a=new A_accessModifiers();
        System.out.println(a.privateVar);
    }
}
