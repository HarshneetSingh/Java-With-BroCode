package brocodeAter28._65_Threads;

public class Main {

    /*
    *   thread = a thread of execution in a program (kind of like  a virtual cpu)
    *            the jvm allows an application ti have a multiple threads running concurrently each thread can execute
    *               parts of you code in parallel with the main thread each thread has a priority .
    *
    *            threads with higher priority are
    *           executed in preference compared to threads with lower priority
    *
    *            the jvm continues to execute threads untill iether of the following occurs
    *              1) the exit method of class runtime has been called
    *              2) all users threads have died
    *
    * when jvm starts up , there is a thread which calls the main method this thread is called 'main'
    *
    * daemon thread is a low priority thread that runs in the backgorun to perform as garbage colector
    *
    * jvm terminates itslef when all users threads are finished
    * */
    public static void main(String[] args) throws InterruptedException {
//        Thread.currentThread().setName("hello");
//        System.out.println(Thread.currentThread().getName());

//        for (int i = 0; i <3;i++) {
//            System.out.println(i);
//            Thread.sleep(1000);
//
//        }

//        System.out.println(Thread.currentThread().isAlive());


//        Thread.currentThread().setPriority(10);
//        System.out.println(Thread.currentThread().getPriority());

        System.out.println(Thread.activeCount());
    }

}
