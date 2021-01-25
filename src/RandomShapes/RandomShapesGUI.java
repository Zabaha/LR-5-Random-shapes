package RandomShapes;
import java.awt.*;
import javax.swing.*;

public class RandomShapesGUI extends JFrame{
    MyPanel [] shapes = new MyPanel[20];
    public RandomShapesGUI(){
        super("Random shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 700);
        setLayout(new GridLayout(4,5));
        for(int i = 0; i < shapes.length; i++) {
            shapes[i] = new MyPanel();
            add(shapes[i]);
        }
    }
}

class MyPanel extends JPanel{
    public void paintComponent(Graphics g){
        int rand = (int)(Math.random() * 4 + 1);
        switch (rand){
            case 1:
                Circle cir = new Circle();
                g.setColor(cir.get_color());
                g.fillOval(cir.getX(), cir.getY(), cir.getRadius(), cir.getRadius());
                break;
            case 2:
                Rectangle rec = new Rectangle();
                g.setColor(rec.get_color());
                g.fillRect(rec.getX(), rec.getY(), rec.getWidth(), rec.getLength());
                break;
            case 3:
                Square sqr = new Square();
                g.setColor(sqr.get_color());
                g.fillRect(sqr.getX(), sqr.getY(), sqr.getSide(), sqr.getSide());
                break;
            case 4:
                Triangle tri = new Triangle();
                g.setColor(tri.get_color());
                g.fillPolygon(new int[] {tri.getX(), tri.getX() , tri.getX()}, new int[] {tri.getY(),tri.getY(), tri.getY()}, 3);
                break;
        }
    }
}

