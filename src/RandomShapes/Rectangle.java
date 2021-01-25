package RandomShapes;

public class Rectangle extends Shape{
    private int width;
    private int length;
    public Rectangle(){
        width = (int)(Math.random() * 100 + 30);
        length = (int)(Math.random() * 100 + 30);
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
