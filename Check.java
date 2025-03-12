class Operations<T extends Number, E extends Number, U extends Number> {
    T a;
    E b;
    U c;

    void setData(T x, E y, U z) {
        a = x;
        b = y;
        c = z;
    }

    double getFirst() {
        return a.doubleValue() + b.doubleValue() + c.doubleValue();
    }

    double getSecond() {
        return a.doubleValue() * b.doubleValue() * c.doubleValue();
    }

    double getThird() {
        if (b.doubleValue() != 0) {
            return a.doubleValue() / b.doubleValue();
        } else {
            return Double.POSITIVE_INFINITY;
        }
    }
}

class Check {

    public static void main(String[] args) {

        Operations<Integer, Double, Integer> p1;
        Operations<Double, Integer, Float> p2;
        Operations<Double, Integer, Double> p3;

        p1 = new Operations<>();
        p2 = new Operations<>();
        p3 = new Operations<>(); 

        p1.setData(2, 2.0, 2);
        p2.setData(2.0, 2, 2.2f); 
        p3.setData(2.0, 2, 0.0); 

        System.out.println("Data for p1: " + p1.getFirst() + ", " + p1.getSecond() + ", " + p1.getThird());
        System.out.println("Data for p2: " + p2.getFirst() + ", " + p2.getSecond() + ", " + p2.getThird());
        System.out.println("Data for p3: " + p3.getFirst() + ", " + p3.getSecond() + ", " + p3.getThird());
    }
}
