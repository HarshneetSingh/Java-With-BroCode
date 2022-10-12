package brocodeAter28._32_interface;

public class Fish implements Predator,Prey{


    @Override
    public void hunt() {
        System.out.println("larger fish eats small fish");
    }

    @Override
    public void flee() {
        System.out.println("small fish runs from large fish");
    }
}
