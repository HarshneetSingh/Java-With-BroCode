package brocodeAter28._30_encapsulation;

public class Main {

    /*
    *       encapsulation = attributes of a class will be hidden or private,
    *                       can be accessed only through methods (getter and setters )
    *                       you should make attributes private if you don't have a reason to make them public/private
    *
    * */
    public static void main(String[] args) {

        Car car=new Car("swift",2022);

        car.setYear(2024);

        System.out.println(car.getClass());
        System.out.println(car.getYear());

    }
}
