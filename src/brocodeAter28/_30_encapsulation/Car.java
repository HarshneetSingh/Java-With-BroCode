package brocodeAter28._30_encapsulation;

public class Car {
    private String engine="the best engine";
    private int year;
    private String name;

    Car(String name ,int year){
        this.setName(name);
        this.setYear(year);
    }
//    making getter and setter method to access it

    public void setName(String name){
        this.name=name;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String setName(){
        return name;
    }
    public int getYear(){
        return year;
    }
}
