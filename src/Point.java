public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public static void main(String[] args) {
        Point p = new Point(2, 5, 8);
        System.out.println("Coordinates:");
        System.out.println("x: " + p.getX());
        System.out.println("y: " + p.getY());
        System.out.println("z: " + p.getZ());
    }
}
