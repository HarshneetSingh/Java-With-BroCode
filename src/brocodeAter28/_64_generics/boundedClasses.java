package brocodeAter28._64_generics;

public class boundedClasses<Things extends Number, Things2 > {
    Things x;
    Things2 y;
    boundedClasses(Things x, Things2 y) {
        this.x = x;
        this.y = y;
    }
    public Things2 print() {
        return y;
    }

}
