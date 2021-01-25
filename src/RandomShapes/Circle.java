package RandomShapes;

public class Circle extends Shape{
    private int radius;

    public Circle() {
        radius = (int)(Math.random() * 100 + 30);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
