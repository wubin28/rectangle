package tiles;

public class Rectangle implements Shape{

    private final int width;
    private final int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    @Override
    public double area() {
        return width * length;
    }
}
