package brocodeAter28._35_exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

//    exception = an event that occurs  during the execution of a program ,
//                  disrupts the normal flow of instruction
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.println("enter the number1");
            int choice1 = scn.nextInt();
            System.out.println("enter the number2");
            int choice2 = scn.nextInt();
            int result = choice1 / choice2;
            System.out.println("result " + result);
        } catch (ArithmeticException e) {                          // for particular 1 error
            System.out.println("don't divide with 0 idiot");
        } catch (InputMismatchException e) {
            System.out.println("enter number silly");
        } catch (Exception e) {
            System.out.println("enter correctly");
        } finally {
            System.out.println("done");
        }
    }
}
