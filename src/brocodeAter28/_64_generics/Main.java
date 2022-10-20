package brocodeAter28._64_generics;

public class Main {
    public static void main(String[] args) {
        /*        for generics methods
        *              generics = enable types (classes and interface ) to be parameters when defining :
        *                         classes , interfaces and methods
        *                         a benifits is to eliminate the need to create multiple versions
        *                         of methods or classes for various data types
        *                          use 1 versions for all reference types
        * */

        Main clas= new Main();
        
        Integer[] number ={1,2,3,4,5,6,7,8,9};
        Double[] flot ={1.4,2.5,4.5,5.5,6.5,7.5};
        String[] string ={".1",".2",".3",".4",".5"};


        clas.displayArr(number);
        clas.displayArr(flot);
        clas.displayArr(string);

        System.out.println(clas.getFirstElem(number));
        System.out.println(clas.getFirstElem(flot));
        System.out.println(clas.getFirstElem(string));

    }
    public <Thing> void displayArr(Thing[] array ) {

        for (Thing x: array) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public <Thing> Thing getFirstElem(Thing[] array ) {
       return array[0] ;
    }
}
