class Pair<T, E> {
    T a;
    E b;
    
    void setData(T x, E y) {
        a = x;
        b = y; 
    }
    
    T getFirst() {
        return a;
    }
    
    E getSecond() {
        return b;
    }
}

class Check {
    public static void main(String[] args) {
        Pair<Integer, String> p1;
        Pair<String, Double> p2;
        p1 = new Pair<>();
        p2 = new Pair<>();
        p1.setData(10, "smile");
        p2.setData("taught", 2.3);
        
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());
    }
}
