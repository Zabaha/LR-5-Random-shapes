package RandomShapes;

public class Square extends  Shape{
    private int side;
    public Square(){
        side = (int)(Math.random() * 100 + 30);
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
