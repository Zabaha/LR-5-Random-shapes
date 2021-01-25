package RandomShapes;

public class Triangle extends Shape{
    @Override
    public int getX() {
        return (int)(Math.random() * 100 + 20);
    }

    @Override
    public int getY() {
        return (int)(Math.random() * 100 + 20);
    }
}
