package com.company;


public class printf_16_ {
    public static void main(String[] args) {
//        printf = an optional method to control , format and display text  to the console window
//                  two arguments = format strings + (objects / variable/value )
//                  % [flags] {precision] [width] [conversion- character]


//        [conversion characters]

        System.out.println("******************conversion ");

        boolean boolVal = true;
        String myString = "hello";
        int no = 12;
        char myChar = 'h';
        double no2 = 12000.3;
        // format specifiers
        System.out.printf("%s %c is it %b about %d and %f\n", myString, myChar, boolVal, no, no2);


//        [width]  only works with string and char

//          minimum numbers of  characters to be written as output
//        for ex if you will give a positive number between the string specifier  then it will give space before the variable
//        in case of negative it will give after the variable
//        spaces only will be given if the between number is greater than the length of variable AS LENGTH OF VARIABLE ALSO COUNT AS SPACES
        System.out.println("******************width");

        System.out.printf("%6c\n",myChar);
        System.out.printf("%-1s\n",myString);


//        [precision]  only works with floating-point values

//      sets number of digit of precision when outputting floating-point values
        System.out.println("******************precision");

        System.out.printf("%.1f\n",no2);


//        [flags]
//        add an affects to output based on the flag  added  to format specifiers

//        - => left-justify -> spacing
//        + => right-justify -> spacing
//        0 => numeric values  are zero-padded
//        , => comma grouping seprators if numbers > 1000;
        System.out.println("******************flags");
        System.out.printf("%,f",no2);
    }

}
