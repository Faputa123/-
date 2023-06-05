package mypackage;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class Balls extends Thread {
    private JPanel panel;
    private int step;
    private int size;
    private int x0;
    private int y0;

    public Balls(JPanel panel, int step, int size, int x0, int y0) {
        super();
        this.panel = panel;
        this.step = step;
        this.size = size;
        this.x0 = x0;
        this.y0 = y0;
    }

    @Override
    public void run() {
        int x = x0; int y = y0; int xdir = +1; int ydir = +1;
        panel.setBackground(Color.white);
        Graphics g = panel.getGraphics();
        while(true) {
            g.setColor(Color.pink);
            g.fillOval(x,y,size,size);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.setColor(Color.blue);
            g.fillOval(x,y,size,size);

            if(x > panel.getWidth() - size) { xdir = -1;}
            if(x < size) { xdir = +1;}
            if(y > panel.getHeight() - size) { ydir = -1;}
            if(y < size) { ydir = +1;}
            
            x += xdir * step;  y += ydir * step;
        }
    }

}