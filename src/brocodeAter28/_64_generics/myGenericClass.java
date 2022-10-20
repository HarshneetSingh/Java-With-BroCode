package brocodeAter28._64_generics;

public class myGenericClass<Things,Things2> {
    Things x;
    Things2 y;
    myGenericClass(Things x, Things2 y) {
        this.x = x;
        this.y = y;
    }

    public Things2 print() {
        return y;
    }
}
