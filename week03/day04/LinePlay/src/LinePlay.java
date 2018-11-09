import javax.swing.*;
import java.awt.*;
import java.util.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class LinePlay {

    public static void mainDraw(Graphics graphics) {

        ArrayList<Integer> numlist = new ArrayList<Integer>();
        numlist.add(4);
        numlist.add(16);
        numlist.add(32);
        numlist.add(64);

        int randomIndex = (int) (Math.random() * numlist.size());
        int randomValue = numlist.get(randomIndex);

        int startX = WIDTH / randomValue;           // or ignore all the "arraylist/random stuff" above and type in 4/16/32/64 to startX and startY value, like startX = WIDTH/64;
        int startY = HEIGHT / randomValue;

        for (int i = 0; i < WIDTH; i++) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, startY + i * startY, startX + i * startX, HEIGHT);

            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(startX + i * startX, 0, WIDTH, startY + i * startY);

            graphics.setColor(Color.ORANGE);
            graphics.drawLine(0, HEIGHT-i*startY, 0+i*startX, 0);

            graphics.setColor(Color.CYAN);
            graphics.drawLine(0+i*startX, HEIGHT, WIDTH, HEIGHT-i*startY);

        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
