class area {
    static double circle(double r) {
        return 3.14 * r * r;
    }

    static double rect(double len, double bre) {
        return len * bre;
    }

    static double tri(double base, double height) {
        return 0.5 * height * base;
    }
}

class TestOverloading1 {
    public static void main(String[] args) {
        System.out.println(area.circle(10));
        System.out.println(area.rect(10, 10));
        System.out.println(area.tri(10, 10)); 
    }
}
