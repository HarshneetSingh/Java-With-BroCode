package brocodeAter28._31_copyObjects;

public class Car {
    private String engine="the best engine";
    private int year;
    private String name;

    Car(String name ,int year){
        this.setName(name);
        this.setYear(year);
    }
    Car(Car x){
        this.copy(x);
    }
//    making getter and setter method to access it

    public void setName(String name){
        this.name=name;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public void copy(Car x){
        this.name=x.getName();
        this.year=x.getYear();
    }
}
