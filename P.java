class Box {
    double width;
    double height;
    double depth;

    // Compute and return volume
    double volume() {
        return width * height * depth;
    }

    // Sets dimensions of box
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class P {
    public static void main(String args[]) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // Initialize each box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // Get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of the first box is " + vol);

        // Get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of the second box is " + vol);
    }
}
