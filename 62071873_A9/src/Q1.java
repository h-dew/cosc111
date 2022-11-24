public class Q1 {
    public static void main(String[] args) throws Exception {
        
        Cuboid cuboid0 = new Cuboid();
        Cuboid cuboid1 = new Cuboid(8, 3.5, 5.9, "Green");

        System.out.println("Cuboid 0: ");
        cuboid0.displayInfo();

        System.out.println("Cuboid 1: ");
        cuboid1.displayInfo();

    }

    static class Cuboid {
        double l;
        double w;
        double h;

        String color;

        public Cuboid(double l, double w, double h, String color) {
            this.l = l;
            this.w = w;
            this.h = h;
            this.color = color;
        }

        public Cuboid() {
            this.l = 1;
            this.w = 1;
            this.h = 1;
            this.color = "White";
        }

        public double getVolume() {
            return l * w * h;
        }

        public double getSurfaceArea() {
            return 2 * (l * w + w * h + h * l);
        }

        public void displayInfo() {
            System.out.println("\t" + "Color: " + color);
            System.out.println("\t" + "Dimensions: " + l + " x " + w + " x " + h);
            System.out.println("\t" + "Surface Area: " + getSurfaceArea());
            System.out.println("\t" + "Volume: " + getVolume());

        }
    }
}
