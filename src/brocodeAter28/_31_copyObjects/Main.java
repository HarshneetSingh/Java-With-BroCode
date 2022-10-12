package brocodeAter28._31_copyObjects;


public class Main {
        public static void main(String[] args) {

        Car car1=new Car("swift",2022);
        Car car2=new Car("santro",2000);
        Car car3=new Car(car1);
//        car2=car1;  we can't do this for copying objects, as this car1 address will be same as car2
//           For changing diff address, we've created copy method

            car2.copy(car1);
            System.out.println(car1);
            System.out.println(car2);
            System.out.println(car3);


            System.out.println(car1.getName());
            System.out.println(car2.getName());
            System.out.println(car3.getName());

        }
}


