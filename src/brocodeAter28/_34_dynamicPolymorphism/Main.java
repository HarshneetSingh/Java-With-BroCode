package brocodeAter28._34_dynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Animal animal;

        System.out.println("Select the animal");
        System.out.println("dog=1 || cat=2");
        int choice= scn.nextInt();

        if (choice==1){
            animal=new Dog();
            animal.Speak();
        }else if(choice==2){
            animal=new Cat();
            animal.Speak();
        }else{
            animal=new Animal();
            animal.Speak();
        }
    }
}
