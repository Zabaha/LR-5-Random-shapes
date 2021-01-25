package RandomShapes;

import java.awt.*;

public abstract class Shape {
    private int red;
    private int green;
    private int blue;
    private int X;
    private int Y;

    public Shape() {
        red = (int)(Math.random() * 255);
        green = (int)(Math.random() * 255);
        blue = (int)(Math.random() * 255);
        X = (int)(Math.random() * 20);
        Y = (int)(Math.random() * 20);
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getX() {
        return X;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getY() {
        return Y;
    }

   public void set_color(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
   }

   public Color get_color(){
        return new Color(red, green, blue);
   }
}