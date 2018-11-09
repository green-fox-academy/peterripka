import javax.swing.*;
import java.awt.*;
import java.util.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics) {

        // ArrayList created, to store divider numbers
        ArrayList<Integer> numlist = new ArrayList<Integer>();
        numlist.add(1);
        numlist.add(4);
        numlist.add(16);
//        numlist.add(32);
//        numlist.add(64);

        // random divider chosen from the list above
        int randomIndex = (int) (Math.random() * numlist.size());
        int divider = numlist.get(randomIndex);

        int nuWidth = WIDTH / divider;


        for (int i = 0; i < divider; i++) {
            for (int j = 0; j < divider; j++) {
                for (int k = 0; k < nuWidth; k += nuWidth / 16) {
                    graphics.setColor(Color.GREEN);
                    graphics.drawLine(j * (nuWidth), (i * nuWidth) + k, (j * nuWidth) + k, ((i * (nuWidth)) + (WIDTH / divider)));

                    graphics.setColor(Color.MAGENTA);
                    graphics.drawLine((j * nuWidth) + k, (i * nuWidth), ((j * (nuWidth)) + (nuWidth)), (i * nuWidth) + k);

                    // Two additional sides, not finished..
                    // graphics.setColor(Color.ORANGE);
                    // graphics.drawLine(0, HEIGHT - i * startY, 0 + i * startX, 0);
                    // graphics.setColor(Color.CYAN);
                    // graphics.drawLine(0 + i * startX, HEIGHT, WIDTH, HEIGHT - i * startY);

                }
            }
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