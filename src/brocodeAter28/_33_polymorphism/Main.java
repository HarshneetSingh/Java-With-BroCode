package brocodeAter28._33_polymorphism;

public class Main {

//    polymorphism = in greek , poly =many: morphism = forms,
//                  the ability of an object to identify as more than one type
    public static void main(String[] args) {

        Bicycle bicycle=new Bicycle();
        Car car= new Car();
        Boat boat= new Boat();
        Vehicle[] categories={bicycle ,car,boat};

        for (Vehicle x:categories){
            x.go();
        }
    }
}
